import javax.swing.*;

public class proyecto() {

    private String codigo;
    private String fechaSolicitud;
    private String fechaInicio;
    private String fechaEntrega;
    private String estado;
    private String metodoPago;
    private double valorTotal;

    private desarrollador[] listDesarrollador;

    public proyecto(String codigo , String fechaSolicitud , String fechaInicio , String fechaEntrega ,
                    String estado , String metodoPago ,double valorTotal){

        this.codigo = codigo;
        this.fechaSolicitud = fechaSolicitud:
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;

        listDesarrollador = new desarrollador[10];

    }

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getFechaSolicitud() {return fechaSolicitud;}
    public void setFechaSolicitud(String fechaSolicitud) {this.fechaSolicitud = fechaSolicitud;}

    public String getFechaInicio() {return fechaInicio;}
    public void setFechaInicio(String fechaInicio) {this.fechaInicio = fechaInicio;}

    public String getFechaEntrega() {return fechaEntrega;}
    public void setFechaEntrega(String fechaEntrega) {this.fechaEntrega = fechaEntrega;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    public String getMetodoPago() {return metodoPago;}
    public void setMetodoPago(String metodoPago) {this.metodoPago = metodoPago;}

    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal;}

    public desarrollador[] getListDesarrollador() {return listDesarrollador;}
    public void setListDesarrollador(desarrollador[] listDesarrollador) {this.listDesarrollador = listDesarrollador;}
}