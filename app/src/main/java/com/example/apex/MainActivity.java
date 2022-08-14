package com.example.apex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //loadFragment(new HomeFragment());

      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              Fragment fragment = null;

              switch (item.getItemId()) {

                  case R.id.menu_home:
                      loadFragment(new HomeFragment());
                      return true;

                  case R.id.menu_video:
                      loadFragment(new VideoFragment());
                      return true;

                  case R.id.menu_question_bank:
                      loadFragment(new QuestionBankFragment());
                      return true;
                  case R.id.menu_test:

                      Intent intent = new Intent(MainActivity.this, TestActivity.class);
                      startActivity(intent);
                     // loadFragment(new TestFragment());
                      return true;

                  case R.id.menu_profile:
                      loadFragment(new ProfileFragment());
                      return true;
              }
              return false;
          }
      });

    }
    public  void loadFragment(Fragment fragments)
    {

        Fragment fragment= fragments;
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_container,fragment);
        fragmentTransaction.commit();
    }



}