package mainpackage.sudoku;

import android.app.Activity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import main.projet.sudoku.R;

public class DataManager {
    private Activity activity;

    public DataManager(Activity activity){
        this.activity=activity;
    }
    public MyAdaptor getAdapter(String data){
        int level1Choice = Integer.parseInt(data);
        /*ArrayList<GridLevel> level = new ArrayList();
        int level1Choice = Integer.parseInt(data);
        for (int i=0; i<100; i++){
            GridLevel gridLevel = new GridLevel(1, level1Choice, i+1, 90, "001700509573024106800501002700295018009400305652800007465080071000159004908007053");
            level.add(gridLevel);
        }*/
        int ressourceFile;
        switch(level1Choice){
            case 1:
                ressourceFile = R.raw.level1;
                break;
            case 2:
                ressourceFile = R.raw.level2;
                break;
            case 3:
                ressourceFile = R.raw.level3;
                break;
            default:
                ressourceFile = R.raw.level1;
                break;
        }

        ArrayList<GridLevel> level = getGridLevelList(level1Choice, ressourceFile);
        MyAdaptor adapterLevel = new MyAdaptor(this.activity, level);
        return adapterLevel;
    }



    public ArrayList<GridLevel> getGridLevelList(int level, int fileSource) {

        InputStream is = activity.getResources().openRawResource(fileSource);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String str = new String();
        String buf = str;

        ArrayList<GridLevel> gridsLevel = new ArrayList();
        if (is != null) {
            try {
                int index = 0;
                while ((str = reader.readLine()) != null) {
                        gridsLevel.add(new GridLevel(index, level, index, 30, str));
                    index++;
                }
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return gridsLevel;
    }
}
