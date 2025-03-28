import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Scanner sc = new Scanner(System.in);
     Stack <objcompu> pilacompu = new Stack<> ();
     Stack<objtablet> pilatablet = new Stack<>();
    public Stack<objcompu> Ingresarcompu(Stack<objcompu> pila) {
        objcompu o = new objcompu();
        int cant = 0;
        boolean existe = false;
        
        System.out.println("Ingrese el serial");
        o.setSerial(sc.next());
        System.out.println("Ingrese la marca");
        o.setMarca(sc.next());
       System.out.println("Ingrese la memoria ram");
        o.setMemoriaRAM(sc.nextInt());
        System.out.println("Ingrese el disco duro");
        o.setDiscoduro(sc.nextInt());
        System.out.println("Ingrese el precio");
        o.setPrecio(sc.nextDouble());
        System.out.println("Ingrese el nombre de usuario");
        o.setNombreusuario(sc.next());
        
        if (pila.size() > 0) {
            for (objcompu obj : pila) {
                if (obj.getSerial().equalsIgnoreCase(obj.getSerial())) {
                    System.out.println("ingrese la cantidad");
                    cant = sc.nextInt();
                    cant = cant + obj.getCantidad();
                    obj.setCantidad(cant);
                    obj.setMarca(obj.getMarca());
                    obj.setPrecio(obj.getPrecio());
                    existe = true;
                }
            }
            if (!existe) {
                o.setReferencia(obj.getReferencia());
            }

        } else {
            o.setReferencia(ref);

        }

        if (!existe) {
            System.out.println("Ingrese el precio");
            o.setPrecio(sc.nextDouble());
            System.out.println("ingrese la cantidad");
            o.setCantidad(sc.nextInt());
            pila.push(o);
        }

        return pila;
    }
    public void agregarcompu(objcompu compu){
        pilacompu.push(compu);
        System.out.println("compu se ha agregado");
    }


    public void agregartablet(objtablet tablet){
        pilatablet.push(tablet);
        System.out.println("tablet se ha agregado");
    }

    public void MostrarPila(Stack<objcompu> pila) {
        for (objcompu o : pila) {
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Ref : " + o.getReferencia());
            System.out.println("Precio : " + o.getPrecio());
            System.out.println("Cantidad: " + o.getCantidad());
        }
    } public void devolvercompu(String serial)
    Stack <compu> temp = new Stack<>();
    boolean encontrado=false;
    while(!pilacompu.isEmpty()){
        Compu compu = pilacompu.pop();
        if(compu.getSerial().equals(serial) && !compu.isDisponible()){
            compu.setNombreUsuarioT("");
            System.out.println("Tablet devuelta");
            encontrado=true;
        }
            temp.push(compu);

        }
        while (!temp.isEmpty()) pilacompu.push(temp.pop());
        if(!encontrado)System.out.println("Tablet no encontrada o no prestada");
        public void mostrarTablets(){
            for(tablet tablet : objtablet) MostrarinfoT();
           

        }


        public void prestarcompu(String serial,)
        stack<compu> temp=new stack<>();
        boolean encontrado=false;
        while(!pilacompu.isEmpty)

    public void devolvertablet(String serial)
    stack tablet temp = new stack();
    boolean encontrado=false;
    while(!pilaTablet.isEmpty()){
        Tablet tablet = plaTablet.pop();
        if(tablet.getSerial().equals(serial) && !tablet.isDisponible()){
            tablet.setNombreUsuarioT("");
            System.out.println("Tablet devuelta");
            encontrado=true;
        }
            temp.push(tablet);

        }
        while (!temp.isEmpty()) pilaTablet.push(temp.pop());
        if(!encontrado)System.out.println("Tablet no encontrada o no prestada");
        public void mostrarTablets(){
            for(tablet tablet : objtablet) MostrarinfoT();
           
        }

    }






