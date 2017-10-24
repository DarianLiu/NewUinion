package com.geek.newunion.app.api;

/**
 * ================================================
 * 存放一些与 API 有关的东西,如请求地址,请求码等
 * Created by Administrator on 2017/10/23.
 * ================================================
 */
public interface Api {

    String APP_DOMAIN = "https://api.github.com";
    String BASE_URL = "http://www.meiunite.com/api";

    String RETURN_CODE_ERROR = "SYSTEM_ERROR";//系统错误
    String RETURN_CODE_SUCCESS = "SUCCESS";//成功

    /**
     * ================================================
     * 服务器接口地址
     * ================================================
     */
    String DAY_LINE = "/socket/dayline";//日线图

    String K_LINE = "/socket/kline";//K线图
}
