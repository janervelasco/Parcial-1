import javax.swing.*;

public class empresa(){

    private String nombreComercial;
    private String nit;
    private String direccion;
    private String telefono;
    private String paginaWeb;

    private clientes[] listClientes;
    private proyectos[] listProyectos;
    private desarrolladores[] listDesarroyadores;
    private serviciioAdcional[] listServiciioAdcional;

    public empresa(String nombreComercial, String nit, String direccion, String telefono,
                   String paginaWeb){
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb =paginaWeb;

        listClientes = new clientes[10];
        listProyectos = new proyectos[10];
        listDesarroyadores = new desarrolladores[10];
        listServiciioAdcional = new serviciioAdcional[10];
    }

    //GETS AND SETS
    public String getNombreComercial() {return nombreComercial;}
    public void setNombreComercial(String nombreComercial) {this.nombreComercial = nombreComercial;}

    public String getNit() {return nit;}
    public void setNit(String nit) {this.nit = nit;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getPaginaWeb() {return paginaWeb;}
    public void setPaginaWeb(String paginaWeb) {this.paginaWeb = paginaWeb;}

    public clientes[] getListClientes() {return listClientes;}
    public void setListClientes(clientes[] listClientes) {this.listClientes = listClientes;}

    public proyectos[] getListProyectos() {return listProyectos;}
    public void setListProyectos(proyectos[] listProyectos) {this.listProyectos = listProyectos;}

    public desarrolladores[] getListDesarroyadores() {return listDesarroyadores;}
    public void setListDesarroyadores(desarrolladores[] listDesarroyadores) {this.listDesarroyadores = listDesarroyadores;}

    public serviciioAdcional[] getListServiciioAdcional() {return listServiciioAdcional;}
    public void setListServiciioAdcional(serviciioAdcional[] listServiciioAdcional) {this.listServiciioAdcional = listServiciioAdcional;}
}