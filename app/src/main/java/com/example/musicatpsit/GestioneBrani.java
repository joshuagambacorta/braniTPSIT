package com.example.musicatpsit;

import android.util.Log;

import java.util.ArrayList;

public class GestioneBrani {

    public ArrayList<Brano> brani = new ArrayList<Brano>();

    public boolean inserisciBrano(Brano b){
        Brano brano_to_insert = new Brano(b);
        try{
            brani.add(brano_to_insert);
        } catch (Exception e){
            return false;
        }


        Log.d("aggiunto", brani.get(0).getTitolo().toString());
        return true;
    }

    public String searchBrano(String titolo, String autore, String genere) {

        Brano result;

        for (int i = 0; i < brani.size(); i++) {
            if (brani.get(i).getTitolo() == titolo && brani.get(i).getAutore() == autore && brani.get(i).getGenere() == genere) {
                result = brani.get(i);

            }
        }
        return "ciao";
    }

    public String visualizzaBrani(){
        StringBuilder sbBrni = new StringBuilder();
        for (Brano brc : brani)
        {
            Log.d("Entra", "cisono");
            sbBrni.append(brc.getTitolo().toString()+"-");
            sbBrni.append(brc.getAutore().toString()+"-");
            sbBrni.append(brc.getGenere().toString()+"\n");
        }
        return sbBrni.toString();
    }
}
