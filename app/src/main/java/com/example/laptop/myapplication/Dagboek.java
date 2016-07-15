package com.example.laptop.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.laptop.myapplication.Profiel.MainActivity;
import com.example.laptop.myapplication.Profiel.modules.Coachee;

import java.util.ArrayList;

/**
 * Created by Laptop on 30-6-2016.
 */
public class Dagboek extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Intent      Profiel, Agenda, Locaties, Activiteiten, Dagboek;
    ImageView   imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10,
                imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20,
                imageViewRoze1, imageViewRoze2, imageViewRoze3, imageViewRoze4, imageViewRoze5, imageViewRoze6, imageViewRoze7, imageViewRoze8, imageViewRoze9, imageViewRoze10,
                imageViewRoze11, imageViewRoze12, imageViewRoze13, imageViewRoze14, imageViewRoze15, imageViewRoze16, imageViewRoze17, imageViewRoze18, imageViewRoze19, imageViewRoze20,
                imageViewGroen1, imageViewGroen2, imageViewGroen3, imageViewGroen4, imageViewGroen5, imageViewGroen6, imageViewGroen7, imageViewGroen8, imageViewGroen9, imageViewGroen10,
                imageViewGroen11, imageViewGroen12, imageViewGroen13, imageViewGroen14, imageViewGroen15, imageViewGroen16, imageViewGroen17, imageViewGroen18, imageViewGroen19, imageViewGroen20;
    TextView    dag1, dag2, dag3, dag4, dag5, dag6, dag7, dag8, dag9, dag10,
                dag11, dag12, dag13, dag14, dag15, dag16, dag17, dag18, dag19, dag20;
    Button      button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
                button11, button12, button13, button14, button15, button16, button17, button18, button19, button20;

    ArrayList<Coachee> coachee = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagboek);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Profiel = new Intent(this, MainActivity.class);
        Agenda = new Intent(this, Agenda.class);
        Locaties = new Intent (this, Locaties.class);
        Activiteiten = new Intent (this, Activiteiten.class);
        Dagboek = new Intent (this, Dagboek.class);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView20 = (ImageView) findViewById(R.id.imageView20);

        imageViewRoze1 = (ImageView) findViewById(R.id.imageViewRoze1);
        imageViewRoze2 = (ImageView) findViewById(R.id.imageViewRoze2);
        imageViewRoze3 = (ImageView) findViewById(R.id.imageViewRoze3);
        imageViewRoze4 = (ImageView) findViewById(R.id.imageViewRoze4);
        imageViewRoze5 = (ImageView) findViewById(R.id.imageViewRoze5);
        imageViewRoze6 = (ImageView) findViewById(R.id.imageViewRoze6);
        imageViewRoze7 = (ImageView) findViewById(R.id.imageViewRoze7);
        imageViewRoze8 = (ImageView) findViewById(R.id.imageViewRoze8);
        imageViewRoze9 = (ImageView) findViewById(R.id.imageViewRoze9);
        imageViewRoze10 = (ImageView) findViewById(R.id.imageViewRoze10);
        imageViewRoze11 = (ImageView) findViewById(R.id.imageViewRoze11);
        imageViewRoze12 = (ImageView) findViewById(R.id.imageViewRoze12);
        imageViewRoze13 = (ImageView) findViewById(R.id.imageViewRoze13);
        imageViewRoze14 = (ImageView) findViewById(R.id.imageViewRoze14);
        imageViewRoze15 = (ImageView) findViewById(R.id.imageViewRoze15);
        imageViewRoze16 = (ImageView) findViewById(R.id.imageViewRoze16);
        imageViewRoze17 = (ImageView) findViewById(R.id.imageViewRoze17);
        imageViewRoze18 = (ImageView) findViewById(R.id.imageViewRoze18);
        imageViewRoze19 = (ImageView) findViewById(R.id.imageViewRoze19);
        imageViewRoze20 = (ImageView) findViewById(R.id.imageViewRoze20);

        imageViewGroen1 = (ImageView) findViewById(R.id.imageViewGroen1);
        imageViewGroen2 = (ImageView) findViewById(R.id.imageViewGroen2);
        imageViewGroen3 = (ImageView) findViewById(R.id.imageViewGroen3);
        imageViewGroen4 = (ImageView) findViewById(R.id.imageViewGroen4);
        imageViewGroen5 = (ImageView) findViewById(R.id.imageViewGroen5);
        imageViewGroen6 = (ImageView) findViewById(R.id.imageViewGroen6);
        imageViewGroen7 = (ImageView) findViewById(R.id.imageViewGroen7);
        imageViewGroen8 = (ImageView) findViewById(R.id.imageViewGroen8);
        imageViewGroen9 = (ImageView) findViewById(R.id.imageViewGroen9);
        imageViewGroen10 = (ImageView) findViewById(R.id.imageViewGroen10);
        imageViewGroen11 = (ImageView) findViewById(R.id.imageViewGroen11);
        imageViewGroen12 = (ImageView) findViewById(R.id.imageViewGroen12);
        imageViewGroen13 = (ImageView) findViewById(R.id.imageViewGroen13);
        imageViewGroen14 = (ImageView) findViewById(R.id.imageViewGroen14);
        imageViewGroen15 = (ImageView) findViewById(R.id.imageViewGroen15);
        imageViewGroen16 = (ImageView) findViewById(R.id.imageViewGroen16);
        imageViewGroen17 = (ImageView) findViewById(R.id.imageViewGroen17);
        imageViewGroen18 = (ImageView) findViewById(R.id.imageViewGroen18);
        imageViewGroen19 = (ImageView) findViewById(R.id.imageViewGroen19);
        imageViewGroen20 = (ImageView) findViewById(R.id.imageViewGroen20);

        imageViewRoze1.setAlpha(0f);
        imageViewRoze2.setAlpha(0f);
        imageViewRoze3.setAlpha(0f);
        imageViewRoze4.setAlpha(0f);
        imageViewRoze5.setAlpha(0f);
        imageViewRoze6.setAlpha(0f);
        imageViewRoze7.setAlpha(0f);
        imageViewRoze8.setAlpha(0f);
        imageViewRoze9.setAlpha(0f);
        imageViewRoze10.setAlpha(0f);
        imageViewRoze11.setAlpha(0f);
        imageViewRoze12.setAlpha(0f);
        imageViewRoze13.setAlpha(0f);
        imageViewRoze14.setAlpha(0f);
        imageViewRoze15.setAlpha(0f);
        imageViewRoze16.setAlpha(0f);
        imageViewRoze17.setAlpha(0f);
        imageViewRoze18.setAlpha(0f);
        imageViewRoze19.setAlpha(0f);
        imageViewRoze20.setAlpha(0f);

        imageViewGroen1.setAlpha(0f);
        imageViewGroen2.setAlpha(0f);
        imageViewGroen3.setAlpha(0f);
        imageViewGroen4.setAlpha(0f);
        imageViewGroen5.setAlpha(0f);
        imageViewGroen6.setAlpha(0f);
        imageViewGroen7.setAlpha(0f);
        imageViewGroen8.setAlpha(0f);
        imageViewGroen9.setAlpha(0f);
        imageViewGroen10.setAlpha(0f);
        imageViewGroen11.setAlpha(0f);
        imageViewGroen12.setAlpha(0f);
        imageViewGroen13.setAlpha(0f);
        imageViewGroen14.setAlpha(0f);
        imageViewGroen15.setAlpha(0f);
        imageViewGroen16.setAlpha(0f);
        imageViewGroen17.setAlpha(0f);
        imageViewGroen18.setAlpha(0f);
        imageViewGroen19.setAlpha(0f);
        imageViewGroen20.setAlpha(0f);

        dag1 = (TextView) findViewById(R.id.dag1);
        dag2 = (TextView) findViewById(R.id.dag2);
        dag3 = (TextView) findViewById(R.id.dag3);
        dag4 = (TextView) findViewById(R.id.dag4);
        dag5 = (TextView) findViewById(R.id.dag5);
        dag6 = (TextView) findViewById(R.id.dag6);
        dag7 = (TextView) findViewById(R.id.dag7);
        dag8 = (TextView) findViewById(R.id.dag8);
        dag9 = (TextView) findViewById(R.id.dag9);
        dag10 = (TextView) findViewById(R.id.dag10);
        dag11 = (TextView) findViewById(R.id.dag11);
        dag12 = (TextView) findViewById(R.id.dag12);
        dag13 = (TextView) findViewById(R.id.dag13);
        dag14 = (TextView) findViewById(R.id.dag14);
        dag15 = (TextView) findViewById(R.id.dag15);
        dag16 = (TextView) findViewById(R.id.dag16);
        dag17 = (TextView) findViewById(R.id.dag17);
        dag18 = (TextView) findViewById(R.id.dag18);
        dag19 = (TextView) findViewById(R.id.dag19);
        dag20 = (TextView) findViewById(R.id.dag20);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);

        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<Coachee> adapter = new ArrayAdapter<Coachee>(this, android.R.layout.simple_spinner_item, coachee);
        s.setAdapter(adapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void nummer1(View view) {

            imageView1.setAlpha(0f);
            imageViewRoze1.setAlpha(1f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.VISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer2(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(0f);
            imageViewRoze2.setAlpha(1f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);


            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.VISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer3(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(0f);
            imageViewRoze3.setAlpha(1f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.VISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer4(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(0f);
            imageViewRoze4.setAlpha(1f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.VISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer5(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(0f);
            imageViewRoze5.setAlpha(1f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.VISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer6(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(0f);
            imageViewRoze6.setAlpha(1f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.VISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.VISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer7(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(0f);
            imageViewRoze7.setAlpha(1f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.VISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.VISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer8(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(0f);
            imageViewRoze8.setAlpha(1f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.VISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.VISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer9(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(0f);
            imageViewRoze9.setAlpha(1f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.VISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.VISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer10(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(0f);
            imageViewRoze10.setAlpha(1f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.VISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.VISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer11(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(0f);
            imageViewRoze11.setAlpha(1f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.VISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.VISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer12(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(0f);
            imageViewRoze12.setAlpha(1f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.VISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.VISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer13(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(0f);
            imageViewRoze13.setAlpha(1f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.VISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.VISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer14(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(0f);
            imageViewRoze14.setAlpha(1f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.VISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.VISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer15(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(0f);
            imageViewRoze15.setAlpha(1f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.VISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.VISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer16(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(0f);
            imageViewRoze16.setAlpha(1f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.VISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.VISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer17(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(0f);
            imageViewRoze17.setAlpha(1f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.VISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.VISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);
    }

    public void nummer18(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(0f);
            imageViewRoze18.setAlpha(1f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.VISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.VISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer19(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(0f);
            imageViewRoze19.setAlpha(1f);
            imageView20.setAlpha(1f);
            imageViewRoze20.setAlpha(0f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.VISIBLE);
            dag20.setVisibility(View.INVISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.VISIBLE);
            button20.setVisibility(View.INVISIBLE);

    }

    public void nummer20(View view) {

            imageView1.setAlpha(1f);
            imageViewRoze1.setAlpha(0f);
            imageView2.setAlpha(1f);
            imageViewRoze2.setAlpha(0f);
            imageView3.setAlpha(1f);
            imageViewRoze3.setAlpha(0f);
            imageView4.setAlpha(1f);
            imageViewRoze4.setAlpha(0f);
            imageView5.setAlpha(1f);
            imageViewRoze5.setAlpha(0f);
            imageView6.setAlpha(1f);
            imageViewRoze6.setAlpha(0f);
            imageView7.setAlpha(1f);
            imageViewRoze7.setAlpha(0f);
            imageView8.setAlpha(1f);
            imageViewRoze8.setAlpha(0f);
            imageView9.setAlpha(1f);
            imageViewRoze9.setAlpha(0f);
            imageView10.setAlpha(1f);
            imageViewRoze10.setAlpha(0f);
            imageView11.setAlpha(1f);
            imageViewRoze11.setAlpha(0f);
            imageView12.setAlpha(1f);
            imageViewRoze12.setAlpha(0f);
            imageView13.setAlpha(1f);
            imageViewRoze13.setAlpha(0f);
            imageView14.setAlpha(1f);
            imageViewRoze14.setAlpha(0f);
            imageView15.setAlpha(1f);
            imageViewRoze15.setAlpha(0f);
            imageView16.setAlpha(1f);
            imageViewRoze16.setAlpha(0f);
            imageView17.setAlpha(1f);
            imageViewRoze17.setAlpha(0f);
            imageView18.setAlpha(1f);
            imageViewRoze18.setAlpha(0f);
            imageView19.setAlpha(1f);
            imageViewRoze19.setAlpha(0f);
            imageView20.setAlpha(0f);
            imageViewRoze20.setAlpha(1f);

            dag1.setVisibility(View.INVISIBLE);
            dag2.setVisibility(View.INVISIBLE);
            dag3.setVisibility(View.INVISIBLE);
            dag4.setVisibility(View.INVISIBLE);
            dag5.setVisibility(View.INVISIBLE);
            dag6.setVisibility(View.INVISIBLE);
            dag7.setVisibility(View.INVISIBLE);
            dag8.setVisibility(View.INVISIBLE);
            dag9.setVisibility(View.INVISIBLE);
            dag10.setVisibility(View.INVISIBLE);
            dag11.setVisibility(View.INVISIBLE);
            dag12.setVisibility(View.INVISIBLE);
            dag13.setVisibility(View.INVISIBLE);
            dag14.setVisibility(View.INVISIBLE);
            dag15.setVisibility(View.INVISIBLE);
            dag16.setVisibility(View.INVISIBLE);
            dag17.setVisibility(View.INVISIBLE);
            dag18.setVisibility(View.INVISIBLE);
            dag19.setVisibility(View.INVISIBLE);
            dag20.setVisibility(View.VISIBLE);

            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button14.setVisibility(View.INVISIBLE);
            button15.setVisibility(View.INVISIBLE);
            button16.setVisibility(View.INVISIBLE);
            button17.setVisibility(View.INVISIBLE);
            button18.setVisibility(View.INVISIBLE);
            button19.setVisibility(View.INVISIBLE);
            button20.setVisibility(View.VISIBLE);

    }

    public void nr1 (View view){
        Intent intent = new Intent(this, com.example.laptop.myapplication.DagboekEntries.DagboekEntry1.class);
        this.startActivity(intent);
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
