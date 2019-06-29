package cn.wsgwz.myapplication;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    //@Named("str1")
    /*@Provides
    @Singleton
    String str() {
        return "23211";
    }*/


    //@Named("baseContext")
    @Provides
    //@ActivityScope
    //@Singleton
    Context provideContext() {
        return AppApplication.getInstance();
    }


    @Provides
    String provideStr00() {
        return "str00";
    }

    @Provides
    @Named("str0")
    String provideStr0() {
        return "str0";
    }

    @Provides
    @Named("str1")
    String provideStr1() {
        return "str1";
    }

}
