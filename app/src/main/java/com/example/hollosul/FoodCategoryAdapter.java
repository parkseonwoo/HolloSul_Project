package com.example.hollosul;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodCategoryAdapter extends RecyclerView.Adapter<com.example.hollosul.FoodCategoryAdapter.AlbumViewHolder> {
    private Context context;
    private List<FoodCategory> albumList;

    public FoodCategoryAdapter(Context context, List<FoodCategory> albumList) {
        this.context = context;
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_card, parent, false); // parent에 연결해줌
        return new AlbumViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final AlbumViewHolder holder, int position) {
        // 데이터를 연결해주는 부분
        final FoodCategory album = albumList.get(position);  // 오브젝트
        holder.title.setText(album.getName());
        holder.sub_title.setText(album.getSub_title());
        holder.thumbnail.setImageResource(album.getThumbnail());
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FoodDetail.class);
                view.getContext().startActivity(intent);
            }
        });

    }
    private void showPopupMenu(View view) {
        final PopupMenu popup = new PopupMenu(context, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                return false;
            }
        });
        popup.show();
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    public class AlbumViewHolder extends RecyclerView.ViewHolder {
        public TextView title, sub_title;
        public ImageView thumbnail;
        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            sub_title = itemView.findViewById(R.id.sub_title);
            thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }
}
