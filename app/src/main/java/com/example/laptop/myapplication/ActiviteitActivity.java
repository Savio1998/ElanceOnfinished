package com.example.laptop.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.laptop.myapplication.Models.ActiviteitHelper;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by klinten on 7/14/2016.
 */
public class ActiviteitActivity extends AppCompatActivity {
    ActiviteitHelper helper;
    DatabaseReference mDatabase;
    ListView glActiviteitList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locaties);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        helper = new ActiviteitHelper(mDatabase);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        glActiviteitList = (ListView) findViewById(R.id.listActiviteit);
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activiteit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.action_lijst:
                Intent intent = new Intent(this, ActiviteitActivity.class);
                this.startActivity(intent);
                break;
            case R.id.action_newActiviteit:
                Intent intent2 = new Intent(this, AddActiviteit.class);
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}