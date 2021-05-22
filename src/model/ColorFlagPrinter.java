package model;

public class ColorFlagPrinter {
    private  String color;
    private int lines;
    private int columns;
    private int lastLine;
    private int lastColumns;
    public final static String ESC   = "\u001b[";


    public ColorFlagPrinter(String color, int lines, int columns, int lastLine, int lastColumns) {
        this.color = color;
        this.lines = lines;
        this.columns = columns;
        this.lastLine = lastLine;
        this.lastColumns = lastColumns;

    }


    public String getColor() {
        return color+" ";
    }

    public  int getLines() {
        return lines;
    }

    public  int getColumns() {
        return columns;
    }

    public  int getLastLine() {
        return lastLine;
    }

    public  int getLastColumns() {
        return lastColumns;
    }



}
