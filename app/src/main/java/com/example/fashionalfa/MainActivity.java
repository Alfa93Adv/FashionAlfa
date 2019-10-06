package com.example.fashionalfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fashionalfa.activites.MenuPriaActivity;
import com.example.fashionalfa.activites.MenuWanitaActivity;
import com.example.fashionalfa.activitiesPria.PBajuActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickPakaianPria(View view) {
        Intent intent = new Intent(this, MenuPriaActivity.class);
        startActivity(intent);
    }

    public void ClickPakaianWanita(View view) {
        Intent intent = new Intent(this, MenuWanitaActivity.class);
        startActivity(intent);
    }
}
