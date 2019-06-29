package cn.wsgwz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Inject
    MainPresenter mainPresenter;


    @Inject
    //@Named("str0")
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainPresenter.print();

        Log.d(TAG,"str="+str);
    }
}
