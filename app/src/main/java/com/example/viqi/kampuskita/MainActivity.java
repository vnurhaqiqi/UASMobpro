package com.example.viqi.kampuskita;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveActivity(Class classname) {
        startActivity(new Intent(MainActivity.this, classname));
    }

    public void btnTentang(View view) {
        moveActivity(ActivityTentang.class);
    }

    public void btnLokasi(View view) {
        moveActivity(MapsActivity.class);
    }

    public void btnProfil(View view) {
        moveActivity(ProfilActivity.class);
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa Anda ingin keluar ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}
