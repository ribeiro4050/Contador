import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para o parametro 1: ");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite um valor para o parametro 2: ");
        int parametro2 = scanner.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O primeiro parâmetro deve ser maior do que o segundo parâmetro");
        }



    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior do que o segundo parâmetro");
        }
        int qtdInteracoes = parametro2 - parametro1;
        for (int i = 1; i <= qtdInteracoes; i++) {
            System.out.println(i);
        }
    }
}
