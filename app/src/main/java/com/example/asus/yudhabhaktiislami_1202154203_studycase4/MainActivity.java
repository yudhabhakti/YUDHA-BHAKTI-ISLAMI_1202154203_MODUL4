package com.example.asus.yudhabhaktiislami_1202154203_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button list,pencarigambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //untuk mencari berdasarkan id
        list = findViewById(R.id.listmahasiswa);
        pencarigambar = findViewById(R.id.carigambar);

            //Untuk melanjutkan ke kelas berikutnya
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,list_nama.class);
                startActivity(a);
            }
        });
        //Untuk melanjutkan ke kelas berikutnya
        pencarigambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,pencari_gambar.class);
                startActivity(b);
            }
        });
    }
}
