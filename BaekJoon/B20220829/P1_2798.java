package BaekJoon.B20220829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] cards = new int[count];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int diff = Integer.MAX_VALUE;
        int answer = 0;

        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    int add = cards[i] + cards[j] + cards[k];
                    int con = target - add;

                    if(con == 0) {
                        System.out.println(add);
                        return;
                    }else if(con > 0 && con < diff) {
                        answer = add;
                        diff = con;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
