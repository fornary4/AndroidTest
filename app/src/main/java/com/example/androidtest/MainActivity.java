package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button intoTextView;
    private Button intoEditText;
    private Button intoRadioButton;
    private Button intoCheckbox;
    private Button intoWebView;
    private Button intoFragment;
    private Button intoHelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intoTextView=findViewById(R.id.Button_into_textview);
        intoEditText=findViewById(R.id.Button_into_edittext);
        intoRadioButton=findViewById(R.id.Button_into_radiobutton);
        intoCheckbox=findViewById(R.id.Button_into_checkbox);
        intoWebView=findViewById(R.id.Button_into_webview);
        intoFragment=findViewById(R.id.Button_into_fragment);
        intoHelp=findViewById(R.id.Button_into_help);
        setListener();
    }
    private void setListener(){
        OnClick onClick=new OnClick();
        intoTextView.setOnClickListener(onClick);
        intoEditText.setOnClickListener(onClick);
        intoRadioButton.setOnClickListener(onClick);
        intoCheckbox.setOnClickListener(onClick);
        intoWebView.setOnClickListener(onClick);
        intoFragment.setOnClickListener(onClick);
        intoHelp.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener {

        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.Button_into_textview:
                    intent=new Intent(MainActivity.this,TextView.class);
                    break;
                case R.id.Button_into_edittext:
                    intent=new Intent(MainActivity.this,EditText.class);
                    break;
                case R.id.Button_into_radiobutton:
                    intent=new Intent(MainActivity.this,RadioButton.class);
                    break;
                case R.id.Button_into_checkbox:
                    intent=new Intent(MainActivity.this,Checkbox.class);
                    break;
                case R.id.Button_into_webview:
                    intent=new Intent(MainActivity.this, Webview.class);
                    break;
                case R.id.Button_into_fragment:
                    intent=new Intent(MainActivity.this,Container.class);
                    break;
                case R.id.Button_into_help:
                    intent=new Intent(MainActivity.this,HelpActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}