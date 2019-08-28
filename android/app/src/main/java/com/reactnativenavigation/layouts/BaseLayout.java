package com.reactnativenavigation.layouts;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;

public abstract class BaseLayout extends RelativeLayout implements Layout {

    public BaseLayout(AppCompatActivity activity) {
        super(activity);
    }

    protected AppCompatActivity getActivity() {
        return (AppCompatActivity) getContext();
    }
}
