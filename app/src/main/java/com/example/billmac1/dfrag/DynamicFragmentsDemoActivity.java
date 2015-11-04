package com.example.billmac1.dfrag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DynamicFragmentsDemoActivity extends AppCompatActivity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
        }

        public void showOther(View v) {
            startActivity(new Intent(this, OtherActivity.class));
        }
    }