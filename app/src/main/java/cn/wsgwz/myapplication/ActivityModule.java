package cn.wsgwz.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

// 注意这里用的是抽象类和抽象方法
@Module
public abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();  // 绑定 MainActivity

    @ContributesAndroidInjector
    abstract BlankFragment blankFragment();  // 绑定 BlankFragment
}
