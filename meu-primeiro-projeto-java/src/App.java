
public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p = new Pessoa("", "", 0);
        Metodos m = new Metodos();
        System.out.println("Informe o seu nome: ");
        p.setNome(m.scanner.nextLine());
        System.out.println("Informe a sua idade: ");
        p.setIdade(m.scanner.nextInt());
        System.out.println("Olá! Meu nome é " + p.getNome() + " e tenho " + p.getIdade() + " anos!!" );
        
    }
}
