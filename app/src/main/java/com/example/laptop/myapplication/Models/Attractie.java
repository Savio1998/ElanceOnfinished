package com.example.laptop.myapplication.Models;

/**
 * Created by klinten on 7/7/2016.
 */
public class Attractie {
    public String attractie;
    public String attractienaam;
    public String adres;
    public String postcode;
    public String tel;
    public String thema;
    public String omschrijving;



    public Attractie() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


    public String getAttractie() {
        return attractie;
    }

    public void setAttractie(String attractie) {
        this.attractie = attractie;
    }


    public String getAttractienaam() {
        return attractienaam;
    }

    public void setAttractienaam(String attractienaam) {
        this.attractienaam = attractienaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }



    public Attractie(String attractie, String adres, String attractienaam, String postcode, String tel, String thema, String omschrijving) {
        this.attractie = attractie;
        this.adres = adres;
        this.attractienaam = attractienaam;
        this.postcode = postcode;
        this.tel = tel;
        this.thema = thema;
        this.omschrijving = omschrijving;

    }

}