package com.example.musicatpsit;

import java.util.ArrayList;

public class GestioneBrani {

    ArrayList<Brano> brani = new ArrayList();

    public boolean inserisciBrano(Brano b){
        try{
            brani.add(new Brano(b));
        } catch (Exception e){
            return false;
        }
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

    public String visualizzaBrani(String autore){
        StringBuilder sbBrni = new StringBuilder();
        for (Brano brc : brani)
        {
            sbBrni.append(brc.getTitolo().toString()+"-");
            sbBrni.append(brc.getAutore().toString()+"-");
            sbBrni.append(brc.getGenere().toString()+"\n");
        }
        return sbBrni.toString();
    }
}
