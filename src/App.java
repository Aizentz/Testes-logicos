public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Exercício calculadora!");

        System.out.println();

        System.out.print("Escolha um número positivo inteiro: ");
        int info = Integer.parseInt(scanner.nextLine());

        if (info % 2 == 0){
            int value1 = info + 5;
            System.out.println("o resultado de "+ info + " + 5 é igual a: "+ value1);
        }else{
            int value2 = info * 2;
            System.out.println("o resultado de "+ info + " x 2 é igual a: "+ value2);
        }
    }
}
