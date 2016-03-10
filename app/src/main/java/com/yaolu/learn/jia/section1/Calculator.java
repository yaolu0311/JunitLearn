package com.yaolu.learn.jia.section1;

/**
 * Created by Administrator on 2016/3/10.
 */
public class Calculator {

    private int mSum01;
    private int mSum02;

    public Calculator(int sum01, int sum02){
        mSum01 = sum01;
        mSum02 = sum02;
    }
    public int add(){
        return mSum01 + mSum02;
    }
    public int sub(){
        return mSum01 - mSum02;
    }
    public int times(){
        return mSum01 * mSum02;
    }
    public int divide(){
        if (mSum02 == 0) {
            return 0;
        }
        return mSum01 / mSum02;
    }



}
