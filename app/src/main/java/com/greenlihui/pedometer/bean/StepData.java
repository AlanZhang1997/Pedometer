package com.greenlihui.pedometer.bean;

/**
 * 步数数据类，一条数据包含三条属性{日期，步数，排名}
 * 一个用户所有的步数数据放入一个 List 中。
 * 其中日期格式为“yyyy-MM-dd”
 */

public class StepData {
    private String date;
    private int steps;
    private int rank;

    public StepData(String date, int steps, int rank) {
        this.date = date;
        this.steps = steps;
        this.rank = rank;
    }

    public String getDate() {
        return date;
    }

    public int getSteps() {
        return steps;
    }

    public int getRank() {
        return rank;
    }
}

