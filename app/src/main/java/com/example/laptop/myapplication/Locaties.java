package com.example.laptop.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.laptop.myapplication.Models.Attractie;
import com.example.laptop.myapplication.Profiel.MainActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class Locaties extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView atNaam, atPostcode, atTel, atattractienaam, atOmschrijving, atAdres;
    ArrayAdapter<String> stadAdapter;
    ArrayList<Attractie> attractieLijst;
    ListView liststad;
    String attract, naam, adres, postcode, tel, thema, omschrijving;
    ArrayList<Attractie> selectedList;
    String stadsdeel, themas;
    private DatabaseReference mDatabase;
    Intent Profiel, Agenda, Locaties, Activiteiten, Dagboek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locaties);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Profiel = new Intent(this, MainActivity.class);
        Agenda = new Intent(this, Agenda.class);
        Locaties = new Intent(this, Locaties.class);
        Activiteiten = new Intent(this, Activiteiten.class);
        Dagboek = new Intent(this, Dagboek.class);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        selectedList = new ArrayList<Attractie>();

        liststad = (ListView) findViewById(R.id.listViewAttractie);

        stadAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        attractieLijst = new ArrayList<>();

        final List<String> themaArray = new ArrayList<String>();
        themaArray.add("Gezonde Levensstijl");
        themaArray.add("Vriendschappen en relaties");
        themaArray.add("Blik op de toekomst");
        themaArray.add("Cultuur en ik");
        themaArray.add("Talentontwikkeling");

        final List<String> stadArray = new ArrayList<String>();
        stadArray.add("Amsterdam-Noord");
        stadArray.add("Amsterdam-Oost");
        stadArray.add("Amsterdam-Zuid");
        stadArray.add("Amsterdam-West");
        stadArray.add("Amsterdam-Centraal");

        ArrayAdapter<String> themaAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, themaArray);

        themaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner tItems = (Spinner) findViewById(R.id.themadd);
        tItems.setAdapter(themaAdapter);

        ArrayAdapter<String> stadSpinnerAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, stadArray);

        stadSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.staddd);
        sItems.setAdapter(stadSpinnerAdapter);
        stadsdeel = stadArray.get(0);
        refreshListView();


        sItems.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                stadsdeel = stadArray.get(position);
                themas = themaArray.get(position);
                DatabaseReference mRefAmsterdam = mDatabase.child("Locaties").child("Amsterdam").child(stadsdeel);
                mRefAmsterdam.addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot attractieSnapshot : dataSnapshot.getChildren()) {
                            Attractie attractie = attractieSnapshot.getValue(Attractie.class);
                            attractieLijst.add(attractie);

                        }
                        attractieLijst.clear();
                        for (Attractie attractie : attractieLijst) {
                            attractie.getThema().equals(themas);
                            selectedList.add(attractie);
                        }
                        attractieLijst.clear();
                        selectedList.clear();
                        for (Attractie attractie : selectedList) {
                            stadAdapter.add(attractie.getAttractienaam());
                        }
                    }

                    public void onCancelled(DatabaseError databaseError) {
                    }


                });
                refreshListView();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


        liststad.setAdapter(stadAdapter);


//        textView1 = (TextView) findViewById(R.id.textView1);
////        textView1.setText( Html.fromHtml("<a href=\"http://www.google.com\">Google</a>"));
////        textView1. setMovementMethod(LinkMovementMethod.getInstance());


        liststad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Attractie attractie = selectedList.get(position);
                attract = attractie.getAttractie();
                naam = attractie.getAttractienaam();
                adres = attractie.getAdres();
                postcode = attractie.getPostcode();
                tel = attractie.getTel();
                thema = attractie.getThema();
                omschrijving = attractie.getOmschrijving();

                Intent intent = new Intent(Locaties.this, DetailActivity.class);
                intent.putExtra("Attractie", attract);
                intent.putExtra("Attractienaam", naam);
                intent.putExtra("Adres", adres);
                intent.putExtra("Postcode", postcode);
                intent.putExtra("Tel", tel);
                intent.putExtra("Thema", thema);
                intent.putExtra("Omschrijving", omschrijving);
                startActivity(intent);

            }
        });


        liststad.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                final AlertDialog.Builder adb = new AlertDialog.Builder(Locaties.this);
                adb.setTitle("Verwijderen?");
                adb.setMessage("Weet je zeker dat je wilt verwijderen?" + position);
                adb.setNegativeButton("Ja", null);
                adb.setPositiveButton("Nee", new AlertDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDatabase.child("Amsterdam").child("Amsterdam-Oost").orderByChild("Gezonde Levensstijl")
                                .equalTo((String) liststad.getItemAtPosition(position))
                                .addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        if (dataSnapshot.hasChildren()) {
                                            DataSnapshot firstChild = dataSnapshot.getChildren().iterator().next();
                                            firstChild.getRef().removeValue();
                                        }
                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {
                                    }
                                });
                        adb.show();
                    }

                });
                return true;
            }
        });
    }

    private void refreshListView() {

    }

    public void displayDialog() {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
//        final Dialog dialog = new Dialog(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.content_detail, null);
//        dialog.setTitle(attractie.getAttractie());
//        dialog.setContentView(R.layout.content_detail);
        dialogBuilder.setView(dialogView);

        AlertDialog d = dialogBuilder.create();
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
        getMenuInflater().inflate(R.menu.menu_oost, menu);
        return true;
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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
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