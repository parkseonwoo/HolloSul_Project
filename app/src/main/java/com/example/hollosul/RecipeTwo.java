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

public class RecipeTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup  view = (ViewGroup)inflater.inflate(R.layout.recipe_card2, container, false);

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
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jhbliss.tistory.com/entry/%EC%86%8C%EC%A3%BC%EC%95%88%EC%A3%BC-%EB%B2%A0%EC%8A%A4%ED%8A%B8-9%EA%B0%80%EC%A7%80"));
                startActivity(intent);
            }
        });

        r32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=whwndud7&logNo=221474848830&proxyReferer=https:%2F%2Fwww.google.com%2F"));
                startActivity(intent);
            }
        });

        r33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jyakill.tistory.com/334"));
                startActivity(intent);
            }
        });

        r34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1boon.kakao.com/potenshop/5bf7ca836a8e510001fd0fcc"));
                startActivity(intent);
            }
        });

        r35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1boon.kakao.com/dailylife/181204_3"));
                startActivity(intent);
            }
        });

        r36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reuzelkorea.tistory.com/51"));
                startActivity(intent);
            }
        });

        r37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://happytime77.tistory.com/18"));
                startActivity(intent);
            }
        });

        r38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://skboy0314.tistory.com/9"));
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
