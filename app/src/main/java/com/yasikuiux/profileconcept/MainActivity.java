package com.yasikuiux.profileconcept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout edit_select,notification_select,payment_select,security_select,privacy_select,help_select,invite_select,language_select;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //REMOVE STATUSBAR

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //REMOVE TOOLBAR

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);


        edit_select=(RelativeLayout)findViewById(R.id.edit_select);
        edit_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Edit Profile Selected", Toast.LENGTH_SHORT).show();
                
            }
        });

        notification_select=(RelativeLayout)findViewById(R.id.notification_select);
        notification_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Notification Selected", Toast.LENGTH_SHORT).show();

            }
        });

        payment_select=(RelativeLayout)findViewById(R.id.payment_select);
        payment_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Payment Selected", Toast.LENGTH_SHORT).show();

            }
        });

        security_select=(RelativeLayout)findViewById(R.id.security_select);
        security_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Security Selected", Toast.LENGTH_SHORT).show();

            }
        });

        privacy_select=(RelativeLayout)findViewById(R.id.privacy_select);
        privacy_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Privacy Policy Selected", Toast.LENGTH_SHORT).show();

            }
        });


        help_select=(RelativeLayout)findViewById(R.id.help_select);
        help_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Help Center Selected", Toast.LENGTH_SHORT).show();

            }
        });


        invite_select=(RelativeLayout)findViewById(R.id.invite_select);
        invite_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Invite Friends Selected", Toast.LENGTH_SHORT).show();

            }
        });


        language_select=(RelativeLayout)findViewById(R.id.language_select);
        language_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Language Selected", Toast.LENGTH_SHORT).show();

            }
        });
        
    }
}