/**
 * Created by Alexandre LEFAILLET on 13/10/2016.
 */

import java.io.*;
import java.util.*;

public class mapred {
    public static void main(String[] args) {

        String ligne = "";
        String fichier = "\\res\\prenoms.csv";
        ArrayList<Integer> counter = new ArrayList<Integer>(2);
        counter.set(0,0);//m
        counter.set(1,0);//f

        InputStream ips = new FileInputStream(fichier);
        InputStreamReader ipsr = new InputStreamReader(ips);
        BufferedReader br = new BufferedReader(ipsr);

        while ((ligne=br.readLine())!=null){
            String[] parts = ligne.split(";");
            String[] partss = parts[1].split(",");
            if(partss.length==2){
                counter.set(0,counter.get(0)+1);
                counter.set(1,counter.get(1)+1);
            }else{
                if(partss[0] == "m"){
                    counter.set(0,counter.get(0)+1);
                }else if(partss[0] == "f"){
                    counter.set(1,counter.get(1)+1);
                }
            }
        }
        br.close();
        //answer are (in %) m= counter.get(0)*100/(counter.get(0)+counter.get(1)) & f= counter.get(1)*100/(counter.get(0)+counter.get(1))
    }

}
