package net.chendcer.rain.coolweather.util;

/**
 * Created by chend on 2016/3/11.
 */
public interface HttpCallbackListener {
    void onFinsh(String response);

    void onError(Exception e);
}
