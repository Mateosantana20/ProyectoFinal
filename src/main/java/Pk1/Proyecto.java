package Pk1;

import java.util.*;

public class Proyecto {

    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Gasto> gastos = new ArrayList<>();
    private static List<Presupuesto> presupuestos = new ArrayList<>();
    private static List<Ingreso> ingresos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("--------------------- INICIO ---------------------");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. iniciar sesion");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--------------------- AGREGAR USUARIO ---------------------");
                    System.out.println("Ingresa el ID del usuario");
                    int id = sc.nextInt();
                    System.out.println("Ingresa el nombre del usuario");
                    String name = sc.next();
                    System.out.println("Ingresa el usuario");
                    String user = sc.next();
                    System.out.println("Ingresa la contraseña");
                    String password = sc.next();
                    agregarUsuario(id, name, user, password);
                    break;
                case 2:
                    mostrarUsuarios();
                    break;
                case 3:
                    System.out.println("--------------------- ELIMINAR USUARIO ---------------------");
                    System.out.println("Ingresa el ID del usuario");
                    int id2 = sc.nextInt();
                    eliminarUsuario(id2);
                    break;
                case 4:
                    System.out.println("--------------------- INICIAR SESIÓN ---------------------");
                    System.out.println("Ingresar usuario");
                    String user2 = sc.next();
                    System.out.println("Ingresar contraseña");
                    String password2 = sc.next();
                    iniciarSesion(user2, password2);
                    if (iniciarSesion(user2, password2) == true) {
                        System.out.println("------------------------------------- MENU ---------------------");
                        int opcion2 = 0;
                        do {
                            System.out.println("1. Agregar gasto");
                            System.out.println("2. Mostrar gastos");
                            System.out.println("3. Eliminar gasto");
                            System.out.println("4. Agregar presupuesto");
                            System.out.println("5. Mostrar presupuestos");
                            System.out.println("6. Eliminar presupuesto");
                            System.out.println("7. Agregar ingreso");
                            System.out.println("8. Mostrar ingresos");
                            System.out.println("9. Eliminar ingreso");
                            System.out.println("10. Resumen");
                            System.out.println("11. Salir");
                            opcion2 = sc.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("--------------------- AGREGAR GASTO ---------------------");
                                    System.out.println("Ingresa el tipo del gasto");
                                    String tipo = sc.next();
                                    System.out.println("Ingresa el nombre del gasto");
                                    String nombre = sc.next();
                                    System.out.println("Ingresa el monto del gasto");
                                    double monto = sc.nextDouble();
                                    agregarGastos(tipo, nombre, monto);
                                    break;
                                case 2:
                                    mostrarGastos();
                                    break;
                                case 3:
                                    System.out.println("--------------------- ELIMINAR GASTO ---------------------");
                                    System.out.println("Ingresa el Nombre del gasto");
                                    String nombre3 = sc.next();
                                    eliminarGastos(nombre3);
                                    break;
                                case 4:
                                    System.out
                                            .println("--------------------- AGREGAR PRESUPUESTO ---------------------");
                                    System.out.println("Ingresa el tipo del presupuesto");
                                    String tipo2 = sc.next();
                                    System.out.println("Ingresa el nombre del presupuesto");
                                    String nombre2 = sc.next();
                                    System.out.println("Ingresa el monto del presupuesto");
                                    double monto2 = sc.nextDouble();
                                    agregarPresupuestos(tipo2, nombre2, monto2);
                                    break;
                                case 5:
                                    mostrarPresupuestos();
                                    break;
                                case 6:
                                    System.out.println(
                                            "--------------------- ELIMINAR PRESUPUESTO ---------------------");
                                    System.out.println("Ingresa el Nombre del presupuesto");
                                    String nombre4 = sc.next();
                                    eliminarPresupuestos(nombre4);
                                    break;
                                case 7:
                                    System.out.println("--------------------- AGREGAR INGRESO ---------------------");
                                    System.out.println("Ingresa el nombre del ingreso");
                                    String nombre5 = sc.next();
                                    System.out.println("Ingresa el monto del ingreso");
                                    double monto5 = sc.nextDouble();
                                    agregarIngresos(nombre5, monto5);
                                    break;
                                case 8:
                                    mostrarIngresos();
                                    break;
                                case 9:
                                    System.out.println("--------------------- ELIMINAR INGRESO ---------------------");
                                    System.out.println("Ingresa el Nombre del ingreso");
                                    String nombre6 = sc.next();
                                    eliminarIngresos(nombre6);
                                    break;
                                case 10:
                                    mostrarResumen();
                                    break;
                                case 11:
                                    System.out.println("Saliendo...");
                                    break;
                                default:
                                    System.out.println("Opción inválida");
                            }
                        } while (opcion2 != 11);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

    }

    public static void agregarUsuario(int id, String name, String user, String password) {
        usuarios.add(new Usuario(id, name, user, password));
        System.out.println("Usuario agregado exitosamente");
    }

    public static List<Usuario> getUsuarios() {
        return usuarios; // Devuelve la lista de usuarios
    }

    public static void mostrarUsuarios() {
        System.out.println("--------------------- USUARIOS ---------------------");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).toString());
        }
    }

    ;

    public static void eliminarUsuario(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
                System.out.println("Usuario eliminado exitosamente");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }

    ;

    public static boolean iniciarSesion(String user, String password) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUser().equals(user) && usuarios.get(i).getPassword().equals(password)) {
                System.out.println("Inicio de sesión exitoso");
                return true;
            }
        }
        System.out.println("Inicio de sesión fallido");
        return false;
    }

    ;

    public static void mostrarResumen() {
        System.out.println("--------------------- RESUMEN ---------------------");
        System.out.println("Ingresos:");
        for (int i = 0; i < ingresos.size(); i++) {
            System.out.println(ingresos.get(i).toString());
        }
        System.out.println("Gastos:");
        for (int i = 0; i < gastos.size(); i++) {
            System.out.println(gastos.get(i).toString());
        }
        System.out.println("Presupuestos:");
        for (int i = 0; i < presupuestos.size(); i++) {
            System.out.println(presupuestos.get(i).toString());
        }
    }

    ;

    public static void agregarIngresos(String nombre, double monto) {
        ingresos.add(new Ingreso(nombre, monto));
        System.out.println("Ingreso agregado exitosamente");
    }

    ;
    
    public static List<Ingreso> getIngresos() {
        return ingresos;
    }

    public static void mostrarIngresos() {
        System.out.println("\n--------------------- INGRESOS ---------------------");
        for (int i = 0; i < ingresos.size(); i++) {
            System.out.println(ingresos.get(i).toString());
        }
    }

    ;

    public static void eliminarIngresos(String nombre) {
        for (int i = 0; i < ingresos.size(); i++) {
            if (ingresos.get(i).getNombre().equals(nombre)) {
                ingresos.remove(i);
                System.out.println("Ingreso eliminado exitosamente");
                return;
            }
        }
        System.out.println("Ingreso no encontrado");
    }

    public static void agregarGastos(String tipo, String nombre, double monto) {
        gastos.add(new Gasto(tipo, nombre, monto));
        System.out.println("Gasto agregado exitosamente");
    }

    ;
    
    public static List<Gasto> getGastos() {
        return gastos;
    }

    public static void mostrarGastos() {
        System.out.println("--------------------- GASTOS ---------------------");
        for (int i = 0; i < gastos.size(); i++) {
            System.out.println(gastos.get(i).toString());
        }
    }

    ;

    public static void eliminarGastos(String nombre) {
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getNombre().equals(nombre)) {
                gastos.remove(i);
                System.out.println("Gasto eliminado exitosamente");
                return;
            }
        }
        System.out.println("Gasto no encontrado");
    }

    public static void agregarPresupuestos(String tipo, String nombre, double monto) {
        presupuestos.add(new Presupuesto(tipo, nombre, monto));
        System.out.println("Presupuesto agregado exitosamente");
    }

    ;
    
    public static List<Presupuesto> getPresupuestos() {
        return presupuestos;
    }

    public static void mostrarPresupuestos() {
        System.out.println("--------------------- PRESUPUESTOS ---------------------");
        for (int i = 0; i < presupuestos.size(); i++) {
            System.out.println(presupuestos.get(i).toString());
        }
    }

    ;

    public static void eliminarPresupuestos(String nombre) {
        for (int i = 0; i < presupuestos.size(); i++) {
            if (presupuestos.get(i).getNombre().equals(nombre)) {
                presupuestos.remove(i);
                System.out.println("Presupuesto eliminado exitosamente");
                return;
            }
        }
        System.out.println("Presupuesto no encontrado");
    }
}
