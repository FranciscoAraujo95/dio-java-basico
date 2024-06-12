
public class App {
    public static void main(String[] args) throws Exception {

        //Instanciando objetos
        Pessoa p = new Pessoa("", "", 0);
        Metodos m = new Metodos();

        System.out.println("Seja bem-vindo!!");
        System.out.println("Informe o seu nome: ");
        p.setNome(m.scanner.nextLine());

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            m.mostrarMenu();
            switch (m.getEscolha()) {
                case 1:
                    m.calcularIMC();
                    break;
                case 2:
                    m.calcularMedia();
                    break;
                case 3:
                    m.verificarTriangulo();
                    break;
                case 4:
                    m.calcularSalario();
                    break;
                default:
                System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja continuar? (S/N)");
            continuar = m.scanner.next().charAt(0);
        }
        System.out.println("Programa encerrado! Até mais!");
    }
}
