package net.hutek.intent_example;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import java.io.File;

public class CallOther extends Activity {
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.callother);
    }

    public void mOnClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.web:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
                break;
            case R.id.dial:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01059155005"));
                startActivity(intent);
                break;
            case R.id.picture:
                intent = new Intent(Intent.ACTION_VIEW);
                String sd = Environment.getExternalStorageDirectory().getAbsolutePath();
                Uri uri = Uri.fromFile(new File(sd + "/test.jpg"));
                intent.setDataAndType(uri, "image/jpeg");
                startActivity(intent);
                break;
            case R.id.other:
                intent = new Intent(Intent.ACTION_MAIN);
                intent.setComponent(new ComponentName("exam.memo", "exam.memo.Memo"));
                //intent.setClassName("exam.memo", "exam.memo.Memo");
                startActivity(intent);
                break;
        }
    }
}


