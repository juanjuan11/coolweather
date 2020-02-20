package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小娟娟 on 2020/2/20.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
