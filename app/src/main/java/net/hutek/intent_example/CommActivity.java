package net.hutek.intent_example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CommActivity extends Activity {
    final static int ACT_EDIT = 0;
    TextView mText;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.commactivity);

        mText = (TextView) findViewById(R.id.text);
    }

    public void mOnClick(View v){
        switch (v.getId()) {
            case R.id.btnedit:
                Intent intent = new Intent(this, ActEdit.class);
                intent.putExtra("TextIn", mText.getText().toString());
                startActivityForResult(intent, ACT_EDIT);
                break;
        }
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case ACT_EDIT:
                if (resultCode == RESULT_OK) {
                    mText.setText(data.getStringExtra("TextOut"));
                }
                break;
        }
    }
}
