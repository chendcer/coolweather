package net.chendcer.rain.coolweather.util;

import android.text.TextUtils;

import net.chendcer.rain.coolweather.db.CoolWeatherDB;
import net.chendcer.rain.coolweather.model.Province;

/**
 * Created by chend on 2016/3/11.
 */
public class Utility {
    public synchronized static boolean handleProvincesResponse(CoolWeatherDB coolWeatherDB,String response){
        if(!TextUtils.isEmpty(response)){
            String[] allProvinces=response.split(",");
            if(allProvinces!=null&&allProvinces.length>0){
                for(String p:allProvinces){
                    String[] array=p.split("\\|");
                    Province province=new Province();
                            province.setProvinceCode(array[0]);
                }
            }
        }
        return true;
    }
}
