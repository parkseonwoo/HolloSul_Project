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

public class RecipeFour extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup  view = (ViewGroup)inflater.inflate(R.layout.recipe_card4, container, false);

        Button r31 = (Button) view.findViewById(R.id.r31);
        Button r32 = (Button) view.findViewById(R.id.r32);
        Button r33 = (Button) view.findViewById(R.id.r33);
        Button r34 = (Button) view.findViewById(R.id.r34);
        Button r35 = (Button) view.findViewById(R.id.r35);
        Button r36 = (Button) view.findViewById(R.id.r36);
        Button r37 = (Button) view.findViewById(R.id.r37);
        Button r38 = (Button) view.findViewById(R.id.r38);

        r31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=ygbori&logNo=220506571871&proxyReferer=https:%2F%2Fwww.google.com%2F"));
                startActivity(intent);
            }
        });

        r32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://likeinfo1587.tistory.com/54"));
                startActivity(intent);
            }
        });

        r33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://onriu.tistory.com/7"));
                startActivity(intent);
            }
        });

        r34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mrtt.news/news/articleView.html?idxno=291"));
                startActivity(intent);
            }
        });

        r35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://amyzzung.tistory.com/1111"));
                startActivity(intent);
            }
        });

        r36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://food.chosun.com/site/data/html_dir/2017/04/07/2017040701392.html"));
                startActivity(intent);
            }
        });

        r37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HPeeutvIp78"));
                startActivity(intent);
            }
        });

        r38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1boon.kakao.com/p/tag/%EB%A7%89%EA%B1%B8%EB%A6%AC%EC%95%88%EC%A3%BC%EC%B6%94%EC%B2%9C"));
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
