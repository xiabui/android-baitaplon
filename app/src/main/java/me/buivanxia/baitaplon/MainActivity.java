package me.buivanxia.baitaplon;

import androidx.annotation.Nullable;
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
    String danhsach, so;
    int i = 0;
    Button btnBubbleSort, btnInsertionSort, btnSelectionSort, btnMergerSort, btnShellSort, btnThoat, btnNhap;
    ArrayList<String> list = new ArrayList();
    public  static final String BUNDLE="BUNDLE";
    public  static final String mangA="mang";
    private static final int REQUEST = 0x9345;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        //sự kiện click
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so = danhsach;
                list.add(tvNhapdayso.getText().toString());
                danhsach += list.get(i)+"";
                tvNhapdayso.setText(danhsach);
                i++;
                tvNhapdayso.setText("");
            }
        });
        btnSelectionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(1);
            }
        });

        btnBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(2);
            }
        });

        btnInsertionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(4);
            }
        });

        btnMergerSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(3);
            }
        });

        btnShellSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(5);
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
        String[] array = list.toArray(new String[list.size()]);
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        Bundle bundle = new Bundle();
        bundle.putStringArray(mangA, array);
        intent.putExtra(BUNDLE, bundle);
        startActivityForResult(intent, REQUEST);
    }

}