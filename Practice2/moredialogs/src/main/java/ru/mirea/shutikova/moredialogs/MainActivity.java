package ru.mirea.shutikova.moredialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import ru.mirea.shutikova.moredialogs.MyTimeDialogFragment;

public class MainActivity extends AppCompatActivity {

    private Button timeBtn, dateBtn;
    private TextView timeText, dateText;

    MyTimeDialogFragment timeDialog;
    MyDateDialogFragment dateDialog;
    MyProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeBtn = (Button) findViewById(R.id.timeBtn);
        timeText = (TextView) findViewById(R.id.timeText);
        dateBtn = (Button) findViewById(R.id.dateBtn);
        dateText = (TextView) findViewById(R.id.dateText);

        timeDialog = new MyTimeDialogFragment();
        dateDialog = new MyDateDialogFragment();
        progressDialog = new MyProgressDialog();
    }

    public void onTimeBtnClick(View view) {
        timeDialog.show(getSupportFragmentManager(), "time");
    }

    public void onDateBtnClick(View view) {
        dateDialog.show(getSupportFragmentManager(), "date");
    }

    public void onLoadBtn(View view) {
        progressDialog.show(getSupportFragmentManager(), "progress");
    }

    public void onLoadClicked() {
        int hour = Calendar.getInstance().get(Calendar.HOUR);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        timeText.setText("Time is " + hour + " hours " + min + " minutes");
        dateText.setText("Date is " + day + "/" + month + "/" + year);
    }

    TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int min) {
            timeText.setText("Time is " + hour + " hours " + min + " minutes");
        }
    };

    DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            dateText.setText("Date is " + day + "/" + month + "/" + year);
        }
    };
}