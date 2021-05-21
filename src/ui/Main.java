package ui;

import model.ColorFlagPrinter;
import thread.ColorFlagPrinterThread;

public class Main {
    public final static String ESC   = "\u001b[";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String RED_BACKGROUND = "\u001B[41m";


    private static ColorFlagPrinter yellow;
    private static ColorFlagPrinter blue;
    private static  ColorFlagPrinter red;

    private static  ColorFlagPrinterThread threadYellow;
    private static  ColorFlagPrinterThread threadBlue;
    private static  ColorFlagPrinterThread threadRed;

    public static void main(String[] args){

         yellow = new ColorFlagPrinter(YELLOW_BACKGROUND,0,0,10,80);
         blue = new ColorFlagPrinter(BLUE_BACKGROUND,11,0,15,80);
         red = new ColorFlagPrinter(RED_BACKGROUND,16,0,20,80);

        threadYellow = new ColorFlagPrinterThread(5,yellow);
        threadBlue = new ColorFlagPrinterThread(23,blue);
        threadRed = new ColorFlagPrinterThread(50,red);

        System.out.print(ESC+"2J");
        threadYellow.start();
        threadBlue.start();
        threadRed.start();

    }




}
