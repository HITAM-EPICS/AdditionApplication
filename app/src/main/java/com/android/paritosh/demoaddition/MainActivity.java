package com.android.paritosh.demoaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.num1);
        t2=findViewById(R.id.num2);

        res=findViewById(R.id.ans);


    }

    public void sum(View v)
    {

        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();




        if((s1.equals(null) || s1.equals("")) || (s2.equals(null)|| s2.equals(""))){
            Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }
        else{
            int x=Integer.parseInt(s1);
            int y=Integer.parseInt(s2);
            int z=x+y;
            res.setText("Sum: "+z);
        }

    }


    public void resetNum(View view){

        res.setText("");
        t1.setText("");
        t2.setText("");

    }
}
