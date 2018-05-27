package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.system.Os;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆

        float left = 300F;
        float right = 800F;
        float top = 200F;
        float bottom = 500F;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if(Build.VERSION.SDK_INT >= 21) {
            canvas.drawOval(left, top, right, bottom, paint);
        } else {
            RectF rectF = new RectF(left, top, right, bottom);
            canvas.drawOval(rectF, paint);
        }
    }
}
