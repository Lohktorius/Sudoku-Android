package main.projet.sudoku;

class GridLevel {
    private int level;
    private int num;
    private int done;

    public GridLevel(int level, int num, int done){
        this.level = level;
        this.num = num;
        this.done = done;
    }
    public String toString(){
        return "Grid n° " + num + " level " + level + "\n" + done + " %";
    }
}