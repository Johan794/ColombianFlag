package thread;

import model.ColorFlagPrinter;


public class ColorFlagPrinterThread extends Thread {
    private int sleep;
    private ColorFlagPrinter cfp;
    public static final String RESET = "\u001B[0m";


    public ColorFlagPrinterThread(int sleep,ColorFlagPrinter cfp) {
        this.sleep = sleep;
        this.cfp = cfp;

    }
    
    public void run(){
        for (int i = cfp.getColumns(); i <=cfp.getLastColumns() ; i++) {
            for (int j = cfp.getLines(); j <=cfp.getLastLine() ; j++) {
                System.out.print(ColorFlagPrinter.ESC +(i+1)+"G"+ColorFlagPrinter.ESC+(j+1)+"d"+cfp.getColor());
                System.out.print(RESET);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
