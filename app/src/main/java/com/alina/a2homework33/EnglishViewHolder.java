package com.alina.a2homework33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EnglishViewHolder extends RecyclerView.ViewHolder {

    private TextView tvEnglish;
    public EnglishViewHolder(@NonNull View itemView) {
        super(itemView);
        tvEnglish=itemView.findViewById(R.id.tv_english);
    }
    void bind(String english){
        tvEnglish.setText(english);

    }
}
