package cn.wsgwz.myapplication;

import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;


public class AppApplication extends
        Application implements HasAndroidInjector
        //DaggerApplication implements HasSupportFragmentInjector
{

    private static AppApplication appApplication;
    @Inject
    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        appApplication = this;

        DaggerAppComponent.create()
                .inject(this);
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }

    public static final AppApplication getInstance() {
        return appApplication;
    }
   /*

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentSupportInjector;





    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.create();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentSupportInjector;
    }*/
}