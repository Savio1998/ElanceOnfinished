package com.example.laptop.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by klinten on 7/14/2016.
 */
public class DetailActivity extends AppCompatActivity {
    String attractie, attractienaam, adres, postcode, tel, omschrijving;
    TextView atAttractie, atNaam, atAdres, atPostcode, atTel, atOmschrijving;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        atNaam = (TextView) findViewById(R.id.atattractienaam);
        atAttractie = (TextView) findViewById(R.id.atNaam);
        atAdres = (TextView) findViewById(R.id.atAdres);
        atPostcode = (TextView) findViewById(R.id.atPostcode);
        atTel = (TextView) findViewById(R.id.atTel);
        atOmschrijving = (TextView) findViewById(R.id.atOmschrijving);

        Intent i=getIntent();
        attractie = i.getStringExtra("Attractie");
        attractienaam = i.getStringExtra("Attractienaam");
        adres = i.getStringExtra("Adres");
        postcode= i.getStringExtra("Postcode");
        tel = i.getStringExtra("Tel");
        omschrijving = i.getStringExtra("Omschrijving");

        atNaam.setText(attractie);
        atAttractie.setText(adres);
        atAdres.setText(attractienaam);
        atPostcode.setText(postcode);
        atOmschrijving.setText(omschrijving);
        setTitle("Details " + attractienaam);
}
}