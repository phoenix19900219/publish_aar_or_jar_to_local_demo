package com.stone.alib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author stone
 * @date 16/11/25
 */
public class MyTextView extends TextView {
    String DEFAULT_TEXT = "Hello Android Studio !!\n\nHello maven !!\n\nHello gradle !!";

    public MyTextView(Context context) {
        super(context);
        setText(DEFAULT_TEXT);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(DEFAULT_TEXT);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setText(DEFAULT_TEXT);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setText(DEFAULT_TEXT);
    }
}
