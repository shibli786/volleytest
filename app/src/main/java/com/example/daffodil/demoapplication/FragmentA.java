package com.example.daffodil.demoapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by daffodil on 19/10/16.
 */
public class FragmentA extends Fragment{


    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

  View view= inflater.inflate(R.layout.fragmet_a,container,false);

        Toast.makeText(getActivity(),"view Created",Toast.LENGTH_LONG).show();


        gridView= (GridView) view.findViewById(R.id.gridView);

        GridAdapter adapter= new GridAdapter(getActivity());
        gridView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);


    }
}
