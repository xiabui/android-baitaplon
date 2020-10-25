package me.buivanxia.baitaplon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import me.buivanxia.baitaplon.ort.BubbdleSort;
import me.buivanxia.baitaplon.ort.InsertionSort;
import me.buivanxia.baitaplon.ort.SelectionSort;

public class ActivityTwo extends AppCompatActivity {
    Button btnQuaylai;
    TextView tvKetqua;
    int loai;
    Sort ort;
    int n;
    int[] mangB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Anhxa();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(AcitivityMain.BUNDLE);
        String[] mang = bundle.getStringArray(AcitivityMain.mangB);
        loai = bundle.getInt(AcitivityMain.chon);
        mangB = ChuyenChuoiThanhInt(mang);
        chon(loai, mangB);
        hienthi();


        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, AcitivityMain.class);
                startActivity(intent);
            }
        });
    }
    public int[] chon(int loai,int[] array)
    {
        switch (loai)
        {
            case 1:
                ort = new BubbdleSort();
                break;
            case 2:
                ort = new SelectionSort();
                break;
            /*case 3:
                ort = new ShellSort();
                txtTieuDeSort.setText("Quick Sort");
                break;/*/
            case 4:
                ort = new InsertionSort();
                break;
            /*case 5:
                sorter = new ShellSort();
                txtTieuDeSort.setText("Shell Sort");
                break;*/
        }
        ort.sort(array);
        return array;
    }
    public void Anhxa()
    {
        tvKetqua = (TextView) findViewById(R.id.tvKetqua);
        btnQuaylai = (Button) findViewById(R.id.btnQuaylai);
    }
    public int[] ChuyenChuoiThanhInt(String[] mang)
    {
        int[] n = new int[mang.length];
        for(int i = 0; i < mang.length; i++)
        {
            n[i]=Integer.parseInt(mang[i]);
        }
        return n;
    }
    public void hienthi()
    {
        String chuoi=" ";
        for(int i = 0; i < mangB.length; i++)
        {
            chuoi +=mangB[i] + " ";
        }
        tvKetqua.setText(chuoi);
    }
}