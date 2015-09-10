package com.francis.framework.request;

/**
 * Created by Administrator on 2015/9/6.
 */
public class Dao {

    private static final String BASE_URL = "http://content.panshimob.com/router/rest?";

    private static final String REGISTER_PUB_PARA = "appId=%s&method=%s&timestamp=%s&format=json&v=1.0";


    private static Dao mInstance;

    private Dao() {
    };

    public static Dao instance() {
        if (mInstance == null) {
            mInstance = new Dao();
        }
        return mInstance;
    }
}
