package net.hutek.intent_example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);
    }

    public void mOnClick(View v) {
        finish();
    }
}
