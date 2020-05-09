package com.example.currencypal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyCalc(View view) {

        EditText defaultCurrency = (EditText) findViewById(R.id.defaultCurrency);

        Double defaultCurrencyButton = Double.parseDouble(defaultCurrency.getText().toString());
        Double convertedCurrency = defaultCurrencyButton * 75.5;
        Toast.makeText(MainActivity.this, "Rupee: " + convertedCurrency, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
