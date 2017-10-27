package com.example.administrator.testrxjava.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.testrxjava.R;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        create = (Button) findViewById(R.id.create);
        create.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.create:
                startActivity(CreateActivity.class);
                break;
        }
    }
}
