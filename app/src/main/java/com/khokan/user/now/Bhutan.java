package com.khokan.user.now;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bhutan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhutan);
    }
    public void open(View view){
        Intent goBrowser=new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Bhutan"));
        startActivity(goBrowser);
    }
}
