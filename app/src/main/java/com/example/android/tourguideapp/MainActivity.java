package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
        drawer = findViewById( R.id.drawer_layout );
        NavigationView navigationView = findViewById( R.id.nav_view );
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( actionBarDrawerToggle );
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener( this );
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
            return;
        }
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        FragmentManager fm = getSupportFragmentManager();
        switch (id){
            case R.id.nav_sight:
                Fragment sightFragment = SightFragment.newInstance();
                fm.beginTransaction()
                        .replace(R.id.nav_host_fragment, sightFragment).commit();
                break;

            case R.id.nav_hotel:
                Fragment hotelFragment= HotelFragment.newInstance();
                fm.beginTransaction()
                        .replace(R.id.nav_host_fragment,hotelFragment).commit();
                break;

            case R.id.nav_restaurant:
                Fragment restaurantFragment = RestaurantFragment.newInstance();
                fm.beginTransaction()
                        .replace(R.id.nav_host_fragment,restaurantFragment).commit();
                break;

            case R.id.nav_entertainment:
                Fragment entertainmentFragment = EntertainmentFragment.newInstance();
                fm.beginTransaction()
                        .replace(R.id.nav_host_fragment,entertainmentFragment).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
