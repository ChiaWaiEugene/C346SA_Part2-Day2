package sg.edu.rp.c346.id20041877.c346sapart2_day2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    Button btnInsert;
    ListView lv;
    ArrayList<ListView> expList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnInsert = findViewById(R.id.buttonInsert);
        lv = findViewById(R.id.listView);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.insert, null);

                final EditText etInput1 = viewDialog.findViewById(R.id.editTextInput1);
                final EditText etInput2 = viewDialog.findViewById(R.id.editTextInput2);

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(SecondActivity.this);
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Add Log");

                myBuilder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //int num1 = Integer.parseInt(etInput1.getText().toString());
                        //int num2 = Integer.parseInt(etInput2.getText().toString());

                        String message1 = etInput1.getText().toString();
                        String message2 = etInput2.getText().toString();

                        currItem.get().setAmount(message1);
                        currItem.get().setAmount(message2);
                    }
                });

                myBuilder.setNegativeButton("CANCEL", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if(id == R.id.ClearRecords) {
            expList.clear();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}