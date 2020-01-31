import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.CharSequence;

public class palindrome {

    public boolean pal(String x){
        if(x.length() <=1) {
            return true;
        } else if (x.charAt(0) != x.charAt(x.length()-1)) {
            return false;
        } else {
            return pal(x.substring(1, x.length()-1));
        }
    }


    public boolean mir(String k){
        char [] f = {'A', 'E', 'H','I','J','L','M','O','S','T', 'U', 'W','X','Y','Z','1','2','3','5','8'};
        char [] g = {'A', '3', 'H','I','L','J','M','O','2','T', 'U', 'W','X','Y','5','1','S','E','Z','8'};
        char[] c = k.toCharArray();
        int n = c.length;
        int mid = n/2;
        int count = 0;
        for(int i = 0; i<=mid; i++){
            char a = c[i];
                for (char x : f) {
                    if (x == a) {
                        count++;

                        for (char z : g) {
                            if (z == c[n - 1]) {
                                count++;
                                if(count == n || count == n-1){
                                    return true;
                                }
                                continue;
                            }
                        }
                    }

                    }

                }
        return false;

    }

    }







