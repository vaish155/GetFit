
package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class userhome extends AppCompatActivity {
    TextView Title,Height,Weight;
    EditText Hght,Wght;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_userhome);
        Title=findViewById(R.id.s1);
        Height=findViewById(R.id.s2);
        Weight=findViewById(R.id.s3);
        Hght=findViewById(R.id.a1);
        Wght=findViewById(R.id.a2);
        Submit=findViewById(R.id.d1);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        float hm=Float.parseFloat(Hght.getText().toString());
        float wm=Float.parseFloat(Wght.getText().toString());
        float bmi=(wm/((hm/100)*(hm/100)));
        if(bmi<=18.5){
            startActivity(new Intent(userhome.this,underweight.class));
            Toast.makeText(userhome.this,"Oooh skinny you!",Toast.LENGTH_LONG).show();
        }
        else if(bmi>18.5 && bmi<=24.9){
            startActivity(new Intent(userhome.this,fit.class));
            Toast.makeText(userhome.this,"Keep it up!",Toast.LENGTH_LONG).show();
        }
        else if(bmi>24.9 && bmi<=29.9){
            startActivity(new Intent(userhome.this,overweight.class));
            Toast.makeText(userhome.this,"You need some workout surely!",Toast.LENGTH_LONG).show();
        }
        else if(bmi>29.9){
            startActivity(new Intent(userhome.this,obese.class));
            Toast.makeText(userhome.this,"Ah you gotta lot to do!",Toast.LENGTH_LONG).show();
        }
            }
        });

    }
}