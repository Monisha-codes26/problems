import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
    public static String timeConversion(String s) {
        String amPm = s.substring(s.length() - 2);
        String hourStr = s.substring(0, 2);
        String minuteAndSecondStr = s.substring(2, 8); 
        int hour = Integer.parseInt(hourStr);
        if (amPm.equals("AM")) {
            if (hour == 12) {
                hourStr = "00";
            }
        } else { 
            if (hour != 12) {
                hour = hour + 12;
                hourStr = String.valueOf(hour);
            }
        }
        return hourStr + minuteAndSecondStr;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();
        String result = Result.timeConversion(s);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
