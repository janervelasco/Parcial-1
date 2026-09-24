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