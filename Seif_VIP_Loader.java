package com.seifviploader;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Seif_VIP_Loader extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seif_layout);

        Button btnSpeed = findViewById(R.id.btnSpeed);
        Button btnImbue = findViewById(R.id.btnImbue);
        Button btnMap = findViewById(R.id.btnMap);
        Button btnPlayerDetect = findViewById(R.id.btnPlayerDetect);
        Button btnFirewall = findViewById(R.id.btnFirewall);

        btnSpeed.setOnClickListener(v ->
            Toast.makeText(this, "ميزة السرعة غير مفعّلة في هذه النسخة التجريبية", Toast.LENGTH_SHORT).show());

        btnImbue.setOnClickListener(v -> startActivity(new Intent(this, ImbueActivity.class)));

        btnMap.setOnClickListener(v ->
            Toast.makeText(this, "كشف الخريطة غير موصول بمصدر بيانات", Toast.LENGTH_SHORT).show());

        btnPlayerDetect.setOnClickListener(v ->
            startActivity(new Intent(this, PlayerDetectorActivity.class)));

        btnFirewall.setOnClickListener(v ->
            Toast.makeText(this, "الجدار الناري غير مفعّل في هذه النسخة التجريبية", Toast.LENGTH_SHORT).show());
    }
}
