package mainpackage.sudoku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import main.projet.sudoku.R;


public class LevelSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_selection);

        ListView liste = (ListView) findViewById(R.id.listView);

        Bundle bun = getIntent().getExtras();
        String data = bun.getString("key");

        DataManager dataManager = new DataManager(this);
        liste.setAdapter(dataManager.getAdapter(data));
    }
}
