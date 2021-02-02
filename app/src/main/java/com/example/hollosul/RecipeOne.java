package com.example.hollosul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RecipeOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup  view = (ViewGroup)inflater.inflate(R.layout.recipe_card3, container, false);

        Button r31 = (Button) view.findViewById(R.id.r31);
        Button r32 = (Button) view.findViewById(R.id.r32);
        Button r33 = (Button) view.findViewById(R.id.r33);
        Button r34 = (Button) view.findViewById(R.id.r34);
        Button r35 = (Button) view.findViewById(R.id.r35);
        Button r36 = (Button) view.findViewById(R.id.r36);
        Button r37 = (Button) view.findViewById(R.id.r37);
        Button r38 = (Button) view.findViewById(R.id.r38);
        Button r39 = (Button) view.findViewById(R.id.r39);
        Button r310 = (Button) view.findViewById(R.id.r310);

        r31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=stewartiako&logNo=221361370682"));
                startActivity(intent);
            }
        });

        r32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=cyhaeyoung&logNo=221272474033&proxyReferer=https:%2F%2Fwww.google.com%2F"));
                startActivity(intent);
            }
        });

        r33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fmkorea.com/1437950849"));
                startActivity(intent);
            }
        });

        r34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.todayhumor.co.kr/view.php?table=cook&no=185300"));
                startActivity(intent);
            }
        });

        r35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/llthecutell/100186082582"));
                startActivity(intent);
            }
        });

        r36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PFwUTf0BE8E"));
                startActivity(intent);
            }
        });

        r37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dvdprime.com/g2/bbs/board.php?bo_table=comm&wr_id=9512812"));
                startActivity(intent);
            }
        });

        r38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rkgml.tistory.com/103"));
                startActivity(intent);
            }
        });

        r39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.82cook.com/entiz/read.php?bn=35&num=780837&page=10380"));
                startActivity(intent);
            }
        });

        r310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dk.asiae.co.kr/article/2020031913424467635"));
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
