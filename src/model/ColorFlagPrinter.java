package model;

public class ColorFlagPrinter {
    public final static String ESC   = "\u001b[";
    private  String color;
    private int lines;
    private int columns;
    private int lastLine;
    private int lastColumns;


    public ColorFlagPrinter(String color, int lines, int columns, int lastLine, int lastColumns) {
        this.color = color;
        this.lines = lines;
        this.columns = columns;
        this.lastLine = lastLine;
        this.lastColumns = lastColumns;

    }

    public synchronized void printColor(String color,int i , int j){
        System.out.print(ESC+(i)+"G"+ESC+(j)+"d");
        System.out.print(color);
    }


    public String getColor() {
        return color+" ";
    }

    public int getLines() {
        return lines;
    }

    public int getColumns() {
        return columns;
    }

    public int getLastLine() {
        return lastLine;
    }

    public int getLastColumns() {
        return lastColumns;
    }
}
