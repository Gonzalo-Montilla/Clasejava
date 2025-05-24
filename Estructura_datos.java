
public class Main {
    public static void main(String[] args) {

        int [] miArreglo= new int[4];

        System.out.println(miArreglo[0]);
        System.out.println(miArreglo[1]);
        System.out.println(miArreglo[2]);
        System.out.println(miArreglo[3]);
        System.out.println("------------------------");

        miArreglo[0]=10;
        miArreglo[2]=11;
        miArreglo[3]=11;
        miArreglo[1]=1;

        System.out.println(miArreglo[0]);
        System.out.println(miArreglo[1]);
        System.out.println(miArreglo[2]);
        System.out.println(miArreglo[3]);



    }
}