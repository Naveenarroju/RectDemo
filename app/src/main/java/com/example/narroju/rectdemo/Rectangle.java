package com.example.narroju.rectdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Rectangle extends View {

    private Paint paint;
    public Rectangle(Context context) {
        super(context);

        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas = new Canvas();
        canvas.drawRect(200,20,300,400,paint);

    }
}
