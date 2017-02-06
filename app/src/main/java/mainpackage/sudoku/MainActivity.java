package mainpackage.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import main.projet.sudoku.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button level1Button;
    private Button level2Button;
    private Button level3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        level1Button = (Button) findViewById(R.id.button);
        level1Button.setOnClickListener(this);
        level2Button = (Button) findViewById(R.id.button2);
        level2Button.setOnClickListener(this);
        level3Button = (Button) findViewById(R.id.button3);
        level3Button.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v == level1Button){
            Intent intention = new Intent(this, LevelSelectionActivity.class);
            String buttonLevelSelection1 = "1";
            intention.putExtra("key", buttonLevelSelection1);
            startActivity(intention);
        }
        if(v == level2Button){
            Intent intention = new Intent(this, LevelSelectionActivity.class);
            String buttonLevelSelection2 = "2";
            intention.putExtra("key", buttonLevelSelection2);
            startActivity(intention);
        }
        if(v == level3Button){
            Intent intention = new Intent(this, LevelSelectionActivity.class);
            String buttonLevelSelection3 = "3";
            intention.putExtra("key", buttonLevelSelection3);
            startActivity(intention);
        }
    }
}
