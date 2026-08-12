import java.util.Scanner;

public class exercicio2 {

    public static String inputData(Scanner sc) {
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a senha: ");
        String senha = inputData(sc);

        if(senha.equals("1234")){
            System.out.print("Acesso permitido");
        }else{
            System.out.print("Acesso negado");
        }

        sc.close();
    }
}
