import java.util.Scanner;
/***
 *El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, 
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN 
 * en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones 
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:
 *Registre los nombres de cada estudiante de dicho paralelo.
 *Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 *Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 *Obtenga el promedio del curso, del paralelo C.
 *Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 *Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 *Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 *Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 */
public class Ejercicio3_PromEstu {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int totalEstudiantes = 28;
        double sumaTotal = 0, promedioCurso;
        String[] nombres = new String[totalEstudiantes];
        double[] acd = new double[totalEstudiantes]; // ACD (35%)
        double[] ape = new double[totalEstudiantes]; // APE (35%)
        double[] aa = new double[totalEstudiantes];  // AA (30%)
        double[] promedios = new double[totalEstudiantes];
        System.out.println("Ingrese los nombres de los " + totalEstudiantes + " estudiantes:");
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }
        for (int i = 0; i < totalEstudiantes; i++) {
            acd[i] = Math.random() * 10;
            ape[i] = Math.random() * 10;
            aa[i] = Math.random() * 10;
            promedios[i] = acd[i] * 0.35 + ape[i] * 0.35 + aa[i] * 0.30;
            sumaTotal += promedios[i];
        }
        promedioCurso = sumaTotal / totalEstudiantes;
        System.out.println("\nPromedio del curso: " + promedioCurso);
        System.out.println("\nEstudiantes por encima del promedio del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes por debajo del promedio del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        int indiceMayor = 0, indiceMenor = 0;
        for (int i = 1; i < totalEstudiantes; i++) {
            if (promedios[i] > promedios[indiceMayor]) {
                indiceMayor = i;
            }
            if (promedios[i] < promedios[indiceMenor]) {
                indiceMenor = i;
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(nombres[indiceMayor] + " - Promedio: " + promedios[indiceMayor]);

        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(nombres[indiceMenor] + " - Promedio: " + promedios[indiceMenor]);
    }
}
/***
 * run:
Ingrese los nombres de los 28 estudiantes:
Estudiante 1: juan
Estudiante 2: camilo
Estudiante 3: sofia
Estudiante 4: daniela
Estudiante 5: jair
Estudiante 6: wilson
Estudiante 7: mateo
Estudiante 8: josue
Estudiante 9: domenica
Estudiante 10: maria
Estudiante 11: paula
Estudiante 12: alvaro
Estudiante 13: moli
Estudiante 14: galindo
Estudiante 15: daniel
Estudiante 16: fernando
Estudiante 17: rodrigo
Estudiante 18: pedro
Estudiante 19: marta
Estudiante 20: ariel
Estudiante 21: joan
Estudiante 22: alice
Estudiante 23: sara
Estudiante 24: valeska
Estudiante 25: alejandra
Estudiante 26: eduardo
Estudiante 27: rosa
Estudiante 28: victoria

Promedio del curso: 4.794167622012695

Estudiantes por encima del promedio del curso:
camilo - Promedio: 4.9320444451061745
sofia - Promedio: 7.609052163108775
jair - Promedio: 5.944555927766986
maria - Promedio: 5.613770188197557
paula - Promedio: 5.610040885244437
moli - Promedio: 7.470712909113184
rodrigo - Promedio: 5.1536681737425365
ariel - Promedio: 6.912677987777838
joan - Promedio: 6.615670062211101
alice - Promedio: 5.944406984040121
sara - Promedio: 5.527545646951797
valeska - Promedio: 6.225670603817336
eduardo - Promedio: 5.949461986202648
rosa - Promedio: 5.245111934406358
victoria - Promedio: 6.86340498944322

Estudiantes por debajo del promedio del curso:
juan - Promedio: 4.725373213921465
daniela - Promedio: 2.3589243626049976
wilson - Promedio: 2.762094129099958
mateo - Promedio: 4.125126230316759
josue - Promedio: 3.9244951418583645
domenica - Promedio: 3.796974985641353
alvaro - Promedio: 2.499618779365746
galindo - Promedio: 4.485553476797791
daniel - Promedio: 2.771617325388984
fernando - Promedio: 2.4311284838372584
pedro - Promedio: 4.164377400071475
marta - Promedio: 2.999279349933905
alejandra - Promedio: 1.574335650387383

Estudiante con el mayor promedio:
sofia - Promedio: 7.609052163108775

Estudiante con el menor promedio:
alejandra - Promedio: 1.574335650387383
BUILD SUCCESSFUL (total time: 2 minutes 10 seconds)
 */