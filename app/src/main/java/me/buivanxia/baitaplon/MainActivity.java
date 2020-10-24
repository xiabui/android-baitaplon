package me.buivanxia.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvNhapdayso;
    EditText txtNhapdayso;
    Button btnBubbleSort, btnInsertionSort, btnSelectionSort, btnMergerSort, btnShellSort, btnThoat;
    ArrayList<String> list = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        //sự kiện click
        btnSelectionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);

                startActivity(intent);
            }
        });

        btnInsertionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnMergerSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnShellSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void Anhxa()
    {
        btnBubbleSort = (Button) findViewById(R.id.btnBubbleSort);
        btnInsertionSort = (Button) findViewById(R.id.btnInsertionSort);
        btnMergerSort = (Button) findViewById(R.id.btnMergeSort);
        btnShellSort = (Button) findViewById(R.id.btnShellSort);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        btnSelectionSort = (Button) findViewById(R.id.btnSelectionSort);
    }

    public void Xuli(int n)
    {

        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        Bundle bundle = new Bundle();

    }
}