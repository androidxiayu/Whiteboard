package cn.lemon.whiteboard.widget.shape;

import android.graphics.Canvas;

import cn.lemon.whiteboard.widget.BoardView;

/**
 * Created by linlongxin on 2016/10/24.
 */

public class LineShape extends DrawShape {

    public int mStartX;
    public int mStartY;
    public int mEndX;
    public int mEndY;

    public LineShape(BoardView boardView) {
        super(boardView);
    }

    @Override
    public void touchMove(int startX, int startY, int currentX, int currentY) {
        if (mStartX == 0 && mStartY == 0) {
            mStartX = startX;
            mStartY = startY;
        }
        mEndX = currentX;
        mEndY = currentY;
        mDrawView.invalidate();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawLine(mStartX, mStartY, mEndX, mEndY, mPaint);
    }
}
