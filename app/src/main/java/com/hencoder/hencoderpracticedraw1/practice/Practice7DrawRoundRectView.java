package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        float left = 300F;
        float top = 200F;
        float right = 750F;
        float bottom = 450F;
        float rX = 40F;
        float rY = 40F;

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10F);

        if (Build.VERSION.SDK_INT >= 21) {
            canvas.drawRoundRect(left, top, right, bottom, rX, rY, paint);
        } else {
            RectF rectF = new RectF(left, top, right, bottom);
            canvas.drawRoundRect(rectF, rX, rY, paint);
        }
    }
}
