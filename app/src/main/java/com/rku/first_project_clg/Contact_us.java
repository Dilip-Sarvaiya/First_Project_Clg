package com.rku.first_project_clg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Contact_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mnuLogin:
                Intent intentlogin=new Intent(Contact_us.this,Login_Screen.class);
                startActivity(intentlogin);
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuAbout:
                Intent intentabout=new Intent(Contact_us.this,About_us.class);
                startActivity(intentabout);
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuContact:
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}