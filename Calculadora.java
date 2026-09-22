import java.util.Scanner;

public class Calculadora {
    
    public double sumar (int valor1, int valor2){
        int a = valor1;
        int b = valor2;
        int r = valor1 + valor2;
        return r;
    }
    public double restar (int valor1, int valor2){
        int c = valor1;
        int d = valor2;
        int r = valor1 - valor2;
        return r;
    }
    public double multiplicacion (int valor1, int valor2){
        int e = valor1;
        int f = valor2;
        int r = valor1 * valor2;
        return r;
    }
    public double division (int valor1, int valor2){
        int g = valor1;
        int h = valor2;
        int r = valor1 / valor2;
        return r;
    }
    public void opciones(int opcion1){
        switch (opcion1) {
            case 1:
                System.out.println("el resultado de la suma es:"+ sumar(3, 7));
                
                break;
            case 2:
                System.out.println("el resultado de la resta es:"+ restar(3, 7));
                
                break;
            case 3:
                    System.out.println("el resultado de la multiplicacion es:"+ multiplicacion(3, 7));
                    
                break;
                case 4:
                    System.out.println("el resultado de la division es:"+ division(3, 7));
                    
                default:
                
                break;
        }
    }
    public static void main(String[] args) {
        int leo = 0;
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("hola usuario que opcion quieres elegir?");
        leo = sc.nextInt();
        calculadora.opciones(leo);
    }

}