package com.example.laptop.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.laptop.myapplication.Profiel.MainActivity;
import com.example.laptop.myapplication.m_FireBase.FirebaseAgendaHelper;
import com.example.laptop.myapplication.m_Model.Afspraak;
import com.example.laptop.myapplication.m_UI.CustomAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by Laptop on 30-6-2016.
 */
public class Agenda extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DatabaseReference db;
    FirebaseAgendaHelper helper;
    CustomAdapter adapter;
    ListView lv;
    EditText nameEditTxt, propTxt, descTxt;
    ArrayList<Afspraak> afspraak;
    Intent Profiel, Agenda, Locaties, Activiteiten, Dagboek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Profiel = new Intent(this, MainActivity.class);
        Agenda = new Intent(this, Agenda.class);
        Locaties = new Intent (this, Locaties.class);
        Activiteiten = new Intent (this, Activiteiten.class);
        Dagboek = new Intent (this, Dagboek.class);
        lv = (ListView) findViewById(R.id.lv);


        //INITIALIZE FIREBASE DB

        db = FirebaseDatabase.getInstance().getReference();
        helper = new FirebaseAgendaHelper(db);

        //ADAPTER

        adapter = new CustomAdapter(this, helper.retrieve());
        lv.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayInputDialog();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    Intent intent = getIntent();
    //DISPLAY INPUT DIALOG

    private void displayInputDialog() {
        Dialog d = new Dialog(this);
        d.setTitle("Save To Firebase");
        d.setContentView(R.layout.input_dialog);
        nameEditTxt = (EditText) d.findViewById(R.id.nameEditText);
        propTxt = (EditText) d.findViewById(R.id.propellantEditText);
        descTxt = (EditText) d.findViewById(R.id.descEditText);
        Button saveBtn = (Button) d.findViewById(R.id.saveBtn);



        //SAVE

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GET DATA

                String name = nameEditTxt.getText().toString();
                String propellant = propTxt.getText().toString();
                String desc = descTxt.getText().toString();


                //SET DATA

                Afspraak s = new Afspraak();
                s.setName(name);
                s.setPropellant(propellant);
                s.setDescription(desc);


                //SIMPLE VALIDATION

                if (name != null && name.length() > 0) {

                    //THEN SAVE

                    if (helper.save(s)) {

                        //IF SAVED CLEAR EDITXT

                        nameEditTxt.setText("");
                        propTxt.setText("");
                        descTxt.setText("");
                        adapter = new CustomAdapter(Agenda.this, helper.retrieve());
                        lv.setAdapter(adapter);

                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }

                } else {
                    Toast.makeText(Agenda.this, "Name Must Not Be Empty", Toast.LENGTH_SHORT).show();
                }


            }
        });
        d.show();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            startActivity(Profiel);

        } else if (id == R.id.nav_agenda) {
            startActivity(Agenda);

        } else if (id == R.id.nav_locaties) {
            startActivity(Locaties);

        } else if (id == R.id.nav_activiteiten) {
            startActivity(Activiteiten);

        } else if (id == R.id.nav_dagboek) {
            startActivity(Dagboek);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.action_verwijder){
            db.child("Afspraak").setValue(null);

            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}