package com.example.administrator.ployhyzoe.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.administrator.ployhyzoe.MainActivity;
import com.example.administrator.ployhyzoe.R;
import com.example.administrator.ployhyzoe.utility.MyAlert;

/**
 * Created by Administrator on 21/3/2561.
 */

public class RegisterFregment extends Fragment {

    //    Explicit
    private String nameString, userString, passwordString;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
        //        Create Toolbar




    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarregister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

//        Setup Title
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Register");

//        Show Navigator Icon
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }

    //register controller
    private void registerController() {
        Button button = getView().findViewById(R.id.BTreg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }


            //                Get Value From EditText
            EditText nameEditText = getView().findViewById(R.id.edtname);
            EditText userEditText = getView().findViewById(R.id.edtuser);
            EditText passwordEditText = getView().findViewById(R.id.edtpass);

//                Change EditText to String
            nameString = nameEditText.getText().toString().trim();
            userString = userEditText.getText().toString().trim();
            passwordString = passwordEditText.getText().toString().trim();

//                Check Space
                if (nameString.isEmpty() || userString.isEmpty() || passwordString.isEmpty()) {
//                    Have Space
                MyAlert myAlert = new MyAlert(getActivity());
                myAlert.myDialog("Have Space", "Please Fill All Blank");
            } else {
//                    No Space

            }



        }
    });
        }


        }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fregment_register, container, false);
                return view;
    }
}  //mainclass
