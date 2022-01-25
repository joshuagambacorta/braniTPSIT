package com.example.musicatpsit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivityShow extends AppCompatActivity {
    Brano brPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView editTextTitolo = (TextView) findViewById(R.id.textTitolo);
        setContentView(R.layout.activity_main_show);
        Intent i = getIntent();
        String etich=i.getStringExtra("etichetta");
        editTextTitolo.setText(etich);
    }

}
