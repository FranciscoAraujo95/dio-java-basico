import java.util.Scanner;


public class Metodos {

    Scanner scanner = new Scanner(System.in);

    //Atribuos da classe
    private int n1, n2, n3, media, escolha;
    private float salario, peso, altura, imc;
    
    //Métodos

    

    //Exibe o menu para o usuário e lê o input dele
    public void mostrarMenu() {
        System.out.println("Informe a opção desejada");
        System.out.println("1 - Calcular IMC");
        System.out.println("2 - Calcular Media");
        System.out.println("3 - Verificar Triângulo");
        System.out.println("Sua escolha: ");
        escolha = this.scanner.nextInt();
    }

    public void calcularIMC() {
        System.out.println("Peso: ");
        this.setPeso(this.scanner.nextFloat());
        System.out.println("Altura: ");
        this.setAltura(this.scanner.nextFloat());

        imc = peso / (float) (Math.pow(this.getAltura(), 2));

        System.out.println("IMC: " + String.format("%.2f", imc) + ".");
    }

    //Getter & Setters
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN3() {
        return n3;
    }
    public void setN3(int n3) {
        this.n3 = n3;
    }
    public int getMedia() {
        return media;
    }
    public void setMedia(int media) {
        this.media = media;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    

}
