package mainpackage.sudoku;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import main.projet.sudoku.R;

public class SudokuGridActivity extends AppCompatActivity implements View.OnTouchListener{
    private Grid grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_grid);
        startChronometer(findViewById(R.id.chronometer4));

        Bundle objetbunble = this.getIntent().getExtras();
        String gridString =  objetbunble.getBundle("dataPasser").getString("stringGrid");
        grid = (Grid)findViewById(R.id.grid);
        grid.setStringGrid(gridString);
        grid.setOnTouchListener(this);


    }


    public void startChronometer(View view){
        ((Chronometer)findViewById(R.id.chronometer4)).start();
    }

    public void stopChronometer(View view){
        ((Chronometer)findViewById(R.id.chronometer4)).stop();
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                if(y<=9*100+180){
                    int selectionCase = 9*(y/100)+(x/100);
                    Log.i("ouibv", selectionCase+"   "+ grid.getNumTab(selectionCase));
                }
                if(y<=9*100+1270) {
                    int selectionCase = 9 * (y / 100) + (x / 100);
                    Log.i("ofazefzef", selectionCase+"   "+ grid.getNumTab(selectionCase));
                }
                break;
            default:
                int selectionCase = 9*(y/100)+(x/100);
                break;
        }
        return true;
    }
}
