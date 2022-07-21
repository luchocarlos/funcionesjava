import java.awt.desktop.SystemSleepListener;

public class Main {
    public static void main(String[] args) {
        sumas(8,6,7);
        coche micoche = new coche();
        micoche.sumarpuerta();
        System.out.println("las puertas del coche son " + micoche.puertas);


    }

    public static int sumas(int param1, int param2, int param3){
        int suma;
        suma = param1 + param2 + param3;
        System.out.println("el resultado de suma es " + suma);
        return suma;
    }


}

class coche {
    public int puertas= 4;

    public void sumarpuerta(){
        this.puertas++;
    }
}