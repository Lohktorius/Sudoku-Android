package main.projet.sudoku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LevelSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_selection);

        ListView liste = (ListView) findViewById(R.id.listView);

        Bundle bun = getIntent().getExtras();
        String data = bun.getString("key");

        GridLevel[] level = new GridLevel[100];

        switch (data) {
            case "1":
                int level1Choice = Integer.parseInt(data);
                for (int i=0; i<100; i++){
                    level[i] = new GridLevel(level1Choice, i+1, 99);
                    ArrayAdapter<GridLevel> adapterLevel1 = new ArrayAdapter<GridLevel>(this, android.R.layout.simple_list_item_1, android.R.id.text1, level);
                    liste.setAdapter(adapterLevel1);
                }
                break;
            case "2":
                int level2Choice = Integer.parseInt(data);
                for (int i=0; i<100; i++) {
                    level[i] = new GridLevel(level2Choice, i+1, 99);
                    ArrayAdapter<GridLevel> adapterLevel2 = new ArrayAdapter<GridLevel>(this, android.R.layout.simple_list_item_1, android.R.id.text1, level);
                    liste.setAdapter(adapterLevel2);
                }
                break;
            case "3":
                int level3Choice = Integer.parseInt(data);
                for (int i=0; i<100; i++) {
                    level[i] = new GridLevel(level3Choice, i+1, 99);
                    ArrayAdapter<GridLevel> adapterLevel3 = new ArrayAdapter<GridLevel>(this, android.R.layout.simple_list_item_1, android.R.id.text1, level);
                    liste.setAdapter(adapterLevel3);
                }
                break;
        }
    }
}
