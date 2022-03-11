package ru.mirea.shutikova.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyLog";

    private EditText myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate() is running");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = (EditText) findViewById(R.id.myText);
    }

    public void onMyBtnClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("string", myText.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart() is running.");
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.i(TAG, "onRestoreInstanceState() is running.");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onPostCreate() is running.\nMostly we don't override it.");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume() is running.");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.i(TAG, "onPostResume() is running.\nMostly we don't override it.");
        super.onPostResume();
    }

    @Override
    public void onAttachedToWindow() {
        Log.i(TAG, "onAttachedToWindow() is running.");
        super.onAttachedToWindow();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause() is running.");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.i(TAG, "onSaveInstanceState() is running.");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop() is running.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy() is running.");
        super.onDestroy();
    }

    @Override
    public void onDetachedFromWindow() {
        Log.i(TAG, "onDetachedFroMWindow() is running.");
        super.onDetachedFromWindow();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "onRestart() is running.");
        super.onRestart();
    }

}