package com.pens.intentdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvNama;
    Button btnActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvNama = findViewById(R.id.tv_nama);
        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);

        btnActivity1 = findViewById(R.id.btn_activity1);
        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(moveIntent);
            }
        });

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama Saya ");
        } else {
            tvNama.setText("Nama Saya " + nama);
        }
    }
}

