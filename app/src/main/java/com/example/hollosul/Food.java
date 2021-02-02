package com.example.hollosul;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Food extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FoodCategoryAdapter adapter;
    private List<FoodCategory> albumList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        // Toolbar setting
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // RecyclerView setting
        recyclerView = findViewById(R.id.recycler_view);
        albumList = new ArrayList<>();
        adapter = new FoodCategoryAdapter(this, albumList); // context, data
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(manager); // 리사이클러뷰 안에서 그리드 레이아웃이 생성
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter); // 리사이클러뷰랑 그리드레이아웃이랑 연결해줌

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.cover1).into((ImageView)findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.food1,
                R.drawable.food2,
                R.drawable.food3,
                R.drawable.food4,
                R.drawable.food5,
                R.drawable.food6,
                R.drawable.food7,
                R.drawable.food8,
                R.drawable.food9,
                R.drawable.food10,
               };

        FoodCategory a = new FoodCategory("요코쵸", "서울특별시 마포구 성미산로 161-15", covers[0]);
        albumList.add(a);

        a = new FoodCategory("바다회사랑", "서울특별시 마포구 동교로27길 60", covers[1]);
        albumList.add(a);

        a = new FoodCategory("스시올로지", "서울특별시 마포구 동교로 266-11", covers[2]);
        albumList.add(a);

        a = new FoodCategory("중화복춘", "서울특별시 마포구 동교로 220-7", covers[3]);
        albumList.add(a);

        a = new FoodCategory("사루카메 라멘", "서울특별시 마포구 연남로 15", covers[4]);
        albumList.add(a);

        a = new FoodCategory("포가", "서울특별시 마포구 성미산로 190-4 2F", covers[5]);
        albumList.add(a);

        a = new FoodCategory("슬로우캘리", "서울특별시 마포구 동교로38길 35", covers[6]);
        albumList.add(a);

        a = new FoodCategory("혼네", "서울특별시 마포구 동교로46길 42-3", covers[7]);
        albumList.add(a);

        a = new FoodCategory("다엔조", "서울특별시 마포구 연희로1길 59-2", covers[8]);
        albumList.add(a);

        a = new FoodCategory("수부니흐", "서울특별시 마포구 동교로38길 35", covers[9]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

}
