package com.example.daffodil.demoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by daffodil on 18/10/16.
 */
public class MyAdapter extends ArrayAdapter<Student> {

    int resource;
    Context context;
    public MyAdapter(Context context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;



    }


    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){

        LayoutInflater inflater= (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =inflater.inflate(this.resource,parent,false);


        }
        TextView tv=(TextView)convertView.findViewById(R.id.name);
        tv.setText(this.getItem(position).getName());


        return convertView;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
