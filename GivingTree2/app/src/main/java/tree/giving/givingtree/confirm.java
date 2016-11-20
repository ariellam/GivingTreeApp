package tree.giving.givingtree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Intent i = getIntent();
        String itemStr = i.getStringExtra(form.EXTRA_ITEM);
        String recipientStr = i.getStringExtra(form.EXTRA_RECIPIENT);
        String timeStr = i.getStringExtra(form.EXTRA_TIME);
        String dateStr = i.getStringExtra(form.EXTRA_DATE);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText("Item: \n"+ itemStr+ "\n\nRecipient:\n"+recipientStr+"\n\nTimeframe:\n"+dateStr+"\n"+timeStr);

        ViewGroup layout = (ViewGroup) findViewById(R.id.content_confirm);
        layout.addView(textView);
    }


    public void toMain(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
