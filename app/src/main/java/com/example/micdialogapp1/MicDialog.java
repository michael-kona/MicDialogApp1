package com.example.micdialogapp1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MicDialog extends DialogFragment
    {
    AlertDialog.Builder adb;
    @NonNull
    public Dialog onCreateDialog(Bundle b)
            {
                try {
                adb=new AlertDialog.Builder(adb.getContext());
                adb.setMessage("Welcome to Dialogs in Android app");
                adb.setCancelable(true);
                adb.setTitle("MicDialog created by Michael");
                adb.setPositiveButton("Thank you", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(adb.getContext(), "Thank U", Toast.LENGTH_SHORT).show();
                            }
                        });
                        adb.setNegativeButton("Bye Bye", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(adb.getContext(), "Bye", Toast.LENGTH_SHORT).show();
                            }
                        });

                }
                catch (Exception ex)
                {
                    Toast.makeText(adb.getContext(),ex.getMessage(), Toast.LENGTH_LONG).show();
                }
                return adb.create();
            }

    }
