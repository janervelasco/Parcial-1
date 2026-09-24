import javax.swing.*;


public class servicioAdicional(){

    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible;

    public servicioAdicional(String codigo,String nombre,String descripcion,
                             double precio,boolean disponible){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }

    //GETTERS Y SETTERS

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public boolean getDisponible() {return disponible;}
    public void setDisponible(boolean disponible) {this.disponible = disponible;}
}



