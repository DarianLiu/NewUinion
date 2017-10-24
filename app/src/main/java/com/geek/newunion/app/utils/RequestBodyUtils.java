package com.geek.newunion.app.utils;

import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * okhttp3 RequestBody处理工具类
 * Created by LiuLi on 2017/10/21.
 */

public class RequestBodyUtils {

    /**
     * RequestBody
     * 将json对象转换成RequestBody
     *
     * @param jsonObj
     */
    public static RequestBody newBody(JSONObject jsonObj) {
        return RequestBody.create(MediaType.parse("application/json; charset=UTF-8"), jsonObj.toString());
    }

    /**
     * 可进行加密
     */
    public static RequestBody newEncodeBody(JSONObject jsonObj) {

        return newBody(jsonObj);
    }
}