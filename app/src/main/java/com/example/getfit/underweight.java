package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class underweight extends AppCompatActivity {
    TextView topicunder,notreq;
    ImageView underimage;
    Button logout2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_underweight);

        topicunder=findViewById(R.id.fit1);
        underimage=findViewById(R.id.imageunder);
        notreq= findViewById(R.id.u2);
        logout2=findViewById(R.id.logout2);
        logout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(underweight.this,MainActivity.class));
            }
        });
    }
}