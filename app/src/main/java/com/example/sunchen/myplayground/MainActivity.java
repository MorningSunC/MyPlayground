package com.example.sunchen.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * I have 11 different components
 *  textview - I have modified text and textcolor
 *  spinner - I have modified entries
 *  radiobutton - I have modified text and textcolor
 *  checkbox - I have modified text and textsize
 *  ratingbar - I have modified text and rating
 *  edittext - I have modified text and inputtype
 *  button - I have modified text and textcolor
 *  imageview - I have modified src to a picture
 *  progressbar - I have modified progress and style
 *  togglebutton - I have modified background and layout_toRightOf
 *  imagebutton - I have modified background and layout_toRightOf
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private Spinner spinner;
    private RadioButton radioButton;
    private CheckBox checkBox;
    private RatingBar ratingBar;
    private EditText editText;
    private Button button;
    private ImageView imageView;
    private ProgressBar progressBar;
    private ToggleButton toggleButton;
    private ImageButton imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        editText = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageview);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        toggleButton = (ToggleButton) findViewById(R.id.togglebutton);
        imagebutton = (ImageButton) findViewById(R.id.imagebutton);

        button.setOnClickListener(this);
        radioButton.setOnClickListener(this);
        toggleButton.setOnClickListener(this);
        imagebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.radioButton:
                break;
            case R.id.button:
                break;
            case R.id.togglebutton:
                break;
            case R.id.imagebutton:
                break;
        }
    }
}
