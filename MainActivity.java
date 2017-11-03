package com.example.debjit.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        EditText text = (EditText) findViewById(R.id.edit);
        String textString = text.getText().toString();

        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("text", textString);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Do you want to exit?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                }).setNegativeButton("NO", null).show();
    }

    public void onClick(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new View.OnCheckedChangeListener());
        if (checkBox.isChecked()) ;
        {
            new AlertDialog.Builder(this).setMessage("Do you want to check?");


        }
    }
}






