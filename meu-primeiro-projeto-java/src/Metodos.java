import java.util.Scanner;

public class Metodos {
    Scanner scanner = new Scanner(System.in);

    //Atribuos da classe
    private int escolha, lado1, lado2, lado3;
    private float salario, percentual, valorInformado, peso, altura, imc, n1, n2, n3, media;
    
    //Métodos
    //Exibe o menu para o usuário e lê o input dele
    public void mostrarMenu() {
        System.out.println("Informe a opção desejada");
        System.out.println("1 - Calcular IMC");
        System.out.println("2 - Calcular Media");
        System.out.println("3 - Verificar Triângulo");
        System.out.println("4 - Calcular salário");
        System.out.println("Sua escolha: ");
        escolha = this.scanner.nextInt();
    }

    //Calcula o IMC do usuário
    public void calcularIMC() {
        System.out.println("Peso: ");
        this.setPeso(this.scanner.nextFloat());
        System.out.println("Altura: ");
        this.setAltura(this.scanner.nextFloat());

        imc = peso / (float) (Math.pow(this.getAltura(), 2));

        System.out.println("IMC: " + String.format("%.2f", imc) + ".");
    }

    //Calcular a média do usuário
    public void calcularMedia() {
        // return (n1 + n2 + n3) / 3;
        System.out.println("Nota 1: ");
        this.setN1(this.scanner.nextFloat());
        System.out.println("Nota 2: ");
        this.setN2(this.scanner.nextFloat());
        System.out.println("Nota 3: ");
        this.setN3(this.scanner.nextFloat());

        media = (n1 + n2 + n3) / 3;

        System.out.println("Media: " + String.format("%.2f", this.getMedia()));

        if (media >= 7) {
            if (media == 10) {
                System.out.println("Aprovado com nota máxima!! Parabéns");
            } else {
                System.out.println("Aprovado.");
            }
        } else if (media < 5) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Recuperação.");
        }

    }

    //Verificar tipo de triângulo
    public void verificarTriangulo() {
        System.out.println("Lado 1: ");
        this.setLado1(this.scanner.nextInt());
        System.out.println("Lado 2: ");
        this.setLado2(this.scanner.nextInt());
        System.out.println("Lado 3: ");
        this.setLado3(this.scanner.nextInt());

        //Verificar se é um triangulo primeiramente
        if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)) {
            System.out.println("Não é um triângulo!!");
        } else if (lado1 == lado2 && lado2 == lado3) {
            //Equilátero - Todos os lados são iguais
            System.out.println("Triângulo equilátero");
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) {
            //Isósceles - Dois lados iguais
            System.out.println("Triângulo isósceles");
        } else {
            //Escaleno - Todos os lados são diferentes
            System.out.println("Triângulo escaleno");
        }
    }

    //Receber e multiplicar salário
    public void calcularSalario() {
        System.out.println("Informe o seu salário: ");
        this.setSalario(this.scanner.nextFloat());
        
        System.out.println("Salário atual: R$" + String.format("%.2f", this.getSalario()) + ".");
        System.out.println("Deseja aplicar um acréscimo? (1 - Sim / 0 - Não)");

        escolha = this.scanner.nextInt();
        if (escolha == 1) {
            System.out.println("Digite o percentual de acréscimo: ");
            valorInformado = this.scanner.nextFloat();

            //Calculando o percentual
            percentual = valorInformado / 100;

            System.out.println("Seu salário acrescido é: R$" + String.format("%.2f", this.salario + (salario * percentual)) + ".");

        } else {
            System.out.println("Até mais!");
        }

    }

    //Getters & Setters
    public float getN1() {
        return n1;
    }
    public void setN1(float n1) {
        this.n1 = n1;
    }
    public float getN2() {
        return n2;
    }
    public void setN2(float n2) {
        this.n2 = n2;
    }
    public float getN3() {
        return n3;
    }
    public void setN3(float n3) {
        this.n3 = n3;
    }
    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
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

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    public float getValorInformado() {
        return valorInformado;
    }

    public void setValorInformado(float valorInformado) {
        this.valorInformado = valorInformado;
    }
}
