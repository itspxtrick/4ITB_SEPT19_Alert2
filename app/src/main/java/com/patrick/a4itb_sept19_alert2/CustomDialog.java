package com.patrick.a4itb_sept19_alert2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by poros_000 on 9/19/2017.
 */

public class CustomDialog extends DialogFragment {
    LayoutInflater inflater;
    View v;
    EditText etUsername, etPassword;

    public Dialog onCreateDialog(Bundle savedInstancedState) {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.custom_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v)
                .setCancelable(true)
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity(), "OK was clicked", Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}
