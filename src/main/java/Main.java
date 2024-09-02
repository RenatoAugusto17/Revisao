import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = sc.next();
    System.out.println("Digite agora sua altura:");
    double altura = sc.nextDouble();
    System.out.println("Agora seu peso:");
    double peso = sc.nextDouble();
    double imc = (peso * peso) / altura;
    System.out.println(imc);
  }
}