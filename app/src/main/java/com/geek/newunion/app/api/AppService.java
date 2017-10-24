package com.geek.newunion.app.api;

import io.reactivex.Observable;
import com.geek.newunion.mvp.model.entity.BaseJson;
import com.geek.newunion.mvp.model.entity.DataParse;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 服务器请求Service
 * Created by LiuLi on 2017/10/24.
 */

public interface AppService {

    String CONTENT_TYPE = "Content-Type: application/json";
    String ACCEPT = "Accept: application/json";

    //获取日K线
    @Headers({CONTENT_TYPE, ACCEPT})
    @POST(Api.DAY_LINE)
    Observable<BaseJson<DataParse>> dayLine(@Body RequestBody body);

    //获取K线
    @Headers({CONTENT_TYPE, ACCEPT})
    @POST(Api.K_LINE)
    Observable<BaseJson<DataParse>> kLine(@Body RequestBody body);
}
