package com.example.islamiccenter.abjad1;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class SettingAct extends AppCompatActivity {
    ImageView back;
    Toolbar toolbar;
    TextView desc;
    EditText newPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"elmessiri-regular.otf",true);
        toolbar=(Toolbar)findViewById(R.id.change_toolbar);
        setSupportActionBar(toolbar);
        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        desc=(TextView)findViewById(R.id.descBtn);
        newPass =(EditText)findViewById(R.id.passTxt);
        newPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm =getSupportFragmentManager();
                PassPopUp passPopUp = new PassPopUp();
                passPopUp.show(fm,"tag");
            }
        });
        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm =getSupportFragmentManager();
                DescPopUp descPopUp = new DescPopUp();
                descPopUp.show(fm,"tag");

            }
        });

    }
}
