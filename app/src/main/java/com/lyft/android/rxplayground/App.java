package com.lyft.android.rxplayground;

import android.app.Application;
import android.content.Context;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by zakharov on 7/29/14.
 */
public class App extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        buildObjectGraphAndInject();
    }

    public void buildObjectGraphAndInject() {
        objectGraph = ObjectGraph.create(getModules());
        objectGraph.inject(this);
    }

    public void inject(Object o) {
        objectGraph.inject(o);
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    protected Object[] getModules() {
        return Arrays.<Object>asList(new AppModule(this)).toArray();
    }
}
