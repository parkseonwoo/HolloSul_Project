package com.example.hollosul;

import android.content.Context;
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

public class RecipeThree extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup  view = (ViewGroup)inflater.inflate(R.layout.recipe_card1, container, false);

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
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thehyundaiblog.com/entry/beer2"));
                startActivity(intent);
            }
        });

        r32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1boon.kakao.com/cemmarketing/596dd1406a8e51000158727e"));
                startActivity(intent);
            }
        });

        r33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://100golfstory.tistory.com/55"));
                startActivity(intent);
            }
        });

        r34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("hhttps://hub.zum.com/daily/49241"));
                startActivity(intent);
            }
        });

        r35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://krtiptiptip.tistory.com/716"));
                startActivity(intent);
            }
        });

        r36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mrtt.news/news/articleView.html?idxno=304"));
                startActivity(intent);
            }
        });

        r37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gramho.com/explore-hashtag/%EB%A7%A5%EC%A3%BC%EC%95%88%EC%A3%BC%EC%B6%94%EC%B2%9C"));
                startActivity(intent);
            }
        });

        r38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=E96hCj9DFD8"));
                startActivity(intent);
            }
        });

        r39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZEBeaM3B71I"));
                startActivity(intent);
            }
        });

        r310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sN8dQFXHtfA"));
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
