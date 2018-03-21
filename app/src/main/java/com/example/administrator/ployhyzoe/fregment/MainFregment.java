package com.example.administrator.ployhyzoe.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.ployhyzoe.R;

/**
 * Created by Administrator on 20/3/2561.
 */

public class MainFregment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //register controller
        TextView textView = getView().findViewById(R.id.txtreg);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Replace Fregment
               getActivity().getSupportFragmentManager()
                       .beginTransaction()
                       .replace(R.id.contentmainfragment,new RegisterFregment())
                       .addToBackStack(null)
                       .commit();


            }
        });
    }//main medthod

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fregment_name,container,false);
        return view;
    }
}//main class
