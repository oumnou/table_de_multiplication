package com.example.myapplicationwithgit;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TableDeMultiplication extends AppCompatActivity {

    EditText edt_num;
    TextView tv_multip;
    String s = "";
    int n;
    Button btn_reinit, btn_ann, btn_aff, btn_color1, btn_color2, btn_color3 ;
    android.support.constraint.ConstraintLayout relativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_num = findViewById(R.id.edt_num);
        btn_ann = findViewById(R.id.btn_ann);
        btn_reinit = findViewById(R.id.btn_reinit);
        tv_multip = findViewById(R.id.tv_multi);
        btn_aff = findViewById(R.id.btn_aff);
        tv_multip = findViewById(R.id.tv_multi);


        relativeLayout = findViewById(R.id.id1);

        btn_color1 = findViewById(R.id.btn_color1);
        btn_color2 = findViewById(R.id.btn_color2);
        btn_color3 = findViewById(R.id.btn_color3);

        btn_color1.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.color.white));
        btn_color2.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.color.grey));
        btn_color3.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.color.yellow));

        btn_ann.setOnClickListener(view -> System.exit(0));


        btn_reinit.setOnClickListener(view -> {
            String m = edt_num.getText().toString();
            if(m.equals("")){
                Toast.makeText(this, "Rien a reinitialiser", Toast.LENGTH_SHORT).show();
            }else{
                edt_num.setText("");
                tv_multip.setText(R.string.table);
            }
        });



        btn_aff.setOnClickListener(view -> {
            String m = edt_num.getText().toString();
            if(m.equals(""))
            {
                tv_multip.setText(R.string.table);
                Toast.makeText(this, "Veuillez entrer un nbr", Toast.LENGTH_SHORT).show();
            }
            else{
             n = Integer.parseInt(m);

            for (int i = 0; i < 11; i++) {
                s += n + " * " + i + " = " + n*i + "\n" ;
            }
            tv_multip.setText(s);
            s = "";}

        });}}







