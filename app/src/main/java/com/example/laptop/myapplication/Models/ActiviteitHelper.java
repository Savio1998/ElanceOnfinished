package com.example.laptop.myapplication.Models;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
/**
 * Created by klinten on 7/14/2016.
 */

public class ActiviteitHelper {
        DatabaseReference md;
        ArrayList<Activiteit> activiteiten = new ArrayList<>();
        Boolean saved;

        public ActiviteitHelper (DatabaseReference md){
            this.md = md;
        }

        public Boolean save(Activiteit activiteit){
            if(activiteit == null){
                saved = false;
            }else{
                try{
                    md.child("Activiteiten").push().setValue(activiteit);
                    saved = true;
                } catch(DatabaseException e){
                    e.printStackTrace();
                    saved = false;
                }
            }
            return saved;
        }

        private void getData(DataSnapshot dataSnapshot){
            activiteiten.clear();

            for(DataSnapshot mDatabase : dataSnapshot.getChildren()){
                Activiteit activiteit = mDatabase.getValue(Activiteit.class);
                activiteiten.add(activiteit);
            }
        }


        public ArrayList<Activiteit> retrieve() {
            md.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    getData(dataSnapshot);
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                    getData(dataSnapshot);
                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            return activiteiten;
        }
    }

