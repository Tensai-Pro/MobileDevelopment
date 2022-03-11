package ru.mirea.shutikova.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnShowDialog(View view) {
        MyDialogClass dialog = new MyDialogClass();
        dialog.show(getSupportFragmentManager(), "App");
    }

    public void onPositiveClicked() {
        Toast.makeText(getApplicationContext(),
                "You clicked \"Yes\" button!",
                Toast.LENGTH_SHORT).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(),
                "You clicked \"Not sure\" button!",
                Toast.LENGTH_SHORT).show();
    }
    public void onNegativeClicked() {
        Toast.makeText(getApplicationContext(),
                "You clicked \"No\" button!",
                Toast.LENGTH_SHORT).show();
    }
}