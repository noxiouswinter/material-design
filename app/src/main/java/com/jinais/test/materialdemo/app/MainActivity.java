package com.jinais.test.materialdemo.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBToolbarActionbarActivity(View view) {
        Intent intent = new Intent(this, ToolbarActionbarActivity.class);
        startActivity(intent);
    }

    public void onClickBActionbarDrawerActivity(View view) {
        Intent intent = new Intent(this, ActionbarDrawerActivity.class);
        startActivity(intent);
    }

    public void onClickBTabsActivity(View view) {
        Intent intent = new Intent(this, TabsActivity.class);
        startActivity(intent);
    }

}
