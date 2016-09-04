package com.example.admin.splashscreen;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1,t2;
    EditText e1,e2;
    Point size;
    int att=3;
    @TargetApi(16)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1=(Button)findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        t1.setText("Username");
        t2.setText("Password");
        size=new Point();
        Display display =getWindowManager().getDefaultDisplay();
        display.getSize(size);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.animate().translationY(size.y).withStartAction(new Runnable() {
                    @Override
                    public void run() {
                        t1.animate().translationY(size.y/20).alpha(0.4f);
                    }
                });


            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.animate().translationY(size.y).withStartAction(new Runnable() {
                    @Override
                    public void run() {
                        t2.animate().translationY(size.y/20).alpha(0.4f);
                    }
                });


            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e1.getText().toString().equals("danish") && e2.getText().toString().equals("1234"))
                {
                    Intent intent = new Intent(MainActivity.this,Algorithm.class);
                    startActivity(intent);
                }
                else
                if(e1.getText().toString().equals("tushar") && e2.getText().toString().equals("1234"))
                {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }else
                if(e1.getText().toString().equals("danish") && !e2.getText().toString().equals("1234")) {

                    if(att==0){
                        Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_LONG).show();
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid PASSWORD", Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "Attempts left......"+att, Toast.LENGTH_LONG).show();
                        att=att-1;
                    }

                }
                else
                    if(!e1.getText().toString().equals("danish") && e2.getText().toString().equals("1234")){

                        if(att==0){
                            Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_LONG).show();
                            finish();
                        }else
                        {
                            Toast.makeText(MainActivity.this, "Invalid USERNAME", Toast.LENGTH_LONG).show();
                            Toast.makeText(MainActivity.this, "Attempts left......"+att, Toast.LENGTH_LONG).show();
                            att=att-1;
                        }
                    }
                else
                    if(!e1.getText().toString().equals("danish") && !e2.getText().toString().equals("1234"))
                    {

                        if(att==0){
                            Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_LONG).show();
                            finish();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Invalid USERNAME & PASSWORD", Toast.LENGTH_LONG).show();
                            Toast.makeText(MainActivity.this, "Attempts left......"+att, Toast.LENGTH_LONG).show();
                            att=att-1;
                        }
                    }
               else

                if(e1.getText().toString().equals("tushar") && e2.getText().toString().equals("1234"))
                {
                    Intent intent = new Intent(MainActivity.this,Algorithm.class);
                    startActivity(intent);
                }else
                if(e1.getText().toString().equals("tushar") && !e2.getText().toString().equals("1234")) {

                    if(att==0){
                        Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_LONG).show();
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid PASSWORD", Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "Attempts left......"+att, Toast.LENGTH_LONG).show();
                        att=att-1;
                    }

                }
                else
                if(!e1.getText().toString().equals("tushar") && e2.getText().toString().equals("1234")){

                    if(att==0){
                        Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_LONG).show();
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid USERNAME", Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "Attempts left......"+att, Toast.LENGTH_LONG).show();
                        att=att-1;
                    }
                }
                else
                if(!e1.getText().toString().equals("tushar") && !e2.getText().toString().equals("1234"))
                {

                    if(att==0){
                        Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_LONG).show();
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid USERNAME & PASSWORD", Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "Attempts left......"+att, Toast.LENGTH_LONG).show();
                        att=att-1;
                    }
                }
            }
        });

    }
}
