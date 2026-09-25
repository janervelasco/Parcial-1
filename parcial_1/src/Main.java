import javax.swing.*;


public class Main {
    private static empresa miEmpresa;


    public static void main(String[] args) {


        miEmpresa = new empresa("DevPlus S.A.S", "900123456", "Calle 10", "1234567", "www.devplus.com");


        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Este es el menu de la empresa DevPlus" +
                    "\n Seleccione una opcion: " +
                    "\n 1. Registrar cliente." +
                    "\n 2. Registrar desarrollador." +
                    "\n 3. Registrar proyecto." +
                    "\n 4. Registrar servicio adicional." +
                    "\n 5. Calcular ingresos totales." +
                    "\n 6. Asignar proyecto a cliente." +
                    "\n 7. Lista de proyectos." +
                    "\n 8. Actualizar información." +
                    "\n 9. Validar número perfecto." +
                    "\n 10. Eliminar información." +
                    "\n 11. Total cliente (Factura)" +
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
                    int option1 = 0;
                    do {
                        option1 = Integer.parseInt(JOptionPane.showInputDialog("para actualizar información" +
                                "\nseleccione una opción:" +
                                "\n 1. Actualizar información del cliente." +
                                "\n 2. Actualizar información del desarrollador." +
                                "\n 3. Actualizar información del proyecto." +
                                "\n 4. Actualizar información del servicio adicional." +
                                "\n 0. Salir del sistema"));
                        switch (option1) {
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
                                JOptionPane.showMessageDialog(null, "Regresando al menú principal");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opción no es válida");
                                break;
                        }
                    } while (option1 != 0);
                    break;
                case 9:
                    validarNumeroPerfectoMain();
                    break;
                case 10:
                    int option2 = 0;
                    do {
                        option2 = Integer.parseInt(JOptionPane.showInputDialog("para eliminar información" +
                                "\nseleccione una opción:" +
                                "\n 1. Eliminar información del cliente." +
                                "\n 2. Eliminar información del desarrollador." +
                                "\n 3. Eliminar información del proyecto." +
                                "\n 4. Eliminar información del servicio adicional." +
                                "\n 0. Salir del sistema"));
                        switch (option2) {
                            case 1:
                                eliminarInformacionCliente();
                                break;
                            case 2:
                                eliminarInformaciondesarrolladores();
                                break;
                            case 3:
                                eliminarInformacionProyectos();
                                break;
                            case 4:
                                eliminarInformacionServicioAdicional();
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null, "Regresando al menú principal");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opción no es válida");
                                break;
                        }
                    } while (option2 != 0);
                    break;
                case 11:
                    totalClienteMain();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "El programa finalizó");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción no es válida");
                    break;
            }


        } while (option != 0);
    }


    //-------------------------------------------------------------------------------------------


    private static void registrarCliente() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento: ");
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo: ");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono: ");
        String email = JOptionPane.showInputDialog("Ingrese su email del cliente");
        String pais = JOptionPane.showInputDialog("Ingrese país de procedencia del cliente");


        boolean resultado = miEmpresa.agregarCliente(documento, nombreCompleto, telefono, email, pais);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "No se hizo el registro");
        }
    }


    private static void actualizarInformacionCliente() {
        String documentoClienteActualizar = JOptionPane.showInputDialog("Ingrese el documento del cliente que quiere actualizar: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo del cliente: ");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono: ");
        String email = JOptionPane.showInputDialog("Ingrese el email: ");
        String pais = JOptionPane.showInputDialog("Ingrese el país de procedencia: ");


        boolean resultadoActualizacion = miEmpresa.actualizarCliente(documentoClienteActualizar, nombre, telefono, email, pais);


        if (resultadoActualizacion) {
            JOptionPane.showMessageDialog(null, "Se modificó el cliente.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el cliente.");
        }
    }


    private static void eliminarInformacionCliente() {
        String documentoclienteEliminar = JOptionPane.showInputDialog("Ingrese el documento del cliente que quiere eliminar: ");


        boolean respuestaEliminar = miEmpresa.eliminarCliente(documentoclienteEliminar);


        if (respuestaEliminar) {
            JOptionPane.showMessageDialog(null, "Se eliminó el cliente.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar el cliente.");
        }
    }


    //-------------------------------------------------------------------------------------------


    private static void registrarDesarrolador() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código de desarrollador");
        String equipoTrabajo = JOptionPane.showInputDialog("Ingrese su equipo de trabajo");
        String nivel = JOptionPane.showInputDialog("Ingrese el nivel del desarrollador");


        int maxProyectosSimultaneos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad máxima de proyectos"));
        double tarifaPorDia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por día"));


        String estado = JOptionPane.showInputDialog("Ingrese su estado");


        Boolean resultado = miEmpresa.agregarDesarrolador(codigo, equipoTrabajo, nivel, maxProyectosSimultaneos, tarifaPorDia, estado);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "No se hizo el registro");
        }
    }


    private static void actualizarInformacionDesarrollador() {
        String codigoDesarrolladorActualizar = JOptionPane.showInputDialog("Ingrese el código del desarrollador que quiere actualizar: ");
        String equipoTrabajo = JOptionPane.showInputDialog("Ingrese el equipo de trabajo: ");
        String nivel = JOptionPane.showInputDialog("Ingrese el nivel: ");
        int maxProyectosSimultaneos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el máximo de proyectos simultáneos: "));
        double tarifaPorDia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por día: "));
        String estado = JOptionPane.showInputDialog("Ingrese el estado: ");


        boolean resultadoActualizacion = miEmpresa.actualizarDesarrollador(codigoDesarrolladorActualizar, equipoTrabajo, nivel, maxProyectosSimultaneos, tarifaPorDia, estado);


        if (resultadoActualizacion) {
            JOptionPane.showMessageDialog(null, "Se modificó el desarrollador.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el desarrollador.");
        }
    }


    private static void eliminarInformaciondesarrolladores() {
        String codigoDesarrolladorEliminar = JOptionPane.showInputDialog("Ingrese el código del desarrollador que quiere eliminar: ");


        boolean respuestaEliminar = miEmpresa.eliminarDesarrollador(codigoDesarrolladorEliminar);


        if (respuestaEliminar) {
            JOptionPane.showMessageDialog(null, "Se eliminó el desarrollador.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar el desarrollador.");
        }
    }


    //-------------------------------------------------------------------------------------------


    private static void registrarProyecto() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código de proyecto");
        String fechaSolicitud = JOptionPane.showInputDialog("Ingrese la fecha de solicitud");
        String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio");
        String fechaEntrega = JOptionPane.showInputDialog("Ingrese la fecha de entrega");
        String estado = JOptionPane.showInputDialog("Ingrese el estado");
        String metodoPago = JOptionPane.showInputDialog("Ingrese el método de pago");
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor total"));


        Boolean resultado = miEmpresa.agregarProyecto(codigo, fechaSolicitud, fechaInicio, fechaEntrega, estado, metodoPago, valorTotal);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "No se hizo el registro");
        }
    }


    private static void actualizarInformacionProyecto() {
        String codigoActualizar = JOptionPane.showInputDialog("Ingrese el código de proyecto que quiere actualizar: ");
        String fechaSolicitud = JOptionPane.showInputDialog("Ingrese la fecha de solicitud");
        String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio");
        String fechaEntrega = JOptionPane.showInputDialog("Ingrese la fecha de entrega");
        String estado = JOptionPane.showInputDialog("Ingrese el estado");
        String metodoPago = JOptionPane.showInputDialog("Ingrese el método de pago");
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor total"));


        boolean resultadoActualizacion = miEmpresa.actualizarProyecto(codigoActualizar, fechaSolicitud, fechaInicio, fechaEntrega, estado, metodoPago, valorTotal);


        if (resultadoActualizacion) {
            JOptionPane.showMessageDialog(null, "Se modificó el proyecto.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el proyecto.");
        }
    }


    private static void eliminarInformacionProyectos() {
        String codigoProyectoEliminar = JOptionPane.showInputDialog("Ingrese el código del proyecto que quiere eliminar: ");


        boolean respuestaEliminar = miEmpresa.eliminarProyecto(codigoProyectoEliminar);


        if (respuestaEliminar) {
            JOptionPane.showMessageDialog(null, "Se eliminó el proyecto.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar el proyecto.");
        }
    }


    //-------------------------------------------------------------------------------------------


    private static void registrarServicioAdicional() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del servicio adicional");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String descripcion = JOptionPane.showInputDialog("Descripción");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
        boolean disponible = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese la disponibilidad"));


        Boolean resultado = miEmpresa.agregarServicioAdicional(codigo, nombre, descripcion, precio, disponible);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "No se hizo el registro");
        }
    }


    private static void actualizarInformacionServicioAdicional() {
        String codigoActualizar = JOptionPane.showInputDialog("Ingrese el código del servicio adicional que quiere actualizar: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String descripcion = JOptionPane.showInputDialog("Descripción: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
        boolean disponible = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese la disponibilidad: "));


        boolean resultadoActualizacion = miEmpresa.actualizarServicioAdicional(codigoActualizar, nombre, descripcion, precio, disponible);


        if (resultadoActualizacion) {
            JOptionPane.showMessageDialog(null, "Se modificó el servicio adicional.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el servicio adicional.");
        }
    }


    private static void eliminarInformacionServicioAdicional() {
        String codigoServicioAdiconalEliminar = JOptionPane.showInputDialog("Ingrese el código del servicio adicional que quiere eliminar: ");


        boolean respuestaEliminar = miEmpresa.eliminarServicioAdicional(codigoServicioAdiconalEliminar);


        if (respuestaEliminar) {
            JOptionPane.showMessageDialog(null, "Se eliminó el servicio adicional.");
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar el servicio adicional.");
        }
    }


    //-------------------------------------------------------------------------------------------


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


    private static void validarNumeroPerfectoMain() {
        String telefono = JOptionPane.showInputDialog(null, "Ingrese el número de teléfono del cliente a consultar:");
        if (telefono == null) { return; }


        String mensaje = miEmpresa.validarNumeroPerfecto(telefono);
        JOptionPane.showMessageDialog(null, mensaje);
    }


    private static void totalClienteMain() {
        String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del cliente para generar la factura/total:");
        if (documento == null) { return; }


        String reporteFactura = miEmpresa.generarFacturaCliente(documento);
        JOptionPane.showMessageDialog(null, reporteFactura);
    }
}
