package com.example.musicatpsit;

import java.util.Date;

public class Brano {
    private String titolo;
    private String autore;
    private String album;
    private String genere;
    private String urlVideo;
    //secondi
    private Integer durata;
    private Date dataLancio;

    public Brano(String titolo, String autore, String genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
    }

    public Brano(Brano b){
        this.titolo = b.getTitolo();
        this.autore = b.getAutore();
        this.genere = b.getGenere();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
