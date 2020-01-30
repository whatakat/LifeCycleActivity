package com.bankmtk.lifecycleactivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.bankmtk.lifecycleactivity.StartSecondActivity.TEXT;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Parcel parcel = (Parcel)getIntent().getExtras().getSerializable(TEXT);
        TextView textView = (TextView)findViewById(R.id.textView);
        EditText editText = (EditText)findViewById(R.id.editText3);
        textView.setText(parcel.text);
        editText.setText(((Integer)parcel.number).toString());
        Toast.makeText(getApplicationContext(),"Second - onCreate()",Toast.LENGTH_SHORT).show();
    }

}
