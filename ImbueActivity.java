package com.seifviploader;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ImbueActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView message = new TextView(this);
        message.setText("IMBUE (PYTHON)\nلم يتم إرسال كود Imbue بعد.");
        message.setTextSize(20);
        message.setPadding(32, 32, 32, 32);
        setContentView(message);
    }
}
