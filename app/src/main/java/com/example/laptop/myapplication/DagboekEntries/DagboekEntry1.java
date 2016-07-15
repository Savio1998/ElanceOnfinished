package com.example.laptop.myapplication.DagboekEntries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.example.laptop.myapplication.R;

/**
 * Created by Laptop on 15-7-2016.
 */
public class DagboekEntry1 extends AppCompatActivity {
    Intent Dagboek;
    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagboekentry);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Dagboek = new Intent(this, com.example.laptop.myapplication.Dagboek.class);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

    }


}