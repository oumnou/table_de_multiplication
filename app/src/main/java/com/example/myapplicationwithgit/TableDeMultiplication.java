package com.example.myapplicationwithgit;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableDeMultiplication extends AppCompatActivity {

    EditText edt_num;
    Button btn_reinit, btn_ann, btn_aff, btn_color1, btn_color2, btn_color3 ;
    android.support.constraint.ConstraintLayout relativeLayout;



    TextView tv_multip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_num = findViewById(R.id.edt_num);
        btn_ann = findViewById(R.id.btn_ann);
        btn_reinit = findViewById(R.id.btn_reinit);
        relativeLayout = findViewById(R.id.id1);


        btn_color1 = findViewById(R.id.btn_color1);
        btn_color2 = findViewById(R.id.btn_color2);
        btn_color3 = findViewById(R.id.btn_color3);

        btn_reinit.setOnClickListener(view -> edt_num.setText(""));
        btn_ann.setOnClickListener(view -> System.exit(0));

        btn_color1.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.color.warm));
        btn_color2.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.color.grey));
        btn_color3.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.color.yellow));

        tv_multip = findViewById(R.id.tv_multi);

        btn_reinit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_num.setText("");
                tv_multip.setText(R.string.table);


            }
        });

    }
}