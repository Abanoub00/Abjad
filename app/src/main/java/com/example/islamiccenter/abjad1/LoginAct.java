package com.example.islamiccenter.abjad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class LoginAct extends AppCompatActivity {

    RelativeLayout spScreen ,bgScreen,blurScreen;
    TextView signUp;
    LinearLayout mainScreen;
    Button loginBtn;
    TextView forgotPass;
    EditText email_address,password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"elmessiri-regular.otf",true);

        //   FirebaseAuth = firebaseAuth.getInstance();
        spScreen=(RelativeLayout) findViewById(R.id.spScreen);
        signUp =(TextView)findViewById(R.id.signUpTxt);
        bgScreen=(RelativeLayout) findViewById(R.id.bgScreen);
        blurScreen=(RelativeLayout) findViewById(R.id.blurScreen);
        mainScreen=(LinearLayout) findViewById(R.id.MainScreen);
        email_address=(EditText)findViewById(R.id.emailTxt);
        loginBtn= (Button)findViewById(R.id.logBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginAct.this , HomeScreen.class);
                startActivity(intent);
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginAct.this , SignupAct.class);
                startActivity(intent);
            }
        });
        password=(EditText)findViewById(R.id.passwordTxt);
        forgotPass=(TextView)findViewById(R.id.forgotPassTxt);
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginAct.this , ForgetPassword.class);
                startActivity(intent);
            }
        });


        for (int i = 0; i < mainScreen.getChildCount(); i++) {
            View child = mainScreen.getChildAt(i);
            child.setEnabled(false);
        }

      //  getSupportActionBar().hide();
        MyThread myThread = new MyThread();
        myThread.start();
    }


    class MyThread extends Thread
    {
        @Override
        public void run() {
            try {
                Thread.sleep(2500);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        spScreen.animate().alpha(0f).setDuration(2000);
                        bgScreen.animate().alpha(1f).setDuration(2000);
                    }
                });
                Thread.sleep(2100);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bgScreen.animate().alpha(0f).setDuration(2000);
                        blurScreen.animate().alpha(1f).setDuration(1000);

                    }
                });
                Thread.sleep(1200);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mainScreen.animate().alpha(1f).setDuration(1700);
                    }
                });
                Thread.sleep(1700);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < mainScreen.getChildCount(); i++) {
                            View child = mainScreen.getChildAt(i);
                            child.setEnabled(true);
                        }
                    }
                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}



