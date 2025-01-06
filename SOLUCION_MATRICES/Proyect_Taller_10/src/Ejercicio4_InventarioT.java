import java.util.Scanner;
/***
 *Crea un programa que gestione el inventario de una tienda. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda,
 *con información como nombre, precio y cantidad. El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 */
public class Ejercicio4_InventarioT {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int maxProductos = 100;
        String[] nombres = new String[maxProductos];
        double[] precios = new double[maxProductos];
        int[] cantidades = new int[maxProductos];
        int numProductos = 0;
        while (true) {
            System.out.println("\n--- Gestión de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = tcl.nextInt();
            tcl.nextLine();
            if (opcion == 1) {
                if (numProductos < maxProductos) {
                    System.out.print("Ingrese el nombre del producto: ");
                    nombres[numProductos] = tcl.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    precios[numProductos] = tcl.nextDouble();
                    System.out.print("Ingrese la cantidad del producto: ");
                    cantidades[numProductos] = tcl.nextInt();
                    numProductos++;
                    System.out.println("Producto agregado.");
                } else {
                    System.out.println("El inventario está lleno.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del producto a actualizar: ");
                String nombre = tcl.nextLine();
                for (int i = 0; i < numProductos; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        System.out.print("Ingrese la nueva cantidad: ");
                        cantidades[i] = tcl.nextInt();
                        System.out.println("Cantidad actualizada.");
                        break; 
                    }
                    if (i == numProductos - 1) {
                        System.out.println("Producto no encontrado.");
                    }
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String nombre = tcl.nextLine();
                for (int i = 0; i < numProductos; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        System.out.println("Producto: " + nombres[i]);
                        System.out.println("Precio: " + precios[i]);
                        System.out.println("Cantidad: " + cantidades[i]);
                        break; 
                    }
                    if (i == numProductos - 1) {
                        System.out.println("Producto no encontrado.");
                    }
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String nombre = tcl.nextLine();
                for (int i = 0; i < numProductos; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        for (int j = i; j < numProductos - 1; j++) {
                            nombres[j] = nombres[j + 1];
                            precios[j] = precios[j + 1];
                            cantidades[j] = cantidades[j + 1];
                        }
                        numProductos--;
                        System.out.println("Producto eliminado.");
                        break; 
                    }
                    if (i == numProductos - 1) {
                        System.out.println("Producto no encontrado.");
                    }
                }
            } else if (opcion == 5) {
                System.out.println("\n--- Inventario ---");
                if (numProductos == 0) {
                    System.out.println("El inventario está vacío.");
                } else {
                    for (int i = 0; i < numProductos; i++) {
                        System.out.println((i + 1) + ". Nombre: " + nombres[i] + ", Precio: " + precios[i] + ", Cantidad: " + cantidades[i]);
                    }
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa");
                break;
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
/***
 * 
--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: sabanas
Ingrese el precio del producto: 10
Ingrese la cantidad del producto: 50
Producto agregado.

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: almohadas
Ingrese el precio del producto: 2
Ingrese la cantidad del producto: 100
Producto agregado.

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: camas
Ingrese el precio del producto: 200
Ingrese la cantidad del producto: 30
Producto agregado.

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 2
Ingrese el nombre del producto a actualizar: sabanas
Ingrese la nueva cantidad: 30
Cantidad actualizada.

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 3
Ingrese el nombre del producto a buscar: camas
Producto: camas
Precio: 200.0
Cantidad: 30

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 4
Ingrese el nombre del producto a eliminar: almohadas
Producto eliminado.

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 5

--- Inventario ---
1. Nombre: sabanas, Precio: 10.0, Cantidad: 30
2. Nombre: camas, Precio: 200.0, Cantidad: 30

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 6
Saliendo del programa
BUILD SUCCESSFUL (total time: 1 minute 59 seconds)

 */