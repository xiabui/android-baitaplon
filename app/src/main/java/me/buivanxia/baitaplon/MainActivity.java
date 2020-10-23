package me.buivanxia.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNhapdayso;
    EditText txtNhapdayso;
    Button btnBubbleSort, btnInsertionSort, btnSelectionSort, btnMergerSort, btnShellSort, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBubbleSort = (Button) findViewById(R.id.btnBubbleSort);
        btnBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);

                startActivity(intent);
            }
        });

        btnInsertionSort = (Button) findViewById(R.id.btnInsertionSort);
        btnInsertionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);

                startActivity(intent);
            }
        });

        btnMergerSort = (Button) findViewById(R.id.btnMergeSort);
        btnMergerSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);

                startActivity(intent);
            }
        });

        btnSelectionSort = (Button) findViewById(R.id.btnSelectionSort);
        btnSelectionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);

                startActivity(intent);
            }
        });

        btnShellSort = (Button) findViewById(R.id.btnShellSort);
        btnShellSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);

                startActivity(intent);
            }
        });
        btnThoat = (Button) findViewById(R.id.btnThoat);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}