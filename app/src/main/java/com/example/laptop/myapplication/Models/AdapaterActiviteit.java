package com.example.laptop.myapplication.Models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.laptop.myapplication.R;
import java.util.ArrayList;

/**
 * Created by klinten on 7/15/2016.
 */
public class AdapaterActiviteit extends BaseAdapter {
    Context c;
    ArrayList<Activiteit> activiteiten;

    public AdapaterActiviteit(Context c, ArrayList<Activiteit> activiteiten) {
        this.c = c;
        this.activiteiten = activiteiten;
    }

    @Override
        public int getCount() {
            return activiteiten.size();
        }

        @Override
        public Object getItem(int position) {
            return activiteiten.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(c).inflate(R.layout.modelplaats, parent, false);
            }

            TextView titelText = (TextView) convertView.findViewById(R.id.titleText);
            TextView watText = (TextView) convertView.findViewById(R.id.watText);
            TextView doelText = (TextView) convertView.findViewById(R.id.doelText);
            TextView uitlegText = (TextView) convertView.findViewById(R.id.uitlegText);
            TextView vaardighedenText = (TextView) convertView.findViewById(R.id.vaardighedenText);

            ListView activiteitList = (ListView) convertView.findViewById(R.id.listActiviteit);
            final Activiteit a = (Activiteit) this.getItem(position);

            titelText.setText(a.getTitel());
            watText.setText(a.getWat());
            doelText.setText(a.getDoel());
            uitlegText.setText(a.getUitleg());
            vaardighedenText.setText(a.getVaardigheden());

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(c, a.getTitel(), Toast.LENGTH_SHORT).show();

                }
            });
            return convertView;
        }

}
