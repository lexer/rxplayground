package com.lyft.android.rxplayground;

import dagger.Module;

/**
 * Created by zakharov on 7/29/14.
 */
@Module(
        injects = {
                App.class,
                MainActivity.class
        }
)
public class AppModule {


    private final App app;

    public AppModule(App app) {
        this.app = app;
    }
}
