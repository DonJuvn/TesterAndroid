package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView surak1, surak2, surak3, surak4;
    Button btn_check;
    RadioButton surak1_jauap1, surak1_jauap2, surak1_jauap3, surak1_jauap4, surak2_jauap1, surak2_jauap2, surak2_jauap3, surak2_jauap4, surak3_jauap3, surak3_jauap4, surak4_jauap4, surak4_jauap3, surak3_jauap1, surak3_jauap2, surak4_jauap1, surak4_jauap2;
    String [] suraktar = {"1+1=?", "8+5=?", "4+9=?", "3+6=?"};
    String [][] variant = {
            {"2", "8", "19", "5"},
            {"5", "13", "19", "5"},
            {"13", "7", "19", "5"},
            {"6", "9", "19", "5"},
    };
    String [] answers = {"2", "13", "13", "9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surak1 = findViewById(R.id.surak1);
        surak2 = findViewById(R.id.surak2);
        surak3 = findViewById(R.id.surak3);
        surak4 = findViewById(R.id.surak4);

        surak1_jauap1 = findViewById(R.id.surak1_jauap1);
        surak1_jauap2 = findViewById(R.id.surak1_jauap2);
        surak1_jauap3 = findViewById(R.id.surak1_jauap3);
        surak1_jauap4 = findViewById(R.id.surak1_jauap4);

        surak2_jauap1 = findViewById(R.id.surak2_jauap1);
        surak2_jauap2 = findViewById(R.id.surak2_jauap2);
        surak2_jauap3 = findViewById(R.id.surak2_jauap3);
        surak2_jauap4 = findViewById(R.id.surak2_jauap4);

        surak3_jauap1 = findViewById(R.id.surak3_jauap1);
        surak3_jauap2 = findViewById(R.id.surak3_jauap2);
        surak3_jauap3 = findViewById(R.id.surak3_jauap3);
        surak3_jauap4 = findViewById(R.id.surak3_jauap4);

        surak4_jauap1 = findViewById(R.id.surak4_jauap1);
        surak4_jauap2 = findViewById(R.id.surak4_jauap2);
        surak4_jauap3 = findViewById(R.id.surak4_jauap3);
        surak4_jauap4 = findViewById(R.id.surak4_jauap4);

        btn_check = findViewById(R.id.btn_check);

        surak1.setText(suraktar[0]);
        surak1_jauap1.setText(variant[0][0]);
        surak1_jauap2.setText(variant[0][1]);
        surak1_jauap3.setText(variant[0][2]);
        surak1_jauap4.setText(variant[0][3]);

        surak2.setText(suraktar[1]);
        surak2_jauap1.setText(variant[1][0]);
        surak2_jauap2.setText(variant[1][1]);
        surak2_jauap3.setText(variant[1][2]);
        surak2_jauap4.setText(variant[1][3]);

        surak3.setText(suraktar[2]);
        surak3_jauap1.setText(variant[2][0]);
        surak3_jauap2.setText(variant[2][1]);
        surak3_jauap3.setText(variant[2][2]);
        surak3_jauap4.setText(variant[2][3]);

        surak4.setText(suraktar[3]);
        surak4_jauap1.setText(variant[3][0]);
        surak4_jauap2.setText(variant[3][1]);
        surak4_jauap3.setText(variant[3][2]);
        surak4_jauap4.setText(variant[3][3]);


        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer(surak1, surak1_jauap1 , surak1_jauap2 ,surak1_jauap3 , surak1_jauap4, 0);
                answer(surak2, surak2_jauap1 , surak2_jauap2 ,surak2_jauap3 , surak2_jauap4, 1);
                answer(surak3, surak3_jauap1 , surak3_jauap2 ,surak3_jauap3 , surak3_jauap4, 2);
                answer(surak4, surak4_jauap1 , surak4_jauap2 ,surak4_jauap3 , surak4_jauap4, 3);

                /*if(surak1_jauap1.isChecked() &&
                        surak1_jauap1.getText().toString().equals(answers[0])){
                    surak1.setText(suraktar[0] + "\nDurys!");
                    surak1.setTextColor(getResources().getColor(R.color.jasyl));
                }else if(surak1_jauap2.isChecked() &&
                        surak1_jauap2.getText().toString().equals(answers[0])){
                    surak1.setText(suraktar[0] + "\nDurys!");
                    surak1.setTextColor(getResources().getColor(R.color.jasyl));
                    else if(surak1_jauap2.isChecked() &&
                        surak1_jauap2.getText().toString().equals(answers[0])){
                    surak1.setText(suraktar[0] + "\nDurys!");
                    surak1.setTextColor(getResources().getColor(R.color.jasyl));
                    else if(surak1_jauap2.isChecked() &&
                        surak1_jauap2.getText().toString().equals(answers[0])){
                    surak1.setText(suraktar[0] + "\nDurys!");
                    surak1.setTextColor(getResources().getColor(R.color.jasyl));
                }else{
                    surak1.setText(suraktar[0] + "\nKate!");
                    surak1.setTextColor(getResources().getColor(R.color.kyzyl));
                }


                if(surak2_jauap1.isChecked() &&
                        surak2_jauap1.getText().toString().equals(answers[1])){
                    surak2.setText(suraktar[0] + "\nDurys!");
                    surak2.setTextColor(getResources().getColor(R.color.jasyl));
                }else if(surak2_jauap2.isChecked() &&
                        surak2_jauap2.getText().toString().equals(answers[1])){
                    surak2.setText(suraktar[0] + "\nDurys!");
                    surak2.setTextColor(getResources().getColor(R.color.jasyl));
                }else{
                    surak2.setText(suraktar[0] + "\nKate!");
                    surak2.setTextColor(getResources().getColor(R.color.kyzyl));
                }


                if(surak3_jauap1.isChecked() &&
                        surak3_jauap1.getText().toString().equals(answers[2])){
                    surak3.setText(suraktar[0] + "\nDurys!");
                    surak3.setTextColor(getResources().getColor(R.color.jasyl));
                }else if(surak3_jauap2.isChecked() &&
                        surak3_jauap2.getText().toString().equals(answers[2])){
                    surak3.setText(suraktar[0] + "\nDurys!");
                    surak3.setTextColor(getResources().getColor(R.color.jasyl));
                }else{
                    surak3.setText(suraktar[0] + "\nKate!");
                    surak3.setTextColor(getResources().getColor(R.color.kyzyl));
                }


                if(surak4_jauap1.isChecked() &&
                        surak4_jauap1.getText().toString().equals(answers[3])){
                    surak4.setText(suraktar[0] + "\nDurys!");
                    surak4.setTextColor(getResources().getColor(R.color.jasyl));
                }else if(surak4_jauap2.isChecked() &&
                        surak4_jauap2.getText().toString().equals(answers[3])){
                    surak4.setText(suraktar[0] + "\nDurys!");
                    surak4.setTextColor(getResources().getColor(R.color.jasyl));
                }else{
                    surak4.setText(suraktar[0] + "\nKate!");
                    surak4.setTextColor(getResources().getColor(R.color.kyzyl));
                }*/
            }
        });



    }
    public void answer(TextView surak, RadioButton jauap1, RadioButton jauap2, RadioButton jauap3, RadioButton jauap4, int index){
        if(jauap1.isChecked() &&
                jauap1.getText().toString().equals(answers[index])){
            surak.setText(suraktar[index] + "\nDurys!");
            surak.setTextColor(getResources().getColor(R.color.jasyl));
        }else if(jauap2.isChecked() &&
                jauap2.getText().toString().equals(answers[index])){
            surak.setText(suraktar[index] + "\nDurys!");}
            else if(jauap3.isChecked() &&
                jauap3.getText().toString().equals(answers[index])){
            surak.setText(suraktar[index] + "\nDurys!");}
            else if(jauap4.isChecked() &&
                jauap4.getText().toString().equals(answers[index])){
            surak.setText(suraktar[index] + "\nDurys!");
            surak.setTextColor(getResources().getColor(R.color.jasyl));
        }else{
            surak.setText(suraktar[index] + "\nKate!");
            surak.setTextColor(getResources().getColor(R.color.kyzyl));
        }
    }
}