package com.example.emp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b;
    Empmod e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=new Empmod();
        e1=(EditText)findViewById(R.id.ename);
        e2=(EditText)findViewById(R.id.edesi);
        e3=(EditText)findViewById(R.id.esal);
        e4=(EditText)findViewById(R.id.eplace);
        e5=(EditText)findViewById(R.id.ecomp);
        e6=(EditText)findViewById(R.id.eemail);
        e7=(EditText)findViewById(R.id.emob);
        b=(Button)findViewById(R.id.sub);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString().trim();
                String s2=e2.getText().toString().trim();
                String s3=e3.getText().toString().trim();
                String s4=e4.getText().toString().trim();
                String s5=e5.getText().toString().trim();
                String s6=e6.getText().toString().trim();
                String s7=e7.getText().toString().trim();

                e.setEmpname(s1);
                e.setEmpdesig(s2);
                e.setEmpsal(s3);
                e.setEmpplace(s4);
                e.setEmpcomp(s5);
                e.setEmpemail(s6);
                e.setEmpmob(s7);
                String a1=e.getEmpname();
                String a2=e.getEmpdesig();
                String a3=e.getEmpsal();
                String a4=e.getEmpplace();
                String a5=e.getEmpcomp();
                String a6=e.getEmpemail();
                String a7=e.getEmpmob();
                Toast.makeText(getApplicationContext(),a1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),a2,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),a3,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),a4,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),a5,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),a6,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),a7,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
