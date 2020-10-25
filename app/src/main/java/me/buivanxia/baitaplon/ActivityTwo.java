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
    int[] mangB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvKetqua = (TextView) findViewById(R.id.tvKetqua);

        hienthi();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(MainActivity.BUNDLE);
        String[] mang=bundle.getStringArray(MainActivity.mangA);
        mangB = ChuyenChuoiThanhInt(mang);

        btnQuaylai = (Button) findViewById(R.id.btnQuaylai);
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });
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