package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float baseX = 350F;
        float baseY = 180F;
        float radius = 150F;
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint fillPaint = new Paint();
        fillPaint.setStyle(Paint.Style.FILL);
        fillPaint.setAntiAlias(true);
        canvas.drawCircle(baseX,baseY,radius, fillPaint);

        Paint fillPaintBlue = new Paint();
        fillPaintBlue.setStyle(Paint.Style.FILL);
        fillPaintBlue.setColor(Color.BLUE);
        fillPaintBlue.setAntiAlias(true);
        canvas.drawCircle(baseX,baseY*3,radius, fillPaintBlue);

        Paint strokePaint = new Paint();
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setAntiAlias(true);
        strokePaint.setStrokeWidth(3f);
        canvas.drawCircle(baseX*2,baseY,radius, strokePaint);

        Paint strokePaintWider = new Paint();
        strokePaintWider.setStyle(Paint.Style.STROKE);
        strokePaintWider.setAntiAlias(true);
        strokePaintWider.setStrokeWidth(50f);
        canvas.drawCircle(baseX*2,baseY*3,radius, strokePaintWider);

    }
}
