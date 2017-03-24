package com.example.shapedrawableapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //textView = (TextView)findViewById(R.id.text_view);
        //textView.setText("Custom Button");

        // Custom Button
        //Button customButton = (Button)findViewById(R.id.custom_button);
        // Action on click
        /*customButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count++;
                textView.setText("Tapped: " + String.valueOf(count));
            }
        });*/
    }
}
