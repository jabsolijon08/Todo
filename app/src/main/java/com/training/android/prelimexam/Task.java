package com.training.android.prelimexam;

/**
 * Created by Dyste on 12/15/2016.
 */

public class Task {

    private String Title;
    private String Desc;

    public Task() {
    }

    public Task(String desc, String title) {
        Desc = desc;
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
