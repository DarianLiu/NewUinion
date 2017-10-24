package com.geek.newunion.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * K线图数据处理
 * Created by Administrator on 2017/10/21.
 */

public class DataParse implements Serializable {
    private List<String> data;
    private String date;

    public void setData(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}
