import java.io.*;
import java.util.Scanner;

public class Ejemplo01 {

    public static void main(String[] args) throws IOException {
        // Instanciaremos un objeto del tipo File
        // cuyo constructor recive el nombre del archivo
        File entrada = new File("entrada.in");

        // instanciamos el Scanner,
        // en este caso no desde la entrada estandar System.in ...
        // Scanner lector = new Scanner(System.in);
        // ... si no desde el archivo que instanciamos "entrada"
        Scanner lector = new Scanner(entrada);
        // instanciamos
        BufferedWriter escritor = new BufferedWriter(new FileWriter("salida.out"));

        int menor, mayor;
        int num_peces;
        int aceptados = 0;

        // lectura desde el archivo
        // primer numero, el menor tamanio
        menor = lector.nextInt();
        // segundo número, el mayor
        mayor = lector.nextInt();
        // tercer numero, cantidad de peces
        num_peces = lector.nextInt();

        // instanciamos un vector de num_peces posiciones
        int[] peces = new int[num_peces];
        // seguimos leyendo del archivo, en esta linea
        // leemos los "num_peces" numero que estan separados por espacio.

        for (int i=0; i < num_peces; i++){
            peces[i] = lector.nextInt();
        }
        // llamamos a calcular con los parametros necesarios
        aceptados = ejercicio01(menor, mayor, peces);
        // escribimos la respuesta
        System.out.println(aceptados);
        escritor.write(aceptados+"");
        Scanner otralectura = new Scanner(System.in);
        String cad;
        for (int i = 0; i<=6; i++){
            cad = otralectura.nextLine();
            escritor.write(cad);
        }
        escritor.close();
    }

    public static int ejercicio01(int menor, int mayor,  int[] peces) {
        int result=0;
        for (int i = menor; i <= mayor; i++)
            for (int p=0; p<peces.length; p++) {
                if ((i <= (0.5 * peces[p]) && i >= (0.1 * peces[p])) || (peces[p] <= (0.5 * i) && peces[p] >= (0.1 * i)))
                    break;
                if (p == peces.length-1)
                    result++;
            }
        return result;
    }
}
