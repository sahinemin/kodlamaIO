import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int value1=20;
        System.out.println("Function returns: "+changeValue(value1));
        System.out.println("Original value: "+value1);
    }
    public static int changeValue(int value) {
        value+=5;
        return value;
    }

}