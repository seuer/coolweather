package com.example.coolweather.util;

/**
 * 回调机制接口
 *
 */
public interface HttpCallbackListener {
   void onFinish(String response);
   void onError(Exception e);
}
