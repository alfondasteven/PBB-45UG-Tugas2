package com.fonda.tugaspertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView angkaCounnter;
    int angka = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkaCounnter = findViewById(R.id.counter);

    }

    public void toastklik(View view) {
        Toast.makeText(this, "INI ADALAH TOMBOL TOAST", Toast.LENGTH_LONG).show();
    }

    public void countklik(View view) {
        angka = angka+1;
        angkaCounnter.setText(Integer.toString(angka));
    }

}