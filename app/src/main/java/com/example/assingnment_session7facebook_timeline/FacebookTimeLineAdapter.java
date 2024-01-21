package com.example.assingnment_session7facebook_timeline;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;


public class FacebookTimeLineAdapter extends RecyclerView.Adapter<FacebookTimeLineAdapter.postViewHolder> {

    private List<Data> list = new ArrayList<>();

    public FacebookTimeLineAdapter(@NonNull List<Data> list) {
        this.list = list;
    }

    @NonNull
    @SuppressLint("ResourceType")
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new postViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class postViewHolder extends RecyclerView.ViewHolder {

        public postViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
