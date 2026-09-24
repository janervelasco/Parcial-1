import javax.swing.*;

public class empresa{

    private String nombreComercial;
    private String nit;
    private String direccion;
    private String telefono;
    private String paginaWeb;

    private cliente[] listClientes;
    private proyecto[] listProyectos;
    private Desarrolador[] listDesarrolladores;
    private servicioAdicional[] listServiciioAdcional;

    public empresa(String nombreComercial, String nit, String direccion, String telefono,
                   String paginaWeb){
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;

        listClientes = new cliente[10];
        listProyectos = new proyecto[10];
        listDesarrolladores = new Desarrolador[10];
        listServiciioAdcional = new servicioAdicional[10];
    }

//--------------------------------------------------------------------------------------------------------

    // REGISTRAR CLIENTE
    public boolean agregarCliente(String documento, String nombreCompleto, String telefono,
                                  String email, String pais){
        cliente nuevoCliente = new cliente(documento, nombreCompleto, telefono, email, pais);
        if (encontrarIndexCliente(nuevoCliente.getDocumento()) == -1) {
            for (int i = 0; i < listClientes.length; i++) {
                if (listClientes[i] == null) {
                    listClientes[i] = nuevoCliente;
                    return true;
                }
            }
        }
        return false; // Ya existe o el arreglo está lleno
    }

    // ENCONTRAR INDEX CLIENTE
    public int encontrarIndexCliente(String cedulaBuscar) {
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] != null && listClientes[i].getDocumento().equals(cedulaBuscar)) {
                return i;
            }
        }
        return -1;
    }

    //ACTUALIZAR INFORMACIÓN DEL CLIENTE
    public boolean actualizarCliente(String documentoClienteActualizar,String nombre,String telefono,String email,String pais) {
        boolean respuesta = false;
        int index = encontrarIndexCliente(documentoClienteActualizar);

        if (index != -1) {
            listClientes[index].setNombreCompleto(nombre);
            listClientes[index].setTelefono(telefono);
            listClientes[index].setEmail(email);
            listClientes[index].setPaisProcedencia(pais);

            respuesta = true;
        }

        return respuesta;
    }

//--------------------------------------------------------------------------------------------------------
    //REGISTRAR DESARROllADOR
    public boolean agregarDesarrolador(String codigo, String equipoTrabajo, String nivel,
                              int maxProyectosSimultaneos, double tarifaPorDia, String estado){
        Desarrolador nuevoDesarrollador= new Desarrolador(codigo,equipoTrabajo,nivel,maxProyectosSimultaneos,tarifaPorDia,estado);
        if (encontrarIndexDesarrollador(nuevoDesarrollador.getCodigo()) == -1) {
               for (int i = 0; i < listDesarrolladores.length; i++) {
                    if (listDesarrolladores[i] == null) {
                        listDesarrolladores[i] = nuevoDesarrollador;
                     return true;
                    }
               }
        }
         return false; // Ya existe o el arreglo está lleno
    }

    //ENCONTRAR INDEX DESARROLLADOR
    public int encontrarIndexDesarrollador(String codigoBuscar) {
        for (int i = 0; i < listDesarrolladores.length; i++) {
            if (listDesarrolladores[i] != null && listDesarrolladores[i].getCodigo().equals(codigoBuscar)) {
                return i;
            }
        }
        return -1;
    }

    //ACTUALIZAR INFORMACIÓN DEL DESARROLLADOR
    public boolean actualizarDesarrollador(String codigoDesarrolladorActualizar,String equipoTrabajo,String nivel,int maxProyectos,double tarifaPorDia,String estado) {
        boolean respuesta = false;
        int index = encontrarIndexDesarrollador(codigoDesarrolladorActualizar);

        if (index != -1) {
            listDesarrolladores[index].setEquipoTrabajo(equipoTrabajo);
            listDesarrolladores[index].setNivel(nivel);
            listDesarrolladores[index].setMaxProyectosSimultaneos(maxProyectos);
            listDesarrolladores[index].setTarifaPorDia(tarifaPorDia);
            listDesarrolladores[index].setEstado(estado);

            respuesta = true;
        }

        return respuesta;
    }
//--------------------------------------------------------------------------------------------------------

    //REGISTRAR PROYECTO
    public boolean agregarProyecto(String codigo, String fechaSolicitud, String fechaInicio,String fechaEntrega,String estado,
                                   String metodoPago,double valorTotal){
        proyecto nuevoProyecto= new proyecto(codigo,fechaSolicitud,fechaInicio,fechaEntrega,estado,metodoPago,valorTotal);
        if (encontrarIndexProyecto(nuevoProyecto.getCodigo()) == -1) {
            for (int i = 0; i < listProyectos.length; i++) {
                if (listProyectos[i] == null) {
                    listProyectos[i] = nuevoProyecto;
                    return true;
                }
            }
        }
        return false; // Ya existe o el arreglo está lleno
    }

    //ENCONTRAR INDEX PROYECTO
    public int encontrarIndexProyecto(String codigoBuscar) {
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null && listProyectos[i].getCodigo().equals(codigoBuscar)) {
                return i;
            }
        }
        return -1;
    }

    //ACTUALIZAR INFORMACIÓN DEL PROYECTO
    public boolean actualizarProyecto(String codigo, String fechaSolicitud, String fechaInicio,String fechaEntrega,String estado,
                                      String metodoPago,double valorTotal) {
        boolean respuesta = false;
        int index = encontrarIndexProyecto(codigo);

        if (index != -1) {
            listProyectos[index].setFechaSolicitud(fechaSolicitud);
            listProyectos[index].setFechaInicio(fechaInicio);
            listProyectos[index].setFechaEntrega(fechaEntrega);
            listProyectos[index].setEstado(estado);
            listProyectos[index].setMetodoPago(metodoPago);
            listProyectos[index].setValorTotal(valorTotal);

            respuesta = true;
        }

        return respuesta;
    }
//--------------------------------------------------------------------------------------------------------


    //REGISTRAR SERVICIO ADICIONAL
    public boolean agregarServicioAdicional(String codigo,String nombre,String descripcion,double precio,boolean disponible){

        servicioAdicional nuevoServicioAdicional= new servicioAdicional(codigo,nombre, descripcion,precio,disponible);
        if (encontrarIndexServicioAdicional(nuevoServicioAdicional.getCodigo()) == -1) {
            for (int i = 0; i < listServiciioAdcional.length; i++) {
                if (listServiciioAdcional[i] == null) {
                    listServiciioAdcional[i] = nuevoServicioAdicional;
                    return true;
                }
            }
        }
        return false; // Ya existe o el arreglo está lleno
    }

    //ENCONTRAR INDEX SERVICIO ADICIONAL
    public int encontrarIndexServicioAdicional(String codigoBuscar) {
        for (int i = 0; i < listServiciioAdcional.length; i++) {
            if (listServiciioAdcional[i] != null && listServiciioAdcional[i].getCodigo().equals(codigoBuscar)) {
                return i;
            }
        }
        return -1;
    }

    //ACTUALIZAR INFORMACIÓN DEL PROYECTO
    public boolean actualizarServicioAdicional(String codigoActualizar,String nombre,String descripcion,double precio,boolean disponible) {
        boolean respuesta = false;
        int index = encontrarIndexServicioAdicional(codigoActualizar);

        if (index != -1) {
            listServiciioAdcional[index].setNombre(nombre);
            listServiciioAdcional[index].setDescripcion(descripcion);
            listServiciioAdcional[index].setPrecio(precio);
            listServiciioAdcional[index].setDisponible(disponible);

            respuesta = true;
        }

        return respuesta;
    }

    //--------------------------------------------------------------------------------------------------------

    // CALCULAR INGRESOS TOTALES
    public double calcularIngresosTotales() {
        double ingresosTotales = 0;

        // 1. Sumamos todos los proyectos
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null) {
                ingresosTotales += listProyectos[i].getValorTotal();
            }
        }

        // 2. Sumamos todos los servicios adicionales con su propio ciclo
        for (int j = 0; j < listServiciioAdcional.length; j++) {
            if (listServiciioAdcional[j] != null) {
                ingresosTotales += listServiciioAdcional[j].getPrecio();
            }
        }

        return ingresosTotales;
    }

    //--------------------------------------------------------------------------------------------------------

    public boolean asignarProyectoACliente(String documento, String codigoProyecto) {
        cliente clienteEncontrado = null;
        proyecto proyectoEncontrado = null;

        // Buscar el cliente en el arreglo
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] != null && listClientes[i].getDocumento().equals(documento)) {
                clienteEncontrado = listClientes[i];
                break;
            }
        }

        // Buscar el proyecto en el arreglo
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null && listProyectos[i].getCodigo().equals(codigoProyecto)) {
                proyectoEncontrado = listProyectos[i];
                break;
            }
        }

        // Si ambos existen, vinculamos el proyecto al cliente
        if (clienteEncontrado != null && proyectoEncontrado != null) {
            return clienteEncontrado.asignarProyectoCliente(proyectoEncontrado);
        }

        return false; // Retorna falso si no encontró al cliente o al proyecto
    }

    public String listarProyectos() {
        String reporte = "--- LISTA DE PROYECTOS ---\n";
        boolean hayProyectos = false;

        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null) {
                reporte += "Código: " + listProyectos[i].getCodigo() +
                        " | Estado: " + listProyectos[i].getEstado() +
                        " | Valor: " + listProyectos[i].getValorTotal() + "\n";
                hayProyectos = true;
            }
        }

        if (!hayProyectos) {
            return "No hay proyectos registrados todavía.";
        }
        return reporte;
    }
    // GETTERS Y SETTERS

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public cliente[] getListClientes() {
        return listClientes;
    }

    public void setListClientes(cliente[] listClientes) {
        this.listClientes = listClientes;
    }

    public proyecto[] getListProyectos() {
        return listProyectos;
    }

    public void setListProyectos(proyecto[] listProyectos) {
        this.listProyectos = listProyectos;
    }

    public Desarrolador[] getListDesarrolladores() {
        return listDesarrolladores;
    }

    public void setListDesarroyadores(Desarrolador[] listDesarrolladores) {
        this.listDesarrolladores = listDesarrolladores;
    }

    public servicioAdicional[] getListServiciioAdcional() {
        return listServiciioAdcional;
    }

    public void setListServiciioAdcional(servicioAdicional[] listServiciioAdcional) {
        this.listServiciioAdcional = listServiciioAdcional;
    }
}