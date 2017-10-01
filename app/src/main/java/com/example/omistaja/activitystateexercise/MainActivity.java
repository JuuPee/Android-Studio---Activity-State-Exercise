package com.example.omistaja.activitystateexercise;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements TextEntryDialogFragment.TextEntryDialogListener {
    private final String TEXTVIEW_STATEKEY = "TEXTVIEW_STATEKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Comment below to test
        TextView textView = (TextView) findViewById(R.id.textView1);
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(TEXTVIEW_STATEKEY)) {
                String text = savedInstanceState.getString(TEXTVIEW_STATEKEY);
                textView.setText(text);
            }
        }

    }
    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        // Toast.makeText(getBaseContext(), "onSaveInstanceState",
        Toast.LENGTH_SHORT.show();
        // get text view
        TextView textView = (TextView) findViewById(R.id.textView1);
        // save text view state
        saveInstanceState.putString(TEXTVIEW_STATEKEY, textView.getText().toString());
    }

}
