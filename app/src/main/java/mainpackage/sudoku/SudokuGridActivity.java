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
    private Chronometer chronometer;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bdel;
    private Grid grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_grid);
        startChronometer(findViewById(R.id.chronometer4));
        Button b1 = (Button)findViewById(R.id.button1);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);
        Button b5 = (Button)findViewById(R.id.button5);
        Button b6 = (Button)findViewById(R.id.button6);
        Button b7 = (Button)findViewById(R.id.button7);
        Button b8 = (Button)findViewById(R.id.button8);
        Button b9 = (Button)findViewById(R.id.button9);
        Button bdel = (Button)findViewById(R.id.buttonDel);

        Bundle objetbunble = this.getIntent().getExtras();
        String gridString =  objetbunble.getBundle("dataPasser").getString("stringGrid");
        Log.d("olihzfe0", gridString);
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
                break;
        }
        return true;
    }
}
