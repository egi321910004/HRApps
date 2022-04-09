package com.example.kbmobile;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Createnew extends AppCompatActivity {

    Button simpan,kembali;
    EditText input_nama,input_nim,input_umur,input_password,input_tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createnew);

        simpan = findViewById(R.id.simpan);
        input_nama = findViewById(R.id.name);
        input_nim = findViewById(R.id.nim);
        input_umur = findViewById(R.id.umur);
        input_password = findViewById(R.id.password);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Createnew.this, Akun.class);
                startActivity(i);
            }
        });

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}