package Bronze4.Day3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result;

        if(a==b && b==c){
            result = 10000+a*1000;
        } else if(a==b || b==c || c==a){
            if(a==b){
                result = 1000+a*100;
            } else {
                result = 1000+c*100;
            }
        } else {
            int maxNum = Math.max(a, Math.max(b, c));
            result = maxNum*100;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
