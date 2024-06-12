
public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p = new Pessoa("", "", 0);
        Metodos m = new Metodos();

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            m.mostrarMenu();
            switch (m.getEscolha()) {
                case 1:
                    m.calcularIMC();
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
