package com.example.laptop.myapplication.Models;

/**
 * Created by klinten on 7/14/2016.
 */
public class Activiteit {
    String titel, wat, doel, uitleg, vaardigheden;

    public Activiteit() {
        this.titel = titel;
        this.wat = wat;
        this.doel = doel;
        this.uitleg = uitleg;
        this.vaardigheden = vaardigheden;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getVaardigheden() {
        return vaardigheden;
    }

    public void setVaardigheden(String vaardigheden) {
        this.vaardigheden = vaardigheden;
    }

    public String getUitleg() {
        return uitleg;
    }

    public void setUitleg(String uitleg) {
        this.uitleg = uitleg;
    }

    public String getDoel() {
        return doel;
    }

    public void setDoel(String doel) {
        this.doel = doel;
    }

    public String getWat() {
        return wat;
    }

    public void setWat(String wat) {
        this.wat = wat;
    }
}
