package mainpackage.sudoku;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


public class Grid extends View {

    private int numTab[];
    private String stringGrid;

    public Grid(Context context, AttributeSet attrs){
        super(context, attrs);

    }

    @Override
    public void onDraw(Canvas canvas){


        Draw draw1 = new Draw(0, 0, 900, 0);
        Draw draw2 = new Draw(0, 100, 900, 100);
        Draw draw3 = new Draw(0, 200, 900, 200);
        Draw draw4 = new Draw(0, 300, 900, 300);
        draw4.setStrokeWidht(10);
        Draw draw5 = new Draw(0, 400, 900, 400);
        Draw draw6 = new Draw(0, 500, 900, 500);
        Draw draw7 = new Draw(0, 600, 900, 600);
        draw7.setStrokeWidht(10);
        Draw draw8 = new Draw(0, 700, 900, 700);
        Draw draw9 = new Draw(0, 800, 900, 800);
        Draw draw10 = new Draw(0, 900, 900, 900);

        Draw draw11 = new Draw(0, 0,0, 900);
        Draw draw12 = new Draw(100, 0, 100, 900);
        Draw draw13 = new Draw(200, 0, 200, 900);
        Draw draw14 = new Draw(300, 0, 300, 900);
        draw14.setStrokeWidht(10);
        Draw draw15 = new Draw(400, 0, 400, 900);
        Draw draw16 = new Draw(500, 0, 500, 900);
        Draw draw17 = new Draw(600, 0, 600, 900);
        draw17.setStrokeWidht(10);
        Draw draw18 = new Draw(700, 0, 700, 900);
        Draw draw19 = new Draw(800, 0, 800, 900);
        Draw draw20 = new Draw(900, 0, 900, 900);

        draw1.draw(canvas);
        draw2.draw(canvas);
        draw3.draw(canvas);
        draw4.draw(canvas);
        draw5.draw(canvas);
        draw6.draw(canvas);
        draw7.draw(canvas);
        draw8.draw(canvas);
        draw9.draw(canvas);
        draw10.draw(canvas);

        draw11.draw(canvas);
        draw12.draw(canvas);
        draw13.draw(canvas);
        draw14.draw(canvas);
        draw15.draw(canvas);
        draw16.draw(canvas);
        draw17.draw(canvas);
        draw18.draw(canvas);
        draw19.draw(canvas);
        draw20.draw(canvas);

        Paint paintNumber = new Paint();
        paintNumber.setTextSize(60);



        //stringGrid = "001700509573024106800501002700295018009400305652800007465080071000159004908007053";

        int num;
        int positionX = 30;
        int positionY = 75;
        for(int i=0; i<=8; i++){
            for(int j=0; j<=8; j++) {
                int cpt;
                cpt = 9*i + j;
                num = Character.digit(stringGrid.charAt(cpt), 10);
                numTab[cpt]=num;
                Log.i("kubzf", numTab[cpt]+"");
                if (stringGrid.charAt(cpt)!='0' ) {
                    canvas.drawText(num + "", positionX, positionY, paintNumber);
                }
                positionX = positionX + 100;
            }
            positionY = positionY + 100;
            positionX = 30;
        }
    }

    public void setStringGrid(String stringGrid){
        this.stringGrid = stringGrid;
        numTab = new int[stringGrid.length()];
    }
    public int getNumTab(int indexTab){
        return numTab[indexTab];
    }
}