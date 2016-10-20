package com.example.daffodil.demoapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by daffodil on 19/10/16.
 */
public class GridAdapter extends BaseAdapter {

    public  String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};



    Context context;
    GridAdapter(Context context){
        super();
        this.context=context;

        Toast.makeText(context,"Grid adapter is called",Toast.LENGTH_LONG).show();


    }
    @Override
    public int getCount() {
        return prgmNameList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Toast.makeText(context,"GEt view Called",Toast.LENGTH_LONG).show();
       if(convertView==null){
           LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView=inflater.inflate(R.layout.grid_view,parent,false);

       }
        TextView tv= (TextView) convertView.findViewById(R.id.gridId);
        tv.setText(prgmNameList[position]);
        return convertView;
    }
}
