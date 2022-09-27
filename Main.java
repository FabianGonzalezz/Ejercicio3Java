public class Main {
    public static void main(String[] args) {
        suma(10, 4, 12);
        Coche miCoche = new Coche();
        miCoche.incremento();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
class Coche{
    public int puertas = 2;

    public void incremento(){
        this.puertas++;
    }

}


