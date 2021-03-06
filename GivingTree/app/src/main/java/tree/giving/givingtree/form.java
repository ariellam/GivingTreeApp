package tree.giving.givingtree;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class form extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public final static String EXTRA_ITEM = "tree.giving.givingtree.ITEM";
    public final static String EXTRA_RECIPIENT = "tree.giving.givingtree.RECIPIENT";
    public final static String EXTRA_DATE = "tree.giving.givingtree.DATE";
    public final static String EXTRA_TIME = "tree.giving.givingtree.TIME";
    public ArrayList<User> createUsers(){
        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("superman", "password", "Clark", "Kent", 25);
        User u2 = new User("wonderwoman", "password", "Diana", "Prince", 25);
        User u3 = new User("batman", "password", "Bruce", "Wayne", 25);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        return users;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(form.this, form.class);
                startActivity(new Intent(form.this, form.class));
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
    }

    public void toConfirm(View view) {
        Intent i = new Intent(this, confirm.class);


        EditText editText = (EditText) findViewById(R.id.itemName);
        String itemString = editText.getText().toString();
        editText = (EditText) findViewById(R.id.recipient);
        String recipientString = editText.getText().toString();
        editText = (EditText) findViewById(R.id.dateDeadline);
        String endDate = editText.getText().toString();
        editText = (EditText) findViewById(R.id.timeDeadline);
        String endTime = editText.getText().toString();
        createUsers().get(0).getRequests().add(new Request(itemString, recipientString));

        i.putExtra(EXTRA_ITEM, itemString);
        i.putExtra(EXTRA_RECIPIENT, recipientString);
        i.putExtra(EXTRA_DATE, endDate);
        i.putExtra(EXTRA_TIME, endTime);


        startActivity(i);
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
        getMenuInflater().inflate(R.menu.form, menu);
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

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent i = new Intent(form.this, MainActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(form.this, myfriends.class);
            startActivity(i);
        } else if (id == R.id.nav_slideshow) {

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
    public void input_values (View view) {

    }
}

