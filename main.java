import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    static fenetre f;
    public static void main(String[] args) {

        f=new fenetre();
        f.initialise ();
        minuteur m=new minuteur ();
        m.start ();

    }



    static void SetinBackground(fenetre f){
        f.setVisible (false);
        Runtime.getRuntime().gc();
    }
    static String hour(){
        Long millis = System.currentTimeMillis();
        Date hour = new Date(millis);
        return new SimpleDateFormat ("HH:mm").format (hour);
    }
}
