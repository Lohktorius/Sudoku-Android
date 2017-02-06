package mainpackage.sudoku;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Draw {
    float startX,startY, stopX, stopY;
    private Paint paint;
    public Draw(float startX, float startY, float stopX, float stopY){
        this.startX = startX ;
        this.startY = startY;
        this.stopX = stopX;
        this.stopY = stopY;
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
    }
    public void draw(Canvas canvas){
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }
    public void setStrokeWidht(int x){
        paint.setStrokeWidth(x);
    }
}