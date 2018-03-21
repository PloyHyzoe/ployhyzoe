package com.example.administrator.ployhyzoe.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.support.v7.app.AlertDialog;

import com.example.administrator.ployhyzoe.R;

/**
 * Created by Administrator on 21/3/2561.
 */

public class MyAlert {
        private Context context ;

    public MyAlert(Context context) {
        this.context = context;
    }
    public void myDialog(String titlestring, String messageString) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_name);
        builder.setTitle(titlestring);
        builder.setMessage(messageString);
        builder.setPositiveButton(text"ok",new DialogInterface.OnCancelListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {

                dialogInterface .dismiss() ;

            }
        }};
        }





    }



} // Main Class
