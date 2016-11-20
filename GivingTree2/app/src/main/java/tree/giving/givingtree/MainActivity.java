package tree.giving.givingtree;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int currentUser = 1;
        userDatabase users = new userDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, form.class);
                startActivity(new Intent(MainActivity.this, form.class));
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();-->*/
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Resources res = getResources();
        Drawable pot = res.getDrawable(R.drawable.pot);
        Drawable potback = res.getDrawable(R.drawable.potback);
        ImageView plantDead = (ImageView)findViewById(R.id.plantdead);
        ImageView plantHealthy = (ImageView)findViewById(R.id.planthealthy);
        ImageView plantBud = (ImageView)findViewById(R.id.plantbud);
        plantDead.setVisibility(View.INVISIBLE);
        plantHealthy.setVisibility(View.INVISIBLE);
        plantBud.setVisibility(View.INVISIBLE);

        if((users.getUser(currentUser).getKarma()) >= 20 && (users.getUser(0).getKarma()) < 30 ){
            plantDead.setVisibility(View.INVISIBLE);
            plantHealthy.setVisibility(View.INVISIBLE);
            plantBud.setVisibility(View.VISIBLE);
        }
        else if((users.getUser(currentUser).getKarma()) >= 10 && (users.getUser(0).getKarma()) < 20 ){
            plantDead.setVisibility(View.INVISIBLE);
            plantHealthy.setVisibility(View.VISIBLE);
            plantBud.setVisibility(View.INVISIBLE);
        }
        else if(users.getUser(currentUser).getKarma() < 10){
            plantDead.setVisibility(View.VISIBLE);
            plantHealthy.setVisibility(View.INVISIBLE);
            plantBud.setVisibility(View.INVISIBLE);

        }

    }
/*
    public void toForm(View view) {
        Intent i = new Intent(this, form.class);
        startActivity(i);
    }*/



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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent i = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(MainActivity.this, myfriends.class);
            startActivity(i);
        } else if (id == R.id.nav_slideshow) {
            Intent i = new Intent(MainActivity.this, history.class);
            startActivity(i);
        } else if (id == R.id.nav_manage) {
/*
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {
*/
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
