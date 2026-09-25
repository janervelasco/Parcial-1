import javax.swing.*;

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
public class empresa {
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
    //Eliminar cliente
    public boolean eliminarCliente(String documento) {
        boolean respuesta = false;
        int index = encontrarIndexCliente(documento);
<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd

        if(index != -1){
            listClientes[index] = null;
            respuesta = true;
        }


        return respuesta;
    }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
    //--------------------------------------------------------------------------------------------------------
    //REGISTRAR DESARROLLADOR
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
    //Eliminar desarrollador
    public boolean eliminarDesarrollador(String codigo) {
        boolean respuesta = false;
        int index = encontrarIndexDesarrollador(codigo);
<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd

        if(index != -1){
            listDesarrolladores[index] = null;
            respuesta = true;
        }


        return respuesta;
    }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
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
    //Eliminar proyecto
    public boolean eliminarProyecto(String codigo) {
        boolean respuesta = false;
        int index = encontrarIndexProyecto(codigo);
<<<<<<< HEAD


        if(index != -1){
            listProyectos[index] = null;
            respuesta = true;
        }


        return respuesta;
    }


//--------------------------------------------------------------------------------------------------------
=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd

        if(index != -1){
            listProyectos[index] = null;
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

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
    //ACTUALIZAR INFORMACIÓN DEL SERVICIO ADICIONAL
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
    //Eliminar servicio adicional
    public boolean eliminarServicioAdicional(String codigo) {
        boolean respuesta = false;
        int index = encontrarIndexServicioAdicional(codigo);

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        if(index != -1){
            listServiciioAdcional[index] = null;
            respuesta = true;
        }

<<<<<<< HEAD

        return respuesta;
    }


    //--------------------------------------------------------------------------------------------------------


=======
        return respuesta;
    }

    //--------------------------------------------------------------------------------------------------------

>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
    // CALCULAR INGRESOS TOTALES
    public double calcularIngresosTotales() {
        double ingresosTotales = 0;

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null) {
                ingresosTotales += listProyectos[i].getValorTotal();
            }
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
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

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] != null && listClientes[i].getDocumento().equals(documento)) {
                clienteEncontrado = listClientes[i];
            }
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null && listProyectos[i].getCodigo().equals(codigoProyecto)) {
                proyectoEncontrado = listProyectos[i];
            }
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        if (clienteEncontrado != null && proyectoEncontrado != null) {
            return clienteEncontrado.asignarProyectoCliente(proyectoEncontrado);
        }

<<<<<<< HEAD

        return false;
    }


=======
        return false;
    }

>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
    public String listarProyectos() {
        String reporte = " LISTA DE PROYECTOS \n";
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

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
    // Validar número perfecto
    public String validarNumeroPerfecto(String telefonoBuscado) {
        cliente clienteEncontrado = null;

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] != null && listClientes[i].getTelefono().equals(telefonoBuscado)) {
                clienteEncontrado = listClientes[i];
            }
        }


        if (clienteEncontrado == null) {
            return "Error: No se encontró ningún cliente registrado con el teléfono " + telefonoBuscado;
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        int numeroTelefono = Integer.parseInt(telefonoBuscado);


        if (numeroTelefono <= 0) {
            return "El número de teléfono debe ser mayor a cero.";
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        int sumaDivisores = 0;
        for (int i = 1; i <= numeroTelefono / 2; i++) {
            if (numeroTelefono % i == 0) {
                sumaDivisores = sumaDivisores + i;
            }
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        String resultado = "VALIDACIÓN DE NÚMERO PERFECTO\n";
        resultado = resultado + "Cliente: " + clienteEncontrado.getNombreCompleto() + "\n";
        resultado = resultado + "Teléfono evaluado: " + numeroTelefono + "\n";


        if (sumaDivisores == numeroTelefono) {
            resultado = resultado + "El número de teléfono es un número perfecto (Suma: " + sumaDivisores + ")";
        } else {
            resultado = resultado + "El número de teléfono no es un número perfecto. (Suma: " + sumaDivisores + ")";
        }


        return resultado;
    }

<<<<<<< HEAD

    public String generarFacturaCliente(String documentoBuscado) {
        cliente clienteEncontrado = null;


=======
    public String generarFacturaCliente(String documentoBuscado) {
        cliente clienteEncontrado = null;

>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] != null && listClientes[i].getDocumento().equals(documentoBuscado)) {
                clienteEncontrado = listClientes[i];
                break;
            }
        }


        if (clienteEncontrado == null) {
            return "Error: No se encontró ningún cliente con el documento " + documentoBuscado;
        }

<<<<<<< HEAD

        String factura = "";
        factura += "          FACTURA / TOTAL CLIENTE       \n";
        factura += "Empresa: " + nombreComercial + " (NIT: " + nit + ")\n";
        factura += "Cliente: " + clienteEncontrado.getNombreCompleto() + "\n";
        factura += "Documento: " + clienteEncontrado.getDocumento() + "\n";
        factura += "Teléfono: " + clienteEncontrado.getTelefono() + "\n";


        factura += "PROYECTOS ASIGNADOS:\n";


        double totalFactura = 0;
        boolean tieneProyectos = false;


        proyecto[] proyectosCliente = clienteEncontrado.getListProyectos();


=======
        String factura = "";
        factura += "          FACTURA / TOTAL CLIENTE       \n";
        factura += "Empresa: " + nombreComercial + " (NIT: " + nit + ")\n";
        factura += "Cliente: " + clienteEncontrado.getNombreCompleto() + "\n";
        factura += "Documento: " + clienteEncontrado.getDocumento() + "\n";
        factura += "Teléfono: " + clienteEncontrado.getTelefono() + "\n";

        factura += "PROYECTOS ASIGNADOS:\n";

        double totalFactura = 0;
        boolean tieneProyectos = false;

        proyecto[] proyectosCliente = clienteEncontrado.getListProyectos();

>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        if (proyectosCliente != null) {
            for (int i = 0; i < proyectosCliente.length; i++) {
                if (proyectosCliente[i] != null) {
                    tieneProyectos = true;
                    factura += "  - Código: " + proyectosCliente[i].getCodigo() + "\n";
                    factura += "    Fechas (Inicio / Entrega): " + proyectosCliente[i].getFechaInicio() + " / " + proyectosCliente[i].getFechaEntrega() + "\n";
                    factura += "    Método de Pago: " + proyectosCliente[i].getMetodoPago() + "\n";
                    factura += "    Valor Proyecto: $" + proyectosCliente[i].getValorTotal() + "\n";

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
                    totalFactura += proyectosCliente[i].getValorTotal();
                }
            }
        }

<<<<<<< HEAD

=======
>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        if (!tieneProyectos) {
            factura += "  (No tiene proyectos asignados actualmente)\n";
        }

<<<<<<< HEAD

        factura += "TOTAL A PAGAR: $" + totalFactura + "\n";


=======
        factura += "TOTAL A PAGAR: $" + totalFactura + "\n";

>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
        return factura;
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

<<<<<<< HEAD

}
=======
}


>>>>>>> f5315f2ace799d2387d8e6c6e0e558dbd2820bdd
