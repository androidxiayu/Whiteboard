package cn.lemon.whiteboard.type;

import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.RequiresApi;

import cn.lemon.whiteboard.BoardView;

/**
 * Created by linlongxin on 2016/10/21.
 */

public class OvalShape extends RectShape {



    public OvalShape(BoardView boardView) {
        super(boardView);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void draw(Canvas canvas) {
        canvas.drawOval(mLeft,mTop,mRight,mBottom,mPaint);
    }
}

