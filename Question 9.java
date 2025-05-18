import java.io.*;
import java.util.*;

public class Endoffile{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        StringBuilder strBuilder = new StringBuilder();
        while(sc.hasNext()){
            count ++;
            strBuilder.append(count + " " + sc.nextLine() + "\n");
        }
        System.out.println(strBuilder);
    }
}
