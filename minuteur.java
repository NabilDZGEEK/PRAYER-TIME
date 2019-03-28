import javax.swing.*;

public class minuteur extends Thread {
    @Override
    public void run() {
        String s = "حان الأن صلات ";
        JOptionPane notification = new JOptionPane ();
       while (true) {
           try {
               sleep (60000);
           } catch (InterruptedException e) {
           }


           if (main.hour ().equals (horaires.fajr)) {
               JOptionPane.showMessageDialog (notification, s + "الفجر ");
           }
           if (main.hour ().equals (horaires.echourouk)) {
               JOptionPane.showMessageDialog (notification, "شروق الشمس ");
           }
           if (main.hour ().equals (horaires.dohr)) {
               JOptionPane.showMessageDialog (notification, s + "الظهر ");
           }
           if (main.hour ().equals (horaires.asr)) {
               JOptionPane.showMessageDialog (notification, s + "العصر ");
           }
           if (main.hour ().equals (horaires.maghrib)) {
               JOptionPane.showMessageDialog (notification, s + "المغرب");
           }
           if (main.hour ().equals (horaires.ishaa)) {
               JOptionPane.showMessageDialog (notification, s + "العشاء");
           }

           int input = notification.getOptionType ();
           if (input == JOptionPane.OK_OPTION) {
               System.out.println ("passé par la");
               main.f = new fenetre ();
               main.f.initialise ();
           }
       }
    }
}
