package com.example.a.nave3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int x=0;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
    }

    public void btn1(View view) {
        x=x+1;
        btn1.setText("this is the click number"+x);
        if (x==6){
            btn1.setText("enough to click go back to start");
        x=0;
     }
    }
}
