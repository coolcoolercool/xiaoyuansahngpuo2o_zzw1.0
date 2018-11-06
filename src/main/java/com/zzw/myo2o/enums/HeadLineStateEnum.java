package com.zzw.myo2o.enums;

/**
 * author: zzw5005
 * date: 2018/10/31 21:09
 */

/*
* HeadLine的相关状态
* */
public enum HeadLineStateEnum {
    SUCCESS(0,"创建成功"),
    INNER_ERROR(-1001,"操作失败"),
    EMPTY(-1002,"头条信息为空");

    private int state;
    private String stateInfo;

    private HeadLineStateEnum(int state, String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    private int getState(){
        return state;
    }

    public String getStateInfo(){
        return stateInfo;
    }

    public static HeadLineStateEnum stateOf(int index){
        for(HeadLineStateEnum state : values()){
            if(state.getState() == index){
                return state;
            }
        }
        return null;
    }
}
