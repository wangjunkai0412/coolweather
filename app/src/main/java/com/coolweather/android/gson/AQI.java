package com.coolweather.android.gson;

/**
 * Created by Xiaomi on 2018-08-29.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
