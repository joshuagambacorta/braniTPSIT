package com.example.musicatpsit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Brano brPass;
    EditText editTextAutore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GestioneBrani gb1 = new GestioneBrani();
        EditText editTextAutore = (EditText) findViewById(R.id.editTextAutore);
        EditText editTextTitolo = (EditText) findViewById(R.id.editTextTitolo);
        Button buttonAdd = (Button) findViewById(R.id.addButton);
        Button buttonFind = (Button) findViewById(R.id.findButton);
        ArrayList<String> generi = new ArrayList();
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals("Genere:")) {
                    Toast.makeText(getApplicationContext(), "Necessario selezionare il Genere", Toast.LENGTH_SHORT).show();
                } else {
                    if(TextUtils.isEmpty(editTextAutore.getText()) || TextUtils.isEmpty(editTextTitolo.getText())){
                        Toast.makeText(getApplicationContext(), "Necessario compilare tutti i campi", Toast.LENGTH_SHORT).show();
                    } else{
                        brPass = new Brano(editTextTitolo.getText().toString(), editTextAutore.getText().toString(), spinner.getSelectedItem().toString());
                        gb1.inserisciBrano(brPass);
                    }
                }
            }
        });

        buttonFind.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals("Genere:")) {
                    Toast.makeText(getApplicationContext(), "Necessario selezionare il Genere", Toast.LENGTH_SHORT).show();
                } else {
                    if(TextUtils.isEmpty(editTextAutore.getText()) && TextUtils.isEmpty(editTextTitolo.getText())){
                        Toast.makeText(getApplicationContext(), "Necessario compilare almeno un campo", Toast.LENGTH_SHORT).show();
                    } else{
                        //The Spinner has been correctly selected

                    }
                }
            }
        });

        //Popola spinner con Generi
        generi.add("Genere:");
        generi.add("rock");
        generi.add("pop");
        generi.add("jazz");
        generi.add("country");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, generi){
            //disabled position
            @Override
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the second item from Spinner
                    return false;
                }
                else
                {
                    return true;
                }
            }
        };
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        }

    public void click_for_show(View v) {
        GestioneBrani show_brani = new GestioneBrani();
        String result_brani = show_brani.visualizzaBrani(editTextAutore.getText().toString());
        Intent i = new Intent(getApplicationContext(), MainActivityShow.class);
        i.putExtra("brani", result_brani);
        startActivity(i);
    }


}
