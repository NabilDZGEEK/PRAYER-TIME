import javax.swing.*;

public class Clock extends Thread{
    fenetre f;
    @Override
    public void run() {

        while (true){
            try{
                Thread.sleep (1000);


            }catch (InterruptedException e){
                System.out.println ("error");
            }

            f.hour.setText (f.seconds ());
        }

    }
}
