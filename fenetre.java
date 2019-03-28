import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.text.*;
public class fenetre extends JFrame {
    JPanel panel;
    JLabel hour,bismilah,date;
    Font font=new Font("Monaco",Font.PLAIN,35);
    void initialise(){
        setTitle("PRAYER TIME");
        setBounds(280,100,750,540);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout (null);
        setVisible(true);
        panel=new JPanel();
        panel.setLayout(null);

        bismilah=new JLabel();
        set_principallabel(bismilah);

        date =new JLabel ();
        set_labeldate (date);

        hour =new JLabel ();
        sethour (hour);
        addimage ();
        panel.setVisible(true);
        add(panel);

        horaires.set ();

        JPanel panel2=new JPanel ();
        panel2.setLayout (new GridLayout(2,7));
        panel2.setVisible (true);

        panel2.add (new JLabel (new ImageIcon ("/home/nabil/IdeaProjects/prayer time/msq.jpg")));
        panel2.add (new JLabel ("Fajr"));
        panel2.add (new JLabel ("Echourouk"));
        panel2.add (new JLabel ("douhr"));
        panel2.add (new JLabel ("asr"));
        panel2.add (new JLabel ("maghrib"));
        panel2.add (new JLabel ("ishaa"));
        panel2.add (new JLabel ("Athan"));
        panel2.add (new JLabel (horaires.fajr));
        panel2.add (new JLabel (horaires.echourouk));
        panel2.add (new JLabel (horaires.dohr));
        panel2.add (new JLabel (horaires.asr));
        panel2.add (new JLabel (horaires.maghrib));
        panel2.add (new JLabel (horaires.ishaa));
        System.out.println (horaires.asr);
        panel.setBounds (0,0,800,300);
        panel2.setBounds (0,300,800,200);
        add (panel2);
    }
    void set_principallabel(JLabel l){
        l.setText ("بسم الله الرحمان الرحيم");
        l.setBounds(280,20,250,30);
        l.setFont (new Font ("arial",Font.PLAIN,20));
        l.setForeground (Color.blue);
        panel.add(l);
    }
    void set_labeldate(JLabel l){
        l.setText (displayedDate ());
        l.setBounds(50,90,400,40);
        l.setFont(font);
        l.setForeground (Color.blue);
        panel.add(l);
    }
    void sethour(JLabel l){

       l.setBounds (230,150,300,50);
       l.setBackground (Color.BLACK);
       l.setFont (new Font ("arial",Font.PLAIN,60));
       Clock clock=new Clock ();
       clock.f=this;
       clock.start ();
       panel.add (l);
    }

    void addimage(){
        ImageIcon img=new ImageIcon ("/home/nabil/IdeaProjects/prayer time/image.jpg");
        JLabel l=new JLabel (img);
        l.setBounds (0,0,750,540);
        this.validate ();
        panel.add (l);
    }
    static String aujourdhui() {
        Long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        return new SimpleDateFormat ("dd/MM/yyyy").format (date);
    }
    String seconds(){
        Long millis = System.currentTimeMillis();
        Date hour = new Date(millis);
        return new SimpleDateFormat ("hh:mm:ss").format (hour);
    }

    String displayedDate(){
        Long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        return new SimpleDateFormat ("EEEEEEE ,MMMM ,yyyy").format (date);
    }
}
