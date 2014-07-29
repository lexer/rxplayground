package com.lyft.android.rxplayground;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by zakharov on 7/29/14.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App.get(this).inject(this);
    }
}
