import java.util.*;
import java.io.*;
import java.lang.*;

public class pTest {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/Users/mikehammoud/Desktop/java/A1/src/assign1.txt");
        palindrome p = new palindrome();
        Scanner sc = new Scanner(f);
        List<String> l = new ArrayList<String>();
        while(sc.hasNext()){
        String s = sc.next();
        l.add(s);
        }

        String[] la = l.toArray(new String[0]);

        for(String k : la){

             if(p.pal(k) && p.mir(k)){
                 System.out.println(""+k +"  -- is a mirrored palindrome.");

            }
            if (p.pal(k)){
                System.out.println("" +k+ " - is a regular palindrome.");
            }if(!p.pal(k)){
                System.out.println("" +k+ " - is not a  palindrome.");


            }


            if(p.mir(k)){

                System.out.println(""+k+" -- is a mirrored string");
            }
            }
        }
    }

