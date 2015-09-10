package com.francis.framework.ui;

import android.os.Bundle;

import com.francis.framework.R;
import com.francis.framework.activity.BaseSwipeBackActivity;

/**
 * Created by Administrator on 2015/9/7.
 */
public class DemoActivity extends BaseSwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }



    private void initView(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
