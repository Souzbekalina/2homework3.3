package com.alina.a2homework33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> EnglishList;
    private EnglishAdapter adapter;
    private RecyclerView  recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_english);
        loadData();
        adapter=new EnglishAdapter(EnglishList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        EnglishList=new ArrayList<>();
        EnglishList.add("Англиский язык: English Alphabet");
        EnglishList.add("Англиский язык: The Article");
        EnglishList.add("Англиский язык: The Noun");
        EnglishList.add("Англиский язык:The Pronoun");
        EnglishList.add("Англиский язык: Adjectives");
        EnglishList.add("Англиский язык: Adverb");
        EnglishList.add("Англиский язык: Numeral");
        EnglishList.add("Англиский язык: Verbs");
        EnglishList.add("Англиский язык: Present Simple Tense");
        EnglishList.add("Англиский язык: Past Simple Tense");
        EnglishList.add("Англиский язык: Future Simple Tense");
        EnglishList.add("Англиский язык:Modal Verbs");
        EnglishList.add("Англиский язык: The Gerunds");
        EnglishList.add("Англиский язык:Preposition");
    }
}