package com.example.islamiccenter.abjad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class ForgetPassword extends AppCompatActivity {

    EditText emailadress;
    TextView go_back;
    Button reset_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"elmessiri-regular.otf",true);
        emailadress=(EditText)findViewById(R.id.emailadress);
        go_back=(TextView)findViewById(R.id.textviewgoback);
        reset_pass=(Button)findViewById(R.id.resetpassword);
    }


    public void goback(View view) {
       finish();
    }
}

