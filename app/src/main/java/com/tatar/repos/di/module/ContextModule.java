package com.tatar.repos.di.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobile on 13.04.2018.
 */

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context context() {
        return context;
    }
}
