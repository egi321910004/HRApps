package com.example.kbmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Akun extends AppCompatActivity {
    ImageButton create,lihatdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_akun );

        create = findViewById(R.id.create);
        lihatdata = findViewById(R.id.lihatdata);

        lihatdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Akun.this, Dashboard.class);
                startActivity(i);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Akun.this, Createnew.class);
                startActivity(intent);


            }



        });
    }
}