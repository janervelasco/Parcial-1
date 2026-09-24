import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Main {
    private static empresa miEmpresa;
    public static void main(String[] args) {

         miEmpresa = new empresa("DevPlus S.A.S", "900123456", "Calle 10", "1234567", "www.devplus.com");

        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Este es el menu de la empresa DevPlus" +
                    "\n Seleccione una opcion: " +
                    "\n 1. Registrar cliente." +
                    "\n 2. Registar desarrollador." +
                    "\n 3. Registrar proyecto." +
                    "\n 4. Registrar servicio adicional." +
                    "\n 5. Calcular ingresos totales." +
                    "\n 6. asignar proyecto a cliente" +
                    "\n 7. lista de proyectos" +
                    "\n 8. Actualizar información" +
                    "\n 9. lista de proyectos" +
                    "\n 10. lista de proyectos" +
                    "\n 0. Salir del sistema"));


            switch (option) {


                case 1:
                    registrarCliente();
                    break;


                case 2:
                    registrarDesarrolador();
                     break;

                case 3:
                    registrarProyecto();
                    break;

                case 4:
                    registrarServicioAdicional();
                    break;
                case 5:
                    calcularIngresosTotales();
                    break;
                case 6:
                    asignarProyectoCliente();
                    break;
                case 7:
                    listarProyectosMain();
                    break;
                case 8:
                    int option1 =0;
                    do{
                        option1  = Integer.parseInt(JOptionPane.showInputDialog("para actualizar información"+
                                "\nseleccione una opción:"+
                                "\n 1. Actualizar información del cliente." +
                                "\n 2. Actualizar información del desarrollador." +
                                "\n 3. Actualizar información del proyecto." +
                                "\n 4. Actualizar información del servicio adicional." +
                                "\n 0. Salir del sistema"));
                        switch (option1){
                            case 1:
                                actualizarInformacionCliente();
                                break;
                            case 2:
                                actualizarInformacionDesarrollador();
                                break;
                            case 3:
                                actualizarInformacionProyecto();
                                break;
                            case 4:
                                actualizarInformacionServicioAdicional();
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null, "El programa finalizo");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opcion no es valida");
                                break;

                        }
                    }while (option != 0);
                    break;










                case 0:
                    JOptionPane.showMessageDialog(null, "El programa finalizo");
                    break;


                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    break;
            }


        } while (option != 0);
    }

    //-------------------------------------------------------------------------------------------

    //Registrar la informacion del cliente
    private static void registrarCliente() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento: ");
        String nombreCompleto = JOptionPane.showInputDialog("ingrese el nombre completo: ");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono: ");
        String email = JOptionPane.showInputDialog("ingrese su email del cliente");
        String pais = JOptionPane.showInputDialog("ingrese pais de procedencia del cliente");

        boolean resultado = miEmpresa.agregarCliente(documento, nombreCompleto, telefono, email,
                pais);
        if (resultado) {
            JOptionPane.showMessageDialog(null,"registro exitoso");
        }
        else {
            JOptionPane.showMessageDialog(null, "no se hizo el registro");
       }
    }

    //Actualizar información del cliente
    private static void actualizarInformacionCliente() {

        String documentoClienteActualizar = JOptionPane.showInputDialog("Ingrese el documento del cliente que quiere actualizar: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo del cliente: ");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono: ");
        String email = JOptionPane.showInputDialog("Ingrese el email: ");
        String pais = JOptionPane.showInputDialog("Ingrese el pais de procedencia: ");

        boolean resultadoActualizacion = miEmpresa.actualizarCliente(documentoClienteActualizar,nombre,telefono,email,pais);

        if(resultadoActualizacion){
            JOptionPane.showMessageDialog(null, "Se modifico el cliente.");
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el cliente.");
        }
    }

    //-------------------------------------------------------------------------------------------

    //REGISTRAR LA INFORMACIÓN DEL DESARROLLADOR
    private static void registrarDesarrolador(){
        String codigo = JOptionPane.showInputDialog("ingrese el codigo de desarrolador");
        String equipoTrabajo = JOptionPane.showInputDialog("ingrese su equipo de trabajo");
        String nivel = JOptionPane.showInputDialog("ingrese el nivel del desarrolador");

        int maxProyectosSimultaneos = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad maxima de proyectos"));
        double tarifaPorDia = parseDouble(JOptionPane.showInputDialog("ingrese la tarifa por dia"));

        String estado = JOptionPane.showInputDialog("ingrese su estado");

        Boolean resultado = miEmpresa.agregarDesarrolador(codigo, equipoTrabajo, nivel, maxProyectosSimultaneos,
                tarifaPorDia, estado);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "no se hizo el registro");
        }
    }

    //Actualizar información del desarrollador
    private static void actualizarInformacionDesarrollador() {

        String codigoDesarrolladorActualizar = JOptionPane.showInputDialog("Ingrese el codigo del desarrollador que quiere actualizar: ");
        String equipoTrabajo = JOptionPane.showInputDialog("Ingrese el equipo de trabajo: ");
        String nivel = JOptionPane.showInputDialog("Ingrese el nivel: ");
        int maxProyectosSimultaneos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el maximo de proyectos simultaneos: "));
        double tarifaPorDia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pais de procedencia: "));
        String estado = JOptionPane.showInputDialog("ingrese el estado: ");

        boolean resultadoActualizacion = miEmpresa.actualizarDesarrollador(codigoDesarrolladorActualizar,equipoTrabajo,nivel,maxProyectosSimultaneos,tarifaPorDia,estado);

        if(resultadoActualizacion){
            JOptionPane.showMessageDialog(null, "Se modifico el desarrollador.");
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el desarrollador.");
        }
    }



    //-------------------------------------------------------------------------------------------

    //REGISTRAR LA INFORMACIÓN DEL PROYECTO
    private static void registrarProyecto(){
        String codigo = JOptionPane.showInputDialog("ingrese el codigo de proyecto");
        String fechaSolicitud = JOptionPane.showInputDialog("ingrese la fecha de solicitud");
        String fechaInicio = JOptionPane.showInputDialog("ingrese la fecha de inicio");
        String fechaEntrega = JOptionPane.showInputDialog("ingrese la fecha de entrega");
        String estado = JOptionPane.showInputDialog("ingrese el estado");
        String metodoPago= JOptionPane.showInputDialog("ingrrese el metodo de pago");
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor total"));

        Boolean resultado = miEmpresa.agregarProyecto(codigo,fechaSolicitud,fechaInicio,fechaEntrega,estado,
                metodoPago,valorTotal);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "no se hizo el registro");
        }
    }

    //Actualizar información del proyecto
    private static void actualizarInformacionProyecto() {

        String codigoActualizar = JOptionPane.showInputDialog("ingrese el codigo de proyecto que quiere actualizar: ");
        String fechaSolicitud = JOptionPane.showInputDialog("ingrese la fecha de solicitud");
        String fechaInicio = JOptionPane.showInputDialog("ingrese la fecha de inicio");
        String fechaEntrega = JOptionPane.showInputDialog("ingrese la fecha de entrega");
        String estado = JOptionPane.showInputDialog("ingrese el estado");
        String metodoPago= JOptionPane.showInputDialog("ingrrese el metodo de pago");
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor total"));

        boolean resultadoActualizacion = miEmpresa.actualizarProyecto(codigoActualizar,fechaSolicitud,fechaInicio,fechaEntrega,estado,
                metodoPago,valorTotal);

        if(resultadoActualizacion){
            JOptionPane.showMessageDialog(null, "Se modifico el proyecto.");
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el proyecto.");
        }
    }

    //-------------------------------------------------------------------------------------------------------------------------

    //REGISTRAR SERVICIO ADICIONAL
    private static void registrarServicioAdicional(){
        String codigo = JOptionPane.showInputDialog("ingrese el codigo del servicioAdicional");
        String nombre = JOptionPane.showInputDialog("ingrese el nombre");
        String descripcion = JOptionPane.showInputDialog("descripción");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio"));
        boolean disponible = Boolean.parseBoolean(JOptionPane.showInputDialog("ingrese la disponibilidad"));

        Boolean resultado = miEmpresa.agregarServicioAdicional(codigo,nombre,descripcion,precio,disponible);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "no se hizo el registro");
        }
    }

    //Actualizar información del servicio adicional
    private static void actualizarInformacionServicioAdicional() {

        String codigoActualizar = JOptionPane.showInputDialog("ingrese el codigo del servicioAdicional que quiere actualizar: ");
        String nombre = JOptionPane.showInputDialog("ingrese el nombre: ");
        String descripcion = JOptionPane.showInputDialog("descripción: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio: "));
        boolean disponible = Boolean.parseBoolean(JOptionPane.showInputDialog("ingrese la disponibilidad: "));

        boolean resultadoActualizacion = miEmpresa.actualizarServicioAdicional(codigoActualizar,nombre,descripcion,precio,disponible);

        if(resultadoActualizacion){
            JOptionPane.showMessageDialog(null, "Se modifico el servicio adicional.");
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el servicio adicional.");
        }
    }
    //--------------------------------------------------------------------------------------------------------------------

    private static void calcularIngresosTotales() {
        double total = miEmpresa.calcularIngresosTotales();
        JOptionPane.showMessageDialog(null, "Los ingresos totales de la empresa son: " + total);
    }
    private static void asignarProyectoCliente() {
        String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del cliente:");
        if (documento == null) return;

        String codigoProyecto = JOptionPane.showInputDialog(null, "Ingrese el código del proyecto a asignar:");
        if (codigoProyecto == null) return;

        boolean resultado = miEmpresa.asignarProyectoACliente(documento, codigoProyecto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Proyecto asignado al cliente exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el cliente o el proyecto, o ya está asignado.");
        }
    }
    private static void listarProyectosMain() {
        String resultado = miEmpresa.listarProyectos();
        JOptionPane.showMessageDialog(null, resultado);
    }
}



