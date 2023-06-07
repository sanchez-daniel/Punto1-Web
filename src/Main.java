import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite una cifra en base 8: ");
        Integer Numero = entrada.nextInt();
        String NumeroSrt = String.valueOf(Numero);
        String[] arrayBi = new String[NumeroSrt.length()];
        int cifra;
        String binario = "0";
        int cifraArray = 0;
        if (Numero == 0) {
            binario = "000";
            arrayBi[0] = binario;


        } else {
            while (Numero > 0) {
                cifra = Numero % 10;
                Numero /= 10;
                if (cifra >= 0 && cifra <= 7) {
                    switch (cifra) {
                        case 0:
                            binario = "000";
                            break;
                        case 1:
                            binario = "001";
                            break;
                        case 2:
                            binario = "010";
                            break;
                        case 3:
                            binario = "011";
                            break;
                        case 4:
                            binario = "100";
                            break;
                        case 5:
                            binario = "101";
                            break;
                        case 6:
                            binario = "110";
                            break;
                        case 7:
                            binario = "111";
                            break;
                    }
                    arrayBi[cifraArray] = binario;
                    cifraArray++;

                } else {
                    Numero = 0;
                    binario = "0";
                }


            }

        }
        if (binario != "0") {
            for (int i = arrayBi.length - 1; i >= 0; i--) {
                System.out.print(arrayBi[i] + " ");

            }
        } else {
            System.out.println("El numero debe ser positivo 0 - 7");
        }
    }
}