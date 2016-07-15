package com.example.laptop.myapplication.Profiel;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.laptop.myapplication.Profiel.Firebase.FirebaseHelper;
import com.example.laptop.myapplication.Profiel.IU.CostumAdapter;
import com.example.laptop.myapplication.R;
import com.example.laptop.myapplication.Profiel.modules.Coachee;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DatabaseReference db;
    FirebaseHelper helper;
    CostumAdapter adapter;
    ListView listCoachees;
    EditText ceNaam, ceTel, ceEmail;
    Intent Profiel, Agenda, Locaties, Activiteiten, Dagboek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listCoachees = (ListView) findViewById(R.id.listCoachees);

        db = FirebaseDatabase.getInstance().getReference();
        helper = new FirebaseHelper(db);

        adapter = new CostumAdapter(this, helper.retrieve());
        listCoachees.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.ceButton);
        fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayInputDialog();
                }
            });

        Profiel = new Intent(this, MainActivity.class);
        Agenda = new Intent(this, com.example.laptop.myapplication.Agenda.class);
        Locaties = new Intent (this, com.example.laptop.myapplication.Locaties.class);
        Activiteiten = new Intent (this, com.example.laptop.myapplication.Activiteiten.class);
        Dagboek = new Intent (this, com.example.laptop.myapplication.Dagboek.class);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void displayInputDialog() {

        Dialog d = new Dialog(this);
        d.setTitle("Voeg coachee toe");
        d.setContentView(R.layout.profiel_dialog);

        ceNaam = (EditText) d.findViewById(R.id.ceNaam);
        ceTel = (EditText) d.findViewById(R.id.ceTel);
        ceEmail = (EditText) d.findViewById(R.id.ceEmail);
        Button ceAdd = (Button) d.findViewById(R.id.ceAdd);

        ceAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String naam = ceNaam.getText().toString();
                String tel = ceTel.getText().toString();
                String email = ceEmail.getText().toString();

                Coachee s = new Coachee();
                s.setNaam(naam);
                s.setTel(tel);
                s.setEmail(email);

                if (naam != null && naam.length() > 0) {
                    if (helper.save(s)) {

                        ceNaam.setText("");
                        ceTel.setText("");
                        ceEmail.setText("");

                        adapter = new CostumAdapter(MainActivity.this, helper.retrieve());
                        listCoachees.setAdapter(adapter);

                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Het mag niet leeg zijn", Toast.LENGTH_SHORT).show();
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

        return super.onOptionsItemSelected(item);
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
}
