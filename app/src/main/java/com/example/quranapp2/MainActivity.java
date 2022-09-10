package com.example.quranapp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    TextView data;
    Intent intent;

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "End", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //data=findViewById(R.id.textviewdata);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        drawerLayout.openDrawer(GravityCompat.START);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_FUrdu:
                        intent = new Intent(MainActivity.this, SurahNames.class);
                        intent.putExtra("required","Fateh_Muhammad_Jalandhri");
                        intent.putExtra("language" ,"urdu");
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_MUrdu:
                        intent = new Intent(MainActivity.this, SurahNames.class);
                        intent.putExtra("required","mehmood_ul_hassan");
                        intent.putExtra("language" ,"urdu");
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_DEng:
                        intent = new Intent(MainActivity.this, SurahNames.class);
                        intent.putExtra("required","Dr_Mohsin_Khan");
                        intent.putExtra("language" ,"english");
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_MEng:
                        intent = new Intent(MainActivity.this, SurahNames.class);
                        intent.putExtra("required","Mufti_Taqi_Usmani");
                        intent.putExtra("language" ,"english");
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });


    }
}
