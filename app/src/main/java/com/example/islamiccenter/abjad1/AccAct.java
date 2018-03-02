package com.example.islamiccenter.abjad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class AccAct extends AppCompatActivity {
    ImageView back;
    Button setting;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"elmessiri-regular.otf",true);
        toolbar=(Toolbar)findViewById(R.id.settingToolbar);
        setSupportActionBar(toolbar);
        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        setting =(Button)findViewById(R.id.settingBtn);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext() , SettingAct.class);
                startActivity(intent);
            }
        });

    }
}
