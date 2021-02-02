package com.example.hollosul.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.hollosul.database.datamodel.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteDatabase extends SQLiteOpenHelper {
    private static final String DB_NAME = "notesdb";
    private static final int DB_VERSION = 1;

    // 생성자에서 데이터베이스 생성하기
    public NoteDatabase(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // Table 생성하기
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Note.CREATE_TABLE);
    }

    // notesdb 데이터베이스를 변경할 때. 스키마를 변경해야 할 때
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    // SELECT ALL : 모든 레코드 검색하기
    public List<Note> getAllNotes() {
        List<Note> notes = new ArrayList<>();
        // SQLite DB에서 레코드 검색한 다음 notes에 저장하기
        String sql = "SELECT * FROM " + Note.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase(); // DB open
        Cursor cursor = db.rawQuery(sql, null); // 검색된 레코드 집합에서 현재 레코드를 가리키는 포인터
        if(cursor.moveToFirst()) {
            do { // 커서가 가리키는 레코드의 컬럼값을 읽어서 Note 객체 생성
                Note note = new Note(cursor.getInt(cursor.getColumnIndex(Note.COLUMN_ID)),
                        cursor.getString(cursor.getColumnIndex(Note.COLUMN_NOTE)),
                        cursor.getString(cursor.getColumnIndex(Note.COLUMN_CONTENT)));
                notes.add(note);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return notes;
    }
    // INSERT
    public long insertNote(String note, String money) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Note.COLUMN_NOTE, note);
        values.put(Note.COLUMN_CONTENT, money);
        long id = db.insert(Note.TABLE_NAME, null, values);
        db.close();
        return id;
    }

    // SELECT : 한 건 검색
    public Note getNote(long id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(Note.TABLE_NAME,
                new String[]{Note.COLUMN_ID, Note.COLUMN_NOTE, Note.COLUMN_CONTENT},
                Note.COLUMN_ID + "=?", new String[]{String.valueOf(id)},null,null,null,null);
        if(cursor != null) cursor.moveToFirst();
        Note note = new Note(cursor.getInt(cursor.getColumnIndex(Note.COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(Note.COLUMN_NOTE)),
                cursor.getString(cursor.getColumnIndex(Note.COLUMN_CONTENT)));
        cursor.close();
        db.close();
        return note;
    }
}









