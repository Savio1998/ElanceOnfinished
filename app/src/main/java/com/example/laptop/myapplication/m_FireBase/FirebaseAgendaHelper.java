package com.example.laptop.myapplication.m_FireBase;

/**
 * Created by Sjoerdtje on 7/8/2016.
 */

import com.example.laptop.myapplication.m_Model.Afspraak;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
/**
 * Created by Oclemy on 6/21/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 * 1.SAVE DATA TO FIREBASE
 * 2. RETRIEVE
 * 3.RETURN AN ARRAYLIST
 */
public class FirebaseAgendaHelper {
    DatabaseReference db;
    Boolean saved;
    ArrayList<Afspraak> afspraken =new ArrayList<>();
    /*
 PASS DATABASE REFRENCE
  */
    public FirebaseAgendaHelper(DatabaseReference db) {
        this.db = db;
    }
    //WRITE IF NOT NULL
    public Boolean save(Afspraak afspraak)
    {
        if(afspraak ==null)
        {
            saved=false;
        }else
        {
            try
            {
                db.child("Afspraak").push().setValue(afspraak);
                saved=true;
            }catch (DatabaseException e)
            {
                e.printStackTrace();
                saved=false;
            }
        }
        return saved;
    }
    //IMPLEMENT FETCH DATA AND FILL ARRAYLIST
    private void fetchData(DataSnapshot dataSnapshot)
    {
        afspraken.clear();
        for (DataSnapshot ds : dataSnapshot.getChildren())
        {
            Afspraak afspraak =ds.getValue(Afspraak.class);
            afspraak.setKey(ds.getKey());
            afspraken.add(afspraak);
        }
    }


    //RETRIEVE
    public ArrayList<Afspraak> retrieve()
    {
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
        return afspraken;
    }

}