package com.team.alpha.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Navigation_Drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private CardView sports,animal,earth,humanbody,religion,national,nature,space,technology,people,food,records;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sports=(CardView) findViewById(R.id.sports);
        animal=(CardView) findViewById(R.id.animals);
        earth=(CardView) findViewById(R.id.earth);
        humanbody=(CardView) findViewById(R.id.humanbody);
        religion=(CardView) findViewById(R.id.religion);
        national=(CardView) findViewById(R.id.national);
        nature=(CardView) findViewById(R.id.nature);
        space=(CardView) findViewById(R.id.space);
        technology=(CardView) findViewById(R.id.technology);
        people=(CardView) findViewById(R.id.people);
        food=(CardView) findViewById(R.id.food);
        records=(CardView) findViewById(R.id.records);
        sports.setOnClickListener(this);
        animal.setOnClickListener(this);
        earth.setOnClickListener(this);
        humanbody.setOnClickListener(this);
        religion.setOnClickListener(this);
        national.setOnClickListener(this);
        nature.setOnClickListener(this);
        space.setOnClickListener(this);
        technology.setOnClickListener(this);
        people.setOnClickListener(this);
        food.setOnClickListener(this);
        records.setOnClickListener(this);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation__drawer, menu);
        return true;
    }


    @SuppressLint("WrongViewCast")
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_about) {

           Intent a = new Intent(Navigation_Drawer.this, About.class);
           startActivity(a);

        } else if (id == R.id.nav_feedback) {
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String shareBody = "Send this mail to alphadev.team7@gmail.com";
            String shareSub = "Feedback";
            myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(myIntent, "Feedback Using"));

        } else if (id == R.id.nav_share) {
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String shareBody = "https://play.google.com/store/apps/details?id=com.team.alpha.app";
            String shareSub = "your Sub here";
            myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(myIntent, "Share Using"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {

        Intent i;
        switch (view.getId()) {
            case R.id.sports:i= new Intent(this,Sports.class);startActivity(i);break;
            case R.id.animals:i= new Intent(this,Animal.class);startActivity(i);break;
            case R.id.humanbody:i= new Intent(this,Human_body.class);startActivity(i);break;
            case R.id.religion:i= new Intent(this,Religion.class);startActivity(i);break;
            case R.id.national:i= new Intent(this,National.class);startActivity(i);break;
            case R.id.people:i= new Intent(this,people.class);startActivity(i);break;
            case R.id.records:i= new Intent(this,records.class);startActivity(i);break;
            case R.id.nature:i= new Intent(this,Nature.class);startActivity(i);break;
            case R.id.earth:i= new Intent(this,Earth.class);startActivity(i);break;
            case R.id.food:i= new Intent(this,Food.class);startActivity(i);break;
            case R.id.space:i= new Intent(this,Space.class);startActivity(i);break;
            case R.id.technology:i= new Intent(this,Technology.class);startActivity(i);break;
            default:break;
        }
    }
}

