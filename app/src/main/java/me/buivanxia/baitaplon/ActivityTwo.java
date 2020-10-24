package me.buivanxia.baitaplon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {
    Button btnQuaylai;
    TextView tvKetqua;
    int a[];
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        tvKetqua = (TextView) findViewById(R.id.tvKetqua);

       // tvKetqua.setText(Selection_Sort(a, n));


        btnQuaylai = (Button) findViewById(R.id.btnQuaylai);
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }

    


}

