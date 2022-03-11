package ru.mirea.shutikova.intentfilter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnToInternet, btnToAnotherApp;
    private EditText text;

    private static final String TAG = "MyLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate() is running.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToInternet = (Button) findViewById(R.id.btnToInternet);
        btnToAnotherApp = (Button) findViewById(R.id.btnAnotherApp);
        text = (EditText) findViewById(R.id.text);
    }

    public void onBtnToInternetClick(View view) {
        Uri address = Uri.parse("https://genius.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, address);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.i(TAG, "Не получается обработать намерение!");
        }
    }

    public void onBtnAnotherApp(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra("string", text.getText().toString());
        startActivity(Intent.createChooser(intent, "What the fuck"));
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