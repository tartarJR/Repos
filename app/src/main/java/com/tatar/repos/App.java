package com.tatar.repos;

import android.app.Activity;
import android.app.Application;

import com.tatar.repos.di.component.AppComponent;
import com.tatar.repos.di.component.DaggerAppComponent;
import com.tatar.repos.di.module.ContextModule;

/**
 * Created by mobile on 13.04.2018.
 */

public class App extends Application {

    private AppComponent component;

    public static App get(Activity activity) {
        return (App) activity.getApplication();
    }

    public AppComponent component() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }
}
