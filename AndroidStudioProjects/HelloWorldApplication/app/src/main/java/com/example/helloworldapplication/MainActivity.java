package com.example.helloworldapplication;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("LifeCycle", "onCreate");

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        if(savedInstanceState != null) {
            name = savedInstanceState.getString("savedString");
            if (name == null)
                name = "Hello World!";
            else
                name = " Hello " + name + "!";
            textView.setText(name);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v("LifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v("LifeCycle", "onResume");
    }

    public void sayHello(View view) {
         name = editText.getText().toString();
        if (name.equals(" "))
            name = "Hello World";
        else
            name = "Hello" + name + "!";
        textView.setText(name);

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.v("LifeCycle","onStop");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v("LifeCycle", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v("LifeCycle", "onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Log.v("LifeCycle", "onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        String name = editText.getText().toString();
        outState.putString("savedString",name);
    }
}

