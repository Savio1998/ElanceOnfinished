package com.example.laptop.myapplication.m_UI;

/**
 * Created by Sjoerdtje on 7/8/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.example.laptop.myapplication.R;
import com.example.laptop.myapplication.m_Model.Afspraak;
import java.util.ArrayList;
/**
 * Created by Oclemy on 6/21/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 * 1. where WE INFLATE OUR MODEL LAYOUT INTO VIEW ITEM
 * 2. THEN BIND DATA
 */
public class CustomAdapter extends BaseAdapter{
    Context c;
    ArrayList<Afspraak> afspraken;
    public CustomAdapter(Context c, ArrayList<Afspraak> afspraken) {
        this.c = c;
        this.afspraken = afspraken;
    }
    @Override
    public int getCount() {
        return afspraken.size();
    }
    @Override
    public Object getItem(int position) {
        return afspraken.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(c).inflate(R.layout.modelagenda,parent,false);
        }
        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);
        TextView propTxt= (TextView) convertView.findViewById(R.id.propellantTxt);
        TextView descTxt= (TextView) convertView.findViewById(R.id.descTxt);

        final Afspraak s= (Afspraak) this.getItem(position);

        nameTxt.setText(s.getName());
        propTxt.setText(s.getPropellant());
        descTxt.setText(s.getDescription());
        //ONITECLICK
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,s.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

}