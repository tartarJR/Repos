package com.tatar.repos.di.component;

import com.squareup.picasso.Picasso;
import com.tatar.repos.di.module.PicassoModule;
import com.tatar.repos.di.module.ServiceModule;
import com.tatar.repos.network.Service;

import dagger.Component;

/**
 * Created by mobile on 13.04.2018.
 */

@Component(modules = {ServiceModule.class, PicassoModule.class})
public interface AppComponent {

    Service service();

    Picasso picasso();

}
