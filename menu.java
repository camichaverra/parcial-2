import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        boolean bandera = true;
        Stack<objcompu> pila = new Stack<>();
        Stack<objtablet> pilaa = new Stack<>();
        int opt = 0;
        while (bandera) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. ingresar un compu");
            System.out.println("2. ingresar una tablet");
            System.out.println("3. prestar un compu");
            System.out.println("4. prestar una tablet");
            System.out.println("5. devolver compu");
            System.out.println("6. devolver tablet");
             System.out.println("ingrese la opcion");

            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    pila = m.Ingresarcompu(pila);
                    agregarcompu();

                    break;
                case 2:
                  agregartablet();
                    break;
                    case 3:
                    break;
                    case 4:
                    break;

                    case 5:
                    devolvercompu(pila);
                    break;
                    case 6:
                    devolvertablet(pila);
                    break;
                    case 5:
                    break;
                   

                default:
                    break;
            }
        }

    }
}

