import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");

        Pessoa p = new Pessoa("", "", 0);
        System.out.println("Informe o seu nome: ");
        p.setNome(scanner.nextLine());
        System.out.println("Informe a sua idade: ");
        p.setIdade(scanner.nextInt());
        System.out.println("Olá! Meu nome é " + p.getNome() + " e tenho " + p.getIdade() + " anos!!" );
        
    }
}
