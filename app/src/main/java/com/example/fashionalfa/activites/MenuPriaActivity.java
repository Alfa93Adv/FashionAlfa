package com.example.fashionalfa.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fashionalfa.MainActivity;
import com.example.fashionalfa.R;
import com.example.fashionalfa.activitiesPria.PBajuActivity;
import com.example.fashionalfa.activitiesPria.PCelanaActivity;
import com.example.fashionalfa.activitiesPria.PJaketActivity;
import com.example.fashionalfa.activitiesPria.PKacamataActivity;
import com.example.fashionalfa.activitiesPria.PSandalActivity;
import com.example.fashionalfa.activitiesPria.PSepatuActivity;

public class MenuPriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pria);
    }

    public void ClickHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickBaju(View view) {
        Intent intent = new Intent(this, PBajuActivity.class);
        startActivity(intent);
    }

    public void ClickCelana(View view) {
        Intent intent = new Intent(this, PCelanaActivity.class);
        startActivity(intent);
    }

    public void ClickJaket(View view) {
        Intent intent = new Intent(this, PJaketActivity.class);
        startActivity(intent);
    }

    public void ClickSepatu(View view) {
        Intent intent = new Intent(this, PSepatuActivity.class);
        startActivity(intent);
    }

    public void ClickSandal(View view) {
        Intent intent = new Intent(this, PSandalActivity.class);
        startActivity(intent);
    }

    public void ClickKacamata(View view) {
        Intent intent = new Intent(this, PKacamataActivity.class);
        startActivity(intent);
    }
}
