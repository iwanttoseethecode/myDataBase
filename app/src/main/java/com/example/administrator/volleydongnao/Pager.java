package com.example.administrator.volleydongnao;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16 0016.
 */

public class Pager {
   private String stat;

    private List<News> data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<News> getData() {
        return data;
    }

    public void setData(List<News> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pager{" +
                "stat='" + stat + '\'' +
                ", data=" + data +
                '}';
    }
}
