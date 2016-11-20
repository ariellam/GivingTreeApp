package jiayi.givingtree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;


public class formActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void input_values (View view){
        EditText editText = (EditText) findViewById(R.id.itemName);
        String item = editText.getText().toString();
i
        editText = (EditText) findViewById(R.id.recipient);
        String recipient = editText.getText().toString();

        editText = (EditText) findViewById(R.id.dateDeadline);
        String endDate = editText.getText().toString();

        editText = (EditText) findViewById(R.id.timeDeadline);
        String endTime = editText.getText().toString();
    }
}
