package com.example.laptop.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.laptop.myapplication.Models.Activiteit;
import com.example.laptop.myapplication.Models.ActiviteitHelper;
import com.example.laptop.myapplication.Models.AdapaterActiviteit;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

/**
 * Created by klinten on 7/15/2016.
 */
public class AddActiviteit extends AppCompatActivity{
    DatabaseReference db,mDatabase, refGL;
    ActiviteitHelper helper;
    AdapaterActiviteit adapter;
    ListView glActiviteitList;
    Button actButton;
    EditText titleEdit, watEdit, doelEdit, uitlegEdit, vaardighedenEdit;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addoost);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        refGL = mDatabase.child("Activiteiten").child("Gezonde Levensstijl");
        helper = new ActiviteitHelper(refGL);

        glActiviteitList = (ListView) findViewById(R.id.listActiviteit);
        titleEdit = (EditText) findViewById(R.id.titelEditText);
        watEdit = (EditText) findViewById(R.id.watEditText);
        doelEdit = (EditText) findViewById(R.id.doelEditText);
        uitlegEdit = (EditText) findViewById(R.id.uitlegEditText);
        vaardighedenEdit = (EditText) findViewById(R.id.vaardighedenEditText);
        actButton = (Button) findViewById(R.id.addButton);

        adapter = new AdapaterActiviteit(this, helper.retrieve());
        glActiviteitList.setAdapter(adapter);

        actButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titel = titleEdit.getText().toString();
                String wat = watEdit.getText().toString();
                String doel = doelEdit.getText().toString();
                String uitleg = uitlegEdit.getText().toString();
                String vaardigheden = vaardighedenEdit.getText().toString();

                Activiteit act = new Activiteit();
                act.setTitel(titel);
                act.setWat(wat);
                act.setDoel(doel);
                act.setUitleg(uitleg);
                act.setVaardigheden(vaardigheden);

                if(titel !=null && titel.length() > 0){
                    if(helper.save(act)){
                        titleEdit.setText("");
                        watEdit.setText("");
                        doelEdit.setText("");
                        uitlegEdit.setText("");
                        vaardighedenEdit.setText("");

                        adapter = new AdapaterActiviteit(AddActiviteit.this, helper.retrieve());
                        glActiviteitList.setAdapter(adapter);
                    }
                } else {
                    Toast.makeText(AddActiviteit.this, "Titel mag niet leeg zijn", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
