package com.example.random30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtSobatdau,mEdtSoketthuc;
    Button mBtnNgaunhien;
    TextView mTvKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSobatdau = findViewById(R.id.edittextSobatdau);
        mEdtSoketthuc = findViewById(R.id.edittextSoKetthuc);
        mBtnNgaunhien = findViewById(R.id.buttonNgaunhien);
        mTvKetqua = findViewById(R.id.textviewKetqua);

        // Làm tròn lên : ceil
        // Làm tròn xuống : floor
//        int a = 5;
//        int b = 10;
//        int c = Math.max(a , b);
//        Log.d("BBB",c + "");
        // 0 ~ 1 * 5
//        for (int i = 0 ; i<100 ; i++){
//            double value = Math.floor(Math.random() * 6);
//            if (value == 0)
//            Log.d("BBB",value +"");
//        }

        Random random = new Random();
        // 0 -> 5
        // 5 - 11
        for (int i = 0 ; i< 10 ; i++){
            int value = random.nextInt(7) + 5;
            Log.d("BBB",value + "");
        }

    }
}
