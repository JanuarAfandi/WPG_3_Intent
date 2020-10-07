package com.pens.intentdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity<nama> extends AppCompatActivity {

    TextView tvNama, tvInstitusi;
    Button btnActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        final String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        btnActivity3 = findViewById(R.id.btn_activity3);
        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                moveIntent.putExtra(MainActivity.EXTRA_NAMA, nama);
                startActivity(moveIntent);
            }
        });

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama : ");
        } else {
            tvNama.setText("Nama : " + nama);
        }

        if (TextUtils.isEmpty(institusi)) {
            tvInstitusi.setText("Asal Institusi : ");
        } else {
            tvInstitusi.setText("Asal Institusi : " + institusi);
        }

    }
}