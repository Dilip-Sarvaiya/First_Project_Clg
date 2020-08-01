package com.rku.first_project_clg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Login_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mnuSplash:
                Intent intentsplash=new Intent(Login_Screen.this,Splash_Screen.class);
                startActivity(intentsplash);
                Toast.makeText(this, "Splash Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuLogin:
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuAbout:
                Intent intentabout=new Intent(Login_Screen.this,About_us.class);
                startActivity(intentabout);
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuContact:
                Intent intentContact=new Intent(Login_Screen.this,Contact_us.class);
                startActivity(intentContact);
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}