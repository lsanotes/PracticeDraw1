package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5F);
        paint.setStyle(Paint.Style.STROKE);

        float left = 400F;
        float top = 200F;
        float right = 750F;
        float bottom = 550F;

        RectF oval = new RectF(left, top, right, bottom);
        canvas.drawArc(oval, 180F, 60F, false, paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(oval, 250F, 100F, true, paint);

        canvas.drawArc(oval, 20F, 140F, false, paint);
    }
}
