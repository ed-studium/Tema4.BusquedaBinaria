package es.Studium;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BusquedaBinaria {
    public static void main(String[] args) throws IOException {
        adivinador();
    }
    public static void adivinador() throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Puedo adivinar el número entero que estás pensando. Dime cuál es el número más grande posible:");
        int extremoMax = Integer.parseInt(lectura.readLine());
        int extremoMin = 0;
        int semaforo = extremoMax;
        int puntoMedio = (extremoMax + extremoMin)/2;

        String respuesta;
        System.out.print("Así que es el " + extremoMax + ". ");
        for (int i = 0;i < semaforo; i++) {
            System.out.println("¿Es el " + puntoMedio + "? (Escribe Sí o No)");
            respuesta = lectura.readLine();
            if ((respuesta.equals("Sí"))||(respuesta.equals("si"))||(respuesta.equals("SI"))||(respuesta.equals("SÍ"))) {
                i = semaforo;
            } else {
                System.out.println("¿Es mayor que " + puntoMedio + "? (Escribe Sí o No)");
                respuesta = lectura.readLine();

                if ((respuesta.equals("Sí"))||(respuesta.equals("si"))||(respuesta.equals("SI"))||(respuesta.equals("SÍ"))){
                    extremoMin = puntoMedio;
                    puntoMedio = (extremoMax + extremoMin)/2;
                } else {  
                    extremoMax = puntoMedio;
                    puntoMedio = (extremoMax + extremoMin)/2;
                }
            }
        }
        System.out.println("He acertado.");  
    }
}