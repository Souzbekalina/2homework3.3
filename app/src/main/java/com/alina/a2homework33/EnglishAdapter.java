package com.alina.a2homework33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EnglishAdapter extends RecyclerView.Adapter<EnglishViewHolder> {
    private ArrayList<String> EnglishList;

    public EnglishAdapter(ArrayList<String> EnglishList) {
        this.EnglishList=EnglishList;

    }

    @NonNull
    @Override
    public EnglishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EnglishViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_english,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull EnglishViewHolder holder, int position) {
     holder.bind(EnglishList.get(position));

    }

    @Override
    public int getItemCount() {
        return EnglishList.size();
    }
}
