import java.util.Scanner;
/**
 * *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar
 * su procesamiento para presentar los elementos:
 * De la diagonal principal. De la diagonal segundaria. Ubicados bajo la
 * diagonal principal. Ubicados sobre la diagonal principal. Ubicados bajo la
 * diagonal secundaria. Ubicados sobre la diagonal secundaria.
 * @author julia
 */
public class Ejecicio1_Diagonales_de_matriz {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioMatriz = 0;
        System.out.print("Deme el tamano dela matriz: ");
        tamanioMatriz = tcl.nextInt();
        int Matriz[][] = new int[tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                Matriz[i][j] = (int) (Math.random() * 10);
            }

        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print(Matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("DIAGONAL PRINCIPAL PBVIA:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                if (i == j) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }

        }
        System.out.println("DIAGONAL PRINCIPAL EFICIENTE:");
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println(Matriz[i][i] + "\t");
        }
        System.out.println("DIAGONAL SECUNDARIA OBVIA:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                if ((i + j) == Matriz.length - 1) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("DIAGONAL SECUNDARIA EFICIENTE: ");
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println(Matriz[i][Matriz.length - 1 - i] + "\t");
        }
        System.out.println("ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL OBVIA: ");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (i > j) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL EFICIENTE:");
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(Matriz[i][j] + "\t");
            }
        }
        System.out.println("ELEMENTOS POR ENCIMA DE LA DIAGONAL PRINCIPAL OBVIA:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (j > i) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("ELEMENTOS POR ENCIMA DE LA DIAGONAL PRINCIPAL EFICIENTE:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (j > i) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL SECUNDARIA:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (i + j > Matriz.length - 1) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL SECUNDARIA EFICIENTE:");
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = Matriz.length - i; j < Matriz.length; j++) {
                System.out.println(Matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("SOBRE LA DIAGONAL SECUNDARIA:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                if (i + j < Matriz.length - 1) {
                    System.out.println(Matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");

        System.out.println("SOBRE LA DIAGONAL SECUNDARIA EFICIENTE:");
        for (int i = 0; i < Matriz.length - 1; i++) {
            for (int j = 0; j < Matriz.length - 1 - i; j++) {
                System.out.println(Matriz[i][j] + "\t");
            }
        }
        System.out.println("");
    }
}
/***
 * run:
Deme el tamano dela matriz: 3
8	5	9	
9	3	3	
5	2	0	
DIAGONAL PRINCIPAL PBVIA:
8	
3	
0	
DIAGONAL PRINCIPAL EFICIENTE:
8	
3	
0	
DIAGONAL SECUNDARIA OBVIA:
9	
3	
5	
DIAGONAL SECUNDARIA EFICIENTE: 
9	
3	
5	
ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL OBVIA: 
9	
5	
2	
ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL EFICIENTE:
9	
5	
2	
ELEMENTOS POR ENCIMA DE LA DIAGONAL PRINCIPAL OBVIA:
5	
9	
3	
ELEMENTOS POR ENCIMA DE LA DIAGONAL PRINCIPAL EFICIENTE:
5	
9	
3	
BAJO LA DIAGONAL SECUNDARIA:
3	
2	
0	
BAJO LA DIAGONAL SECUNDARIA EFICIENTE:
3	
2	
0	
SOBRE LA DIAGONAL SECUNDARIA:
8	
5	
9	
SOBRE LA DIAGONAL SECUNDARIA EFICIENTE:
8	
5	
9	
BUILD SUCCESSFUL (total time: 2 seconds)
 */