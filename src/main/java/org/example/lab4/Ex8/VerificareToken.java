package org.example.lab4.Ex8;

import java.util.StringTokenizer;

public class VerificareToken {

    public static String verificare(String cheia) {

        //convertire in token
        StringTokenizer tokenizer = new StringTokenizer(cheia, "", true);
        StringBuilder token_final = new StringBuilder();
        int cnt = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            token_final.append(token);
            cnt++;

            if(cnt % 5 == 0){
                token_final.append("-");
            }
        }


        return token_final.toString();
    }
}
