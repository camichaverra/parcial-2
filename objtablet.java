public class objtablet {
    private String serialT;
    private double tamaño;
    private String marcaT;
    private double precioT;
    private String NombreUsuarioT;
    private boolean disponibleT;

    public objtablet(String serialT,double tamaño,String marca,double precio,String marcaT ,double precioT,String NombreUsuarioT,boolean disponibleT){
        this.serialT=serialT;
        this.tamaño=tamaño;
        this.marcaT=marcaT;
        this.precioT=precioT;
        this.NombreUsuarioT=NombreUsuarioT;
        this.disponibleT=disponibleT;
        // private int CantidadT;



    }
    public objtablet(){

    }
    public String getSerial() {
        return serialT;
    }
    public void setSerial(String serial) {
        this.serialT = serialT;
    }
    public double getTamaño() {
        return tamaño;
    }
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    public String getMarcaT() {
        return marcaT;
    }
    public void setMarcaT(String marcaT) {
        this.marcaT = marcaT;
    }
    public double getPrecioT() {
        return precioT;
    }
    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }
    public String getNombreUsuarioT() {
        return NombreUsuarioT;
    }
    public void setNombreUsuarioT(String nombreUsuarioT) {
        NombreUsuarioT = nombreUsuarioT;
    }
    public boolean isDisponibleT() {
        return disponibleT;
    }
    public void setDisponibleT(boolean disponibleT) {
        this.disponibleT = disponibleT;
    }
    
    public void MostrarinfoT(){
        System.out.println("tablet= serial:"+serialT+"tamaño: "+tamaño+"Marca: "+marcaT+"precio: "+precioT+"nombre de usuario: "+NombreUsuarioT+"su estado: "+disponibleT);
    }
    
}
