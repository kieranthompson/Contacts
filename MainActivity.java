package com.example.kieran.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView text;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.inputContact);
        text = (TextView) findViewById(R.id.textContact);
        dbHandler = new MyDBHandler(this, null, null, 1);

        printDatabase();

    }

    //Add a contact to the database
    public void addButtonClicked(View view) {
        Contact contact = new Contact(input.getText().toString());
        dbHandler.addContact(contact);
        printDatabase();

    }

    //delete a contact from the database
    public void deleteButtonClicked(View view){
        String inputText = text.getText().toString();
        dbHandler.deleteContact(inputText);
        printDatabase();
    }

    public void printDatabase() {
        String dbString = dbHandler.databaseToString();
        text.setText(dbString);
        input.setText("");
    }


}
