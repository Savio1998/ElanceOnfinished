package com.example.laptop.myapplication.Profiel.IU;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.laptop.myapplication.R;
import com.example.laptop.myapplication.Profiel.modules.Coachee;

import java.util.ArrayList;

/**
 * Created by Laptop on 14-7-2016.
 */
public class CostumAdapter extends BaseAdapter {
    Context c;
    ArrayList<Coachee> coachees;

    public CostumAdapter(Context c, ArrayList<Coachee> coachees) {
        this.c = c;
        this.coachees = coachees;
    }

    @Override
    public int getCount() {
        return coachees.size();
    }

    @Override
    public Object getItem(int position) {
        return coachees.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(c).inflate(R.layout.module,parent,false);
        }

        TextView naamText= (TextView) convertView.findViewById(R.id.naamText);
        TextView telText= (TextView) convertView.findViewById(R.id.telText);
        TextView emailText= (TextView) convertView.findViewById(R.id.emailText);

        final Coachee s= (Coachee) this.getItem(position);

        naamText.setText(s.getCeNaam());
        telText.setText(s.getCeTel());
        emailText.setText(s.getCeEmail());


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(c,s.getCeNaam(),Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
