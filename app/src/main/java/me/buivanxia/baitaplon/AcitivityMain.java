package me.buivanxia.baitaplon;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AcitivityMain extends AppCompatActivity {

    int[] listNumber = new int[1000];
    int j = 0;


    public  static final String BUNDLE="BUNDLE";
    public  static final String mangB="mang";
    public  static final String chon="chon";
    private static final int REQUEST = 0x9345;
    ArrayList<String> list = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText tvNhapdayso = (EditText) findViewById(R.id.tvNhapdayso);
        Button btnBubbleSort, btnInsertionSort, btnSelectionSort, btnMergerSort, btnShellSort, btnThoat, btnNhap;

        btnBubbleSort = (Button) findViewById(R.id.btnBubbleSort);
        btnInsertionSort = (Button) findViewById(R.id.btnInsertionSort);
        btnMergerSort = (Button) findViewById(R.id.btnMergeSort);
        btnShellSort = (Button) findViewById(R.id.btnShellSort);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        btnSelectionSort = (Button) findViewById(R.id.btnSelectionSort);
        btnNhap = (Button) findViewById(R.id.btnNhap);

        //sự kiện click
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvNhapdayso.length() != 0) {
                    String intArray = tvNhapdayso.getText().toString() + " ";
                    String s = "";
                    System.out.println(intArray.length());

                    for(int i = 0; i < intArray.length(); i++) {
                        if(intArray.charAt(i) != ' ') {
                            s += intArray.charAt(i);
                        } else {
                            listNumber[j] = Integer.parseInt(s);
                            j++;
                            s = "";
                        }
                    }
                }
            }
        });
        btnBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(2);
            }
        });

        btnSelectionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(1);
            }
        });

        btnShellSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xuli(5);
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

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void Anhxa()
    {

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
    public void Xuli(int n)
    {
        String[] array = list.toArray(new String[list.size()]);
        Intent intent = new Intent(AcitivityMain.this, ActivityTwo.class);
        Bundle bundle = new Bundle();
        bundle.putIntArray(mangB, listNumber);
        bundle.putInt("length", j);
        bundle.putInt(chon, n);
        intent.putExtra(BUNDLE, bundle);
        startActivityForResult(intent, REQUEST);
    }

}