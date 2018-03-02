package com.example.islamiccenter.abjad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class SignupAct extends AppCompatActivity {

    Toolbar toolbar;
    EditText full_name , user_name , password , confirm_password;
    Button facebook , save;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //Font
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"elmessiri-regular.otf",true);
        //endFont
        toolbar=(Toolbar)findViewById(R.id.signuptoolbar);
        setSupportActionBar(toolbar);
        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();

            }
        });
        full_name=(EditText)findViewById(R.id.editTextfullname);
        user_name=(EditText)findViewById(R.id.editTextusername);
        password=(EditText)findViewById(R.id.editTextpass);
        confirm_password=(EditText)findViewById(R.id.editTextconfirmedpass);
        facebook=(Button)findViewById(R.id.buttonfacebook);
        save=(Button)findViewById(R.id.buttonsave);

    }

    public void save(View view) {

        String Full_name = full_name.getText().toString();
        String User_name=user_name.getText().toString();
        String Password=password.getText().toString();
        String Confirm_password=confirm_password.getText().toString();
        database b =new database();
        b.execute();
    }
}
