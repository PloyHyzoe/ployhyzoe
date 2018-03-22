package com.example.administrator.ployhyzoe.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.ployhyzoe.R;
import com.example.administrator.ployhyzoe.utility.GetAllUser;
import com.example.administrator.ployhyzoe.utility.MyAlert;
import com.example.administrator.ployhyzoe.utility.MyConstant;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Administrator on 20/3/2561.
 */

public class MainFregment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //register controller
        registerController();

//        log in controller

        logInController();
    }//main medthod

    private void logInController() {
        Button button = getView().findViewById(R.id.btnlogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEditText = getView().findViewById(R.id.edtuser);
                EditText passEditText = getView().findViewById(R.id.edtpass);

                String userString = userEditText.getText().toString().trim();
                String passString = passEditText.getText().toString().trim();

                if (userString.isEmpty()|| passString.isEmpty()) {
                 // have space
                    MyAlert myAlert = new MyAlert(getActivity());
                    myAlert.myDialog (getString(R.string.have_space),
                    getString(R.string.message_have_space));


                } else {
                    // no space
                try {
                    MyConstant myConstant = new MyConstant();
                    GetAllUser getAllUser = new GetAllUser(getActivity());
                    getAllUser.execute(myConstant.getUrlGetalluserString());

                    String jsonString = getAllUser.get();
                    Log.d("22marchV1", "json ===" + jsonString);

                    String[] collumUserStrings = myConstant.getLoginStrings();
                    String[] loginStrings = new String[collumUserStrings.length];
                    Boolean statusbool = true;

                    JSONArray jsonArray = new JSONArray(jsonString);
                    for (int i = 0; i < jsonArray.length(); i += 1) {

                        JSONObject jsonObject = jsonArray.getJSONObject(1);
                        if (userString.equals(jsonObject.getString(collumUserStrings[2]))) ;

                        statusbool = false;
                        for (int i1 = 0; i1 < collumUserStrings.length; i1 += 1) {

                            loginStrings[1] = jsonObject.getString(collumUserStrings[1]);
                            Log.d("22MarchV1", "LoginString1" + i1 + "LoginStrings[i1]");


                    } // if


                    } //for

                    if (statusbool) {
                        MyAlert myAlert = new MyAlert(getActivity());
                        myAlert.myDialog("user False",
                                "No this user in mysql");

                    } else if
                        (passString.equals(loginStrings[3])){
                            Toast.makeText(getActivity(),"Welcome"+loginStrings[1],Toast.LENGTH_SHORT).show();
                        }
                        //passwors true

                     else {
                        //passwors false
                        MyAlert myAlert = new MyAlert(getActivity());
                        myAlert.myDialog("password false","please try again password is fail");
                    }



                    } catch (Exception e){
                        e.printStackTrace();
                     }
                }
            }   //on click
        });
    }

    private void registerController() {
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
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fregment_name,container,false);
        return view;
    }
}//main class
