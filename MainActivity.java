package com.example.s13q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rev=0,rem;

                int n=Integer.parseInt(e1.getText().toString());
                while(n!=0){
                    rem=n%10;
                    rev=rev*10+rem;
                    n=n/10;
                }
                String res=String.valueOf(rev);

                Toast.makeText(MainActivity.this, "Reverse is="+res, Toast.LENGTH_LONG).show();
            }
        });
    }
}