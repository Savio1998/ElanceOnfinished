package com.example.laptop.myapplication.Profiel.Firebase;

import com.example.laptop.myapplication.Profiel.modules.Coachee;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

/**
 * Created by Laptop on 14-7-2016.
 */
public class FirebaseHelper {

    DatabaseReference db;
    Boolean saved;
    ArrayList<Coachee> coachees=new ArrayList<>();

    public FirebaseHelper(DatabaseReference db) {
        this.db = db;
    }

    public Boolean save(Coachee coachee){

        if(coachee==null){
            saved=false;
        }else{

            try{
                db.child("Coachee").push().setValue(coachee);
                saved=true;
            }catch (DatabaseException e){
                e.printStackTrace();
                saved=false;
            }
        }

        return saved;
    }

    private void fetchData(DataSnapshot dataSnapshot){

        coachees.clear();

        for (DataSnapshot ds : dataSnapshot.getChildren()){

            Coachee coachee=ds.getValue(Coachee.class);
            coachees.add(coachee);
        }
    }

    public ArrayList<Coachee> retrieve(){

        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
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

        return coachees;
    }
}
