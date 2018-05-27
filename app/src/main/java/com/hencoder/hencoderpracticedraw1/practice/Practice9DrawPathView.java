package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        float radius = 100F;
        float left = 300F;
        float right = left + 2 * radius;
        float top = 100F;
        float bottom = top + 2 * radius;

        float left2 = right;
        float right2 = left2 + 2 * radius;

        RectF oval1 = new RectF(left, top, right, bottom);
        RectF oval2 = new RectF(left2, top, right2, bottom);
        Path path = new Path();
        path.addArc(oval1, -225F, 225F);
        path.arcTo(oval2, -180F, 225F, false);
        path.lineTo(left2, top + radius + radius*2);

        canvas.drawPath(path, paint);
    }
}
