import java.util.Scanner;
/* 
always emphasis is on last 2 characters;
eg -> 123 so we can break 123 as 12-3 and 1-23
so we ask ki 12 ki encoding dedo unke peeche 3 add krdoongs
or 1 ki encoding dedo uske peeche 23 add krdoonga
four cases to handle
 1  0 - 0
 2  0 - non0
3  non0 - 0
4  non0 - non0
*/
public class countEncodings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();

        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < dp.length - 1 ; i++) {

            if (s.charAt(i - 1) == '0' && s.charAt(i) == '0') {
                //eg 100 can be split into 10 - 0 and 1 -00 we dont have encoding for both 0 and 00 so not possible
                dp[i] = 0;
            } 
            else if (s.charAt(i - 1) == '0' && s.charAt(i) != '0') {
                //eg -> 2103 -> 210 -3 and 21 - 03 we have encoding for 3 but we dont have encoding for 03
                dp[i] = dp[i - 1];
            }

            else if (s.charAt(i - 1) != '0' && s.charAt(i) == '0') {
                //eg -> 2130 -> 213 -> 0 => 0 is invalid as we dont have encoding for it
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    dp[i] = (i >= 2 ?  dp[i - 2] : 1);
                } 
                else {
                    dp[i] = 0;
                }
            }

            else {
                /*
                    eg 2127  212 -7 it is valid aswe have encoding for 7
                       21- 27 27 in invalid as we have only encoding for 1-26
                       so we have have to check last 2 char are <= 26
                */
                if (Integer.parseInt(s.substring(i - 1 , i  + 1)) <= 26) {
                    dp[i] = dp[i - 1] +  (i >= 2 ? dp[i - 2] : 1);

                }
                 else {
                    dp[i] = dp[i - 1];
                }
            }
        }
        System.out.println(dp[s.length() - 1]);
    }
}
