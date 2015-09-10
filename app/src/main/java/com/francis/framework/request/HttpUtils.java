package com.francis.framework.request;


import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2015/9/6.
 */
public class HttpUtils {

    private static final OkHttpClient mOkHttpClient = new OkHttpClient();

    static{
        mOkHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
    }
    /**
     * 开启同步线程。
     * @param request
     * @return
     */
    public static Response execute(Request request) throws IOException {
        return mOkHttpClient.newCall(request).execute();
    }

    /**
     * 开启异步线程访问网络
     * @param request
     * @param responseCallback
     */
    public static void enqueue(Request request, Callback responseCallback){
        mOkHttpClient.newCall(request).enqueue(responseCallback);
    }

    /**
     * 开启异步线程访问网络, 且不在意返回结果（实现空callback）
     * @param request
     */
    public static void enqueue(Request request){
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Response response) throws IOException {
            }
            @Override
            public void onFailure(Request request1, IOException ioException) {
            }
        });

    }
}
