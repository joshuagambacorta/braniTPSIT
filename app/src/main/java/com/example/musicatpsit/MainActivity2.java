package com.example.musicatpsit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String etich=i.getStringExtra("etichetta");
        Log.d("response", etich);
        TextView lblTextTitolo = (TextView)findViewById(R.id.textTitolo);
        lblTextTitolo.setText(etich);
    }
}