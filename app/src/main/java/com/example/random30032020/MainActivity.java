package com.example.random30032020;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtSobatdau,mEdtSoketthuc;
    Button mBtnNgaunhien;
    TextView mTvKetqua;
    Random mRandom;
    String mTextSobatdau,mTextSoketthuc;
    int mSobatdau,mSoketthuc;
    int mKetqua = 0;
    String mValueKetqua = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSobatdau = findViewById(R.id.edittextSobatdau);
        mEdtSoketthuc = findViewById(R.id.edittextSoKetthuc);
        mBtnNgaunhien = findViewById(R.id.buttonNgaunhien);
        mTvKetqua = findViewById(R.id.textviewKetqua);

        mRandom = new Random();
        // Task 1 : Khi nhấn random các giá trị xuất ra sẽ không trùng
            // Xử lý cho người dùng add các số vào 1 mảng
                // UI : Thêm 1 button add mảng , thêm 1 button reset để người dùng thay đổi
                // Code : Tìm hiểu về arraylist để xử lý cho mảng
            // Khi random xong xóa nó khỏi mảng để không bị trùng giá trị

        // Task 2 : Khi nhấn random
//                    + Khi còn dữ liệu : 1 - 2 - 3 - 4 -
//                    + Khi hết dữ liệu : 1 - 2 - 3 - 4 - 5

        mBtnNgaunhien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextSobatdau = mEdtSobatdau.getText().toString();
                mTextSoketthuc = mEdtSoketthuc.getText().toString();
                if (mTextSobatdau.isEmpty() || mTextSoketthuc.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                mSobatdau = Integer.parseInt(mTextSobatdau);
                mSoketthuc = Integer.parseInt(mTextSoketthuc);

                if (mSobatdau >= mSoketthuc){
                    mSoketthuc = mSobatdau + 1;
                    mEdtSoketthuc.setText(mSoketthuc + "");
                }
                // 1 - 4 - 6 - 10 - 10 - 11
                mKetqua = mRandom.nextInt(mSoketthuc - mSobatdau + 1) + mSobatdau;
                mTvKetqua.append(mKetqua + " - ");
            }
        });
    }
}
