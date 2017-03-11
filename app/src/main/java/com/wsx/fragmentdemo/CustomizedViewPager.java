package com.wsx.fragmentdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by wsx on 2017/2/10.
 */

public class CustomizedViewPager extends android.support.v4.view.ViewPager {

    private boolean TouchEvent = true;
    private boolean InterceptTouchEvent = true;

    public CustomizedViewPager(Context context) {
        super(context);
    }
    public CustomizedViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setTouchEvent(boolean touchEvent) {
        TouchEvent = touchEvent;
    }

    public void setInterceptTouchEvent(boolean interceptTouchEvent) {
        InterceptTouchEvent = interceptTouchEvent;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (!TouchEvent) {
            return false;
        }
        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(!InterceptTouchEvent){
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }
}
