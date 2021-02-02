package com.example.hollosul;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hollosul.database.datamodel.Note;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<com.example.hollosul.NotesAdapter.MyViewHolder> {
    private Context context;
    private List<Note> notes;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView note, dot, money;

        public MyViewHolder(View view) {
            super(view);
            note = view.findViewById(R.id.note);
            dot = view.findViewById(R.id.dot);
            money = view.findViewById(R.id.moneytext);
        }
    }

    public NotesAdapter(Context context, List<Note> notes) {
        this.context = context;
        this.notes = notes;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //super.onBindViewHolder(holder, position, payloads);
        Note note = notes.get(position);
        holder.note.setText(note.getNote());
        holder.money.setText(note.getMoney());
        holder.dot.setText(Html.fromHtml("&#8226;"));

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            String title = "";
            String content = "";

            @Override
            public void onClick(View view) {

                title = note.getNote();
                content = note.getMoney();

                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(context);
                View v = layoutInflaterAndroid.inflate(R.layout.note_dialog, null);

                AlertDialog.Builder ad = new AlertDialog.Builder(context);
                ad.setTitle("" + title);
                ad.setMessage("" + content);
                ad.show();
            }
        });

    }
    private String formatDate(String dateStr) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
            Date date = fmt.parse(dateStr);  // 문자열을 날짜 형식으로 변환
            SimpleDateFormat fmtOut = new SimpleDateFormat("MMM d");
            return fmtOut.format(date);
        } catch (ParseException e) {}
        return "";
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
