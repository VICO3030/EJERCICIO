import org.junit.jupiter.api.*;

public class Ejemplo01Test {
    @Test
    public void ejercicio01_test(){
        Ejemplo01 ej01 = new Ejemplo01();
        int[] entrada0 = {1};
        Assertions.assertEquals(3, ej01.ejercicio01(1, 12, entrada0));
        int[] entrada1 = {941, 797, 120, 45, 7, 120};
        Assertions.assertEquals(10, ej01.ejercicio01(2, 999, entrada1));
        int[] entrada2 = {10, 11, 12, 13, 14, 16, 82, 83, 84, 85, 720, 730, 740, 750, 760, 770};
        Assertions.assertEquals(147, ej01.ejercicio01(3, 997, entrada2));
    }
}
