package com.example.myapplicationwithgit;

import static java.lang.System.exit;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableDeMultiplication extends AppCompatActivity {

    EditText edt_num;
    Button btn_reinit, btn_ann, btn_aff;
    TextView tv_multip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_num = findViewById(R.id.edt_num);
        btn_ann = findViewById(R.id.btn_ann);
        btn_reinit = findViewById(R.id.btn_reinit);
        tv_multip = findViewById(R.id.tv_multi);

        btn_reinit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_num.setText("");
                tv_multip.setText(R.string.table);


            }
        });

        btn_ann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}