package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] point1 = br.readLine().split(" ");
        String[] point2 = br.readLine().split(" ");
        String[] point3 = br.readLine().split(" ");

        String x = "";
        // x좌표 비교
        if(point1[0].equals(point2[0]))
            x = point3[0];

        if(point3[0].equals(point2[0]))
            x = point1[0];

        if(point1[0].equals(point3[0]))
            x = point2[0];


        String y = "";
        // y좌표 비교
        if(point1[1].equals(point2[1]))
            y = point3[1];

        if(point3[1].equals(point2[1]))
            y = point1[1];

        if(point1[1].equals(point3[1]))
            y = point2[1];

        System.out.println(x + " " + y);

    }
}
