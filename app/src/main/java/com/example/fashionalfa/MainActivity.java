package com.example.fashionalfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fashionalfa.activites.BajuActivity;
import com.example.fashionalfa.activites.CelanaActivity;
import com.example.fashionalfa.activites.JaketActivity;
import com.example.fashionalfa.activites.KacamataActivity;
import com.example.fashionalfa.activites.SepatuActivity;
import com.example.fashionalfa.activites.SetelanActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickBaju(View view) {
        Intent intent = new Intent(this, BajuActivity.class);
        startActivity(intent);
    }

    public void onClickSetelan(View view) {
        Intent intent = new Intent(this, SetelanActivity.class);
        startActivity(intent);
    }

    public void onClickSepatu(View view) {
        Intent intent = new Intent(this, SepatuActivity.class);
        startActivity(intent);
    }

    public void onClickJaket(View view) {
        Intent intent = new Intent(this, JaketActivity.class);
        startActivity(intent);
    }

    public void onClickCelana(View view) {
        Intent intent = new Intent(this, CelanaActivity.class);
        startActivity(intent);
    }

    public void onClickKacamata(View view) {
        Intent intent = new Intent(this, KacamataActivity.class);
        startActivity(intent);
    }
}
