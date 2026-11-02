package com.seifviploader;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerDetectorActivity extends AppCompatActivity {
    private TextView txtLog;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_detector_layout);

        txtLog = findViewById(R.id.txtLog);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> {
            btnStart.setEnabled(false);
            txtLog.append("جاري البحث عن أماكن اللاعبين...\n");
            txtLog.append("----------------------------------\n");
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                runOnUiThread(() -> {
                    txtLog.append("✅ نتيجة تجريبية: Playzone 1\n");
                    txtLog.append("📝 عدد تجريبي: 45\n");
                    txtLog.append("📍 الموقع التجريبي: Erangel\n");
                    txtLog.append("----------------------------------\n");
                    btnStart.setEnabled(true);
                    Toast.makeText(this, "هذه بيانات محاكاة وليست كشفًا حقيقيًا", Toast.LENGTH_LONG).show();
                });
            }).start();
        });
    }
}
