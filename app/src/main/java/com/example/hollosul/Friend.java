package com.example.hollosul;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hollosul.database.NoteDatabase;
import com.example.hollosul.database.datamodel.Note;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Friend extends AppCompatActivity {
    private NotesAdapter adapter;
    private List<Note> notes = new ArrayList<>();
    private RecyclerView friend_rv;
    private TextView noNotes;
    private NoteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend);

        // friend
        friend_rv = findViewById(R.id.friend_rv);
        noNotes = findViewById(R.id.empty_notes_view);
        db = new NoteDatabase(this);  // SQLite DB 생성되고 테이블이 만들어짐
        notes.addAll(db.getAllNotes()); // SQLite DB에서 레코드 전체 검색하고 리스트로 저장
        adapter = new NotesAdapter(this, notes);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        friend_rv.setLayoutManager(manager);
        friend_rv.setAdapter(adapter);
        friend_rv.addOnItemTouchListener(new RecyclerTouchListener(this, friend_rv, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {

            }

            @Override
            public void onLongClick(View view, int position) {
                showActionDialog(position);
            }
        }));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNoteDialog(false, null, -1);
            }
        });

        // 저장된 데이터가 있으면 No diaries found 메세지가 안보이도록 함.
        if(notes.size() > 0) noNotes.setVisibility(View.GONE);
        else noNotes.setVisibility(View.VISIBLE);
    }

    // 데이터 한 건 생성하고 SQLite DB에 저장
    private void createNote(String note, String money) {
        long id = db.insertNote(note, money);
        Note n = db.getNote(id);
        if(n != null) {
            notes.add(0,n);
            adapter.notifyDataSetChanged();
            // 저장된 데이터가 있으면 No diaries found 메세지가 안보이도록 함.
            if(notes.size() > 0) noNotes.setVisibility(View.GONE);
            else noNotes.setVisibility(View.VISIBLE);
        }
    }
    // 데이터 변경하기
    private void updateNote(String note, String money, int position) {
        Note n = notes.get(position);
        n.setNote(note);
        n.setMoney(money);

        notes.set(position, n);  // 리스트에서 해당 객체를 변경
        adapter.notifyDataSetChanged();
        // 저장된 데이터가 있으면 No diaries found 메세지가 안보이도록 함.
        if(notes.size() > 0) noNotes.setVisibility(View.GONE);
        else noNotes.setVisibility(View.VISIBLE);
    }

    private void showNoteDialog(final boolean shouldUpdate, final Note note, final int position) {
        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(getApplicationContext());
        View view = layoutInflaterAndroid.inflate(R.layout.note_dialog, null);

        AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(Friend.this);
        alertDialogBuilderUserInput.setView(view);

        final EditText inputNote = view.findViewById(R.id.note);
        final EditText inputMoney = view.findViewById(R.id.money);
        TextView dialogTitle = view.findViewById(R.id.dialog_title);
        dialogTitle.setText(!shouldUpdate ? getString(R.string.lbl_new_note_title) : getString(R.string.lbl_edit_note_title));

        if (shouldUpdate && note != null) {
            inputNote.setText(note.getNote());
        }
        alertDialogBuilderUserInput
                .setCancelable(false)
                .setPositiveButton(shouldUpdate ? "update" : "save", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogBox, int id) {

                    }
                })
                .setNegativeButton("cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogBox, int id) {
                                dialogBox.cancel();
                            }
                        });

        final AlertDialog alertDialog = alertDialogBuilderUserInput.create();
        alertDialog.show();

        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show toast message when no text is entered
                if (TextUtils.isEmpty(inputNote.getText().toString())) {
                    Toast.makeText(Friend.this, "Enter note!", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    alertDialog.dismiss();
                }
                String money = inputMoney.getText().toString();

                // check if user updating note
                if (shouldUpdate && note != null) {
                    // update note by it's id
                    updateNote(inputNote.getText().toString(), money, position);
                } else {
                    // create new note
                    createNote(inputNote.getText().toString(), money);
                }
            }
        });
    }

    private void showActionDialog(int position) {
        CharSequence colors[] = new CharSequence[]{"Edit", "Delete"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose option");
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i == 0) {
                    showNoteDialog(true, notes.get(position), position);
                }
                else {
                    deleteNote(position);
                }
            }
        });
        builder.show();
    }

    private void deleteNote(int position) {
        notes.remove(position);

        // 저장된 데이터가 있으면 No diaries found 메세지가 안보이도록 함.
        if(notes.size() > 0) noNotes.setVisibility(View.GONE);
        else noNotes.setVisibility(View.VISIBLE);

        adapter.notifyItemRemoved(position);
        adapter.notifyItemRangeChanged(position, notes.size());
    }

}