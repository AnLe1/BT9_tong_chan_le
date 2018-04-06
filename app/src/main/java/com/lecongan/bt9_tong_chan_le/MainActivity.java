package com.lecongan.bt9_tong_chan_le;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2;
    private TextView tv, tvS;
    private EditText edt;
    int m, n, i, tong1 = 0, s = 0;
    String chuoi = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText) findViewById(R.id.edt_num);
        tv = (TextView) findViewById(R.id.tv_kq);
        tvS = (TextView) findViewById(R.id.tv_tong);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = edt.getText().toString();
//
                if (!number.equals("")) {
//                    ChanLe(n);
//                    ChanLeXenkeCongTru();
                    test();
                    btn2.setEnabled(true);
                    btn1.setEnabled(false);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi = "";
                tong1 = 0;
                edt.setText("");
                btn1.setEnabled(true);
                btn2.setEnabled(false);
                tv.setText("");

            }
        });
    }

    public void ChanLe(int m) {
        int tong1 = 0;
        m = Integer.parseInt(edt.getText().toString());
        if (m % 2 == 0) {
            for (i = 1; i <= (m - 1); i++) {
                if (i % 2 != 0) {

//                    if (tong1<=m){
                    tong1 = tong1 + i;
                    chuoi += String.valueOf(i);
                    chuoi += (i != m) ? "+" : "";
//                    }else{
//
//                    }
                    tv.setText(m + " là số chẵn " + "\n" + "S= " + chuoi.substring(0, chuoi.length() - 1) + "\nS= " + tong1);

                }

            }
        } else {
            for (int i = 1; i <= m; i++) {
                if (i % 2 != 0) {
                    tong1 = tong1 + i;
                    chuoi += String.valueOf(i);
                    chuoi += (i != m) ? "+" : "";
                }
                tv.setText(m + " là số lẻ " + "\n" + "S= " + chuoi + "\nS= " + tong1);
            }
        }

    }

    public void test() {
        m = Integer.parseInt(edt.getText().toString());
        if (m % 2 != 0) {
            int i, j = -3, s = 0;
            for (i = 1; i <= m; i += 4) {

                chuoi += String.valueOf(i + "" + j);
                j -= 4;

                if (i % 2 != 0) {
                    chuoi += (i != m) ? "+" : "";
                }

            }
            tvS.setText(String.valueOf(s+i+j));





            tv.setText(chuoi.substring(0, chuoi.length() - 1));

        } else {
            int i, j = -3;
            for (i = 1; i <= (m - 1); i += 4) {
                chuoi += String.valueOf(i + "" + j);
                j -= 4;
                if (i % 2 != 0) {
                    chuoi += (i != m) ? "+" : "";
                }
            }
            tv.setText(chuoi.substring(0, chuoi.length() - 1));
        }
    }

}


