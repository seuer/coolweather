package com.example.coolweather.util;

/**
 * �ص����ƽӿ�
 *
 */
public interface HttpCallbackListener {
   void onFinish(String response);
   void onError(Exception e);
}
