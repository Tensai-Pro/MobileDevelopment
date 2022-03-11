package ru.mirea.shutikova.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialogClass extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Hello, user!")
                .setMessage("Are you doing good?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Yes!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity)getActivity()).onPositiveClicked();
                        dialogInterface.cancel();
                    }
                })
                .setNeutralButton("Not sure", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity)getActivity()).onNeutralClicked();
                        dialogInterface.cancel();
                    }
                })
                .setNegativeButton("No...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity)getActivity()).onNegativeClicked();
                        dialogInterface.cancel();
                    }
                });
        return builder.create();
    }
}
