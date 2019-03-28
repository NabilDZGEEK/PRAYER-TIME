import java.io.*;
public class horaires {
    static String fajr,echourouk,dohr,asr,maghrib,ishaa;

    static String date(String line){
        String s="";
        for(int i=0;i<10;i++){
            s+=line.charAt (i);
        }
        return s;
    }
    static void sethours(String line){
        int cpthours=1; int cpt=0;
        String s="";
        System.out.println (line);
        for(int i=11;i<=line.length ();i++){
            if(cpt<5){
                s+=line.charAt (i);
                cpt++;
            }
            else{
                switch (cpthours){

                    case 1:fajr=s; break;
                    case 2:echourouk=s; break;
                    case 3:dohr=s; break;
                    case 4:asr=s; break;
                    case 5:maghrib=s; break;
                    case 6:ishaa=s; break;
                }
                System.out.println (cpthours+"  "+s);
                s="";cpthours++;cpt=0;
            }

        }

    }
    static void set(){
        File file=new File("/home/nabil/IdeaProjects/prayer time/horaires");
        try {
            FileReader fr=new FileReader (file);
            BufferedReader bf =new BufferedReader (fr);
            String line=bf.readLine ();
            //                0123456789
            //exemple ligne : 19/03/2019	05:42	06:54	12:56	16:21	19:01	20:15
            do{
                if(fenetre.aujourdhui ().equals (date(line))){
                    sethours (line);
                    break;
                }

                line=bf.readLine ();
            }while (line!=null);
        }

        catch (IOException e){
            System.out.println ("erreur lecture");
        }
    }
}
