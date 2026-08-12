import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite oa tempetura em graus Celsius:  ");
        float temperatura = sc.nextFloat();

        if (temperatura >= 18) {
            System.out.println("Temperatura Agradável");
        }else{
            System.out.println("Frio");
        }

        sc.close();
    }
}