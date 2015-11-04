package com.example.billmac1.dfrag;

/**
 * Created by billmac1 on 11/3/2015.
 */
import android.os.Bundle;

public class OtherActivity extends LifecycleLoggingActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
            getFragmentManager().beginTransaction()
                    .add(android.R.id.content,
                            new OtherFragment()).commit();
        }
    }
}
