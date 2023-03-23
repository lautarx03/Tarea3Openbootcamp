public class Main {
    public static void main(String[] args) {
        int resultado = sumarTresNumeros(2, 5, 7);
        System.out.println(resultado);
    }

    public static int sumarTresNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        return suma;
    }
}

class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void incrementarPuertas() {
        this.numPuertas += 1;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.incrementarPuertas();
        System.out.println(miCoche.getNumPuertas());
    }

}