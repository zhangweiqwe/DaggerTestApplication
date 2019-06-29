package cn.wsgwz.myapplication;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MainPresenter {
    private static final String TAG = "MainPresenter";


    //@Named("baseContext")
    private Context context;

    @Inject
    @Named("str0")
    String str;

    @Inject //构造器注入
    public MainPresenter(Context context) {
        this.context = context;
    }





    public void print() {
        Log.d(TAG, "This is a MainPresenter\t" + context+"\t"+str);
    }
}
