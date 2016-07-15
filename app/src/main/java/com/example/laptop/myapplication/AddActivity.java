package com.example.laptop.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.laptop.myapplication.Models.Attractie;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klinten on 7/8/2016.
 */
public class AddActivity extends AppCompatActivity{
        Button buttonAdd;
        ListView listAttractie;
        EditText attractie, attractienaam, adres, postcode, tel, thema, omschrijving;
        private DatabaseReference mDatabase;
        Spinner sItems;
        TextView addText;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addoost);

        mDatabase = FirebaseDatabase.getInstance().getReference();;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        attractie = (EditText) findViewById(R.id.field_attractie);
        attractienaam = (EditText) findViewById(R.id.field_attractienaam);
        adres = (EditText) findViewById(R.id.field_adres);
        postcode = (EditText) findViewById(R.id.field_postcode);
        tel = (EditText) findViewById(R.id.field_tel);
        thema = (EditText) findViewById(R.id.field_thema);
        omschrijving = (EditText) findViewById(R.id.field_omschrijving);
        listAttractie = (ListView) findViewById(R.id.listViewAttractie);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Amserdam-Noord");
        spinnerArray.add("Amsterdam-Oost");
        spinnerArray.add("Amsterdam-Zuid");
        spinnerArray.add("Amsterdam-West");
        spinnerArray.add("Amsterdam-Centraal");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.staddd);
        sItems.setAdapter(adapter);

        sItems.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    buttonAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            populateNoordList();
                        }
                    });
                } else if (position == 1) {
                    buttonAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            populateOostList();
                        }
                    });
                } else if (position == 2) {
                    buttonAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            populateZuidList();
                        }
                    });
                } else if (position == 3) {
                    buttonAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            populateWestList();
                        }
                    });
                } else if (position == 4) {
                    buttonAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            populateCentraalList();
                        }
                    });
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        }

    private void populateNoordList() {
        final String attracties = attractie.getText().toString();
        final String attractienamen = attractienaam.getText().toString();
        final String adressen = adres.getText().toString();
        final String postcodes = postcode.getText().toString();
        final String telefoon = tel.getText().toString();
        final String themes = thema.getText().toString();
        final String omschrijven = omschrijving.getText().toString();


        if (TextUtils.isEmpty(attracties)) {
            attractie.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(attractienamen)) {
            attractienaam.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(adressen)) {
            adres.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(postcodes)) {
            postcode.setError("Verplicht");
            return;
        } else if(TextUtils.isEmpty(themes)){
            thema.setError("Verplicht");
        } else {

        Attractie location = new Attractie(attracties, attractienamen, adressen, postcodes, telefoon, themes, omschrijven);
        DatabaseReference bestemmingNoord = mDatabase.child("Locaties").child("Amsterdam")
                .child("Amsterdam-Noord").push();

        bestemmingNoord.setValue(location);

        attractie.setText("");
        attractienaam.setText("");
        adres.setText("");
        postcode.setText("");
        tel.setText("");
        thema.setText("");
        omschrijving.setText("");
    }
    }

    private void populateOostList() {
        final String attracties = attractie.getText().toString();
        final String attractienamen = attractienaam.getText().toString();
        final String adressen = adres.getText().toString();
        final String postcodes = postcode.getText().toString();
        final String telefoon = tel.getText().toString();
        final String themes = thema.getText().toString();
        final String omschrijven = omschrijving.getText().toString();

        if (TextUtils.isEmpty(attracties)) {
            attractie.setError("Verplicht");
            return;
        }
        if (TextUtils.isEmpty(attractienamen)) {
            attractienaam.setError("Verplicht");
            return;
        }

        if (TextUtils.isEmpty(adressen)) {
            adres.setError("Verplicht");
            return;
        }

        if (TextUtils.isEmpty(postcodes)) {
            postcode.setError("Verplicht");
            return;
        }

                Attractie location = new Attractie(attracties, attractienamen, adressen, postcodes, telefoon, themes, omschrijven);
                    DatabaseReference bestemmingOost = mDatabase.child("Locaties").child("Amsterdam")
                            .child("Amsterdam-Oost").push();

                    bestemmingOost.setValue(location);
                    attractie.setText("");
                    attractienaam.setText("");
                    adres.setText("");
                    postcode.setText("");
                    tel.setText("");
                    thema.setText("");
                    omschrijving.setText("");

    }

    private void populateZuidList() {
        final String attracties = attractie.getText().toString();
        final String attractienamen = attractienaam.getText().toString();
        final String adressen = adres.getText().toString();
        final String postcodes = postcode.getText().toString();
        final String telefoon = tel.getText().toString();
        final String themes = thema.getText().toString();
        final String omschrijven = omschrijving.getText().toString();

        if (TextUtils.isEmpty(attracties)) {
            attractie.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(attractienamen)) {
            attractienaam.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(adressen)) {
            adres.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(postcodes)) {
            postcode.setError("Verplicht");
            return;
        } else if(TextUtils.isEmpty(themes)){
            thema.setError("Verplicht");
        } else {

        Attractie location = new Attractie(attracties, attractienamen, adressen, postcodes, telefoon, themes, omschrijven);
        DatabaseReference bestemmingZuid = mDatabase.child("Locaties").child("Amsterdam")
                .child("Amsterdam-Zuid").push();

        bestemmingZuid.setValue(location);
        attractie.setText("");
        attractienaam.setText("");
        adres.setText("");
        postcode.setText("");
        tel.setText("");
        thema.setText("");
        omschrijving.setText("");
    }
    }

    private void populateWestList() {
        final String attracties = attractie.getText().toString();
        final String attractienamen = attractienaam.getText().toString();
        final String adressen = adres.getText().toString();
        final String postcodes = postcode.getText().toString();
        final String telefoon = tel.getText().toString();
        final String themes = thema.getText().toString();
        final String omschrijven = omschrijving.getText().toString();

        if (TextUtils.isEmpty(attracties)) {
            attractie.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(attractienamen)) {
            attractienaam.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(adressen)) {
            adres.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(postcodes)) {
            postcode.setError("Verplicht");
            return;
        } else if(TextUtils.isEmpty(themes)){
            thema.setError("Verplicht");
        } else {


        Attractie location = new Attractie(attracties, attractienamen, adressen, postcodes, telefoon, themes, omschrijven);
        addText.setText("Nieuwe Attractie Cultuur en Ik");
        DatabaseReference bestemmingWest = mDatabase.child("Locaties").child("Amsterdam")
                .child("Amsterdam-West").push();

        bestemmingWest.setValue(location);
        attractie.setText("");
        attractienaam.setText("");
        adres.setText("");
        postcode.setText("");
        tel.setText("");
        thema.setText("");
        omschrijving.setText("");
    }
    }

    private void populateCentraalList() {
        final String attracties = attractie.getText().toString();
        final String attractienamen = attractienaam.getText().toString();
        final String adressen = adres.getText().toString();
        final String postcodes = postcode.getText().toString();
        final String telefoon = tel.getText().toString();
        final String themes = thema.getText().toString();
        final String omschrijven = omschrijving.getText().toString();

        if (TextUtils.isEmpty(attracties)) {
            attractie.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(attractienamen)) {
            attractienaam.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(adressen)) {
            adres.setError("Verplicht");
            return;
        } else if (TextUtils.isEmpty(postcodes)) {
            postcode.setError("Verplicht");
            return;
        } else if(TextUtils.isEmpty(themes)){
            thema.setError("Verplicht");
        } else {
            Attractie location = new Attractie(attracties, attractienamen, adressen, postcodes, telefoon, themes, omschrijven);
            DatabaseReference bestemmingCentraal = mDatabase.child("Locaties").child("Amsterdam")
                    .child("Amsterdam-Centraal").push();

            bestemmingCentraal.setValue(location);
            attractie.setText("");
            attractienaam.setText("");
            adres.setText("");
            postcode.setText("");
            tel.setText("");
            thema.setText("");
            omschrijving.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_oost, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(item.getItemId()) {
            case R.id.action_list:
                Intent intent = new Intent(this, Locaties.class);
                this.startActivity(intent);
                break;
            case R.id.action_voegtoe:
                Intent intent2 = new Intent(this, AddActivity.class);
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}
