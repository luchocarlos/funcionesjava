import java.awt.desktop.SystemSleepListener;

public class Main {
    public static void main(String[] args) {
        sumas(8,6,7);

    }

    public static int sumas(int param1, int param2, int param3){
        int suma;
        suma = param1 + param2 + param3;
        System.out.println(suma);
        return suma;
    }
}