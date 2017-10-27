package com.example.administrator.testrxjava.ui;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Administrator on 2017/10/27.
 */

public class BaseActivity extends Activity {

    public void startActivity(Class<CreateActivity> activity){
        Intent i = new Intent(this,activity.getClass());
        startActivity(i);
    }
}

