package com.bankmtk.lifecycleactivity;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class StartSecondActivity implements View.OnClickListener {
    public final static String TEXT = "Text";
    private Activity sourceActivity;
    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        EditText txt = (EditText)sourceActivity.findViewById(R.id.editText);
        EditText num = (EditText)sourceActivity.findViewById(R.id.editText2);
    }
}
