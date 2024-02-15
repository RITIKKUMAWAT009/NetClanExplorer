package com.example.netclanexplorer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class CustomSeekBar extends androidx.appcompat.widget.AppCompatSeekBar {

    private Paint textPaint;

    public CustomSeekBar(Context context) {
        super(context);
        init();
    }

    public CustomSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        textPaint = new Paint();
        textPaint.setColor(getResources().getColor(android.R.color.white));
        textPaint.setTextSize(40f);
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);  float centerX = getThumb().getBounds().exactCenterX();
        float centerY = getThumb().getBounds().exactCenterY();
        float textWidth = textPaint.measureText(String.valueOf(getProgress()));
        float textHeight = textPaint.getTextSize();
float marginBg=65;
        float left = centerX - textWidth ;
        float top = centerY - textHeight / 2 - marginBg;
        float right = centerX + textWidth ;
        float bottom = centerY + textHeight -marginBg;

        textPaint.setColor(getResources().getColor(R.color.black));
        canvas.drawRect(left, top, right, bottom, textPaint);
        float margin = 60;
        textPaint.setColor(getResources().getColor(android.R.color.white));
        canvas.drawText(String.valueOf(getProgress()), centerX, centerY - ((textPaint.descent() + textPaint.ascent()) / 2)-margin, textPaint);
    }
}

