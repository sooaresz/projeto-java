import java.util.Scanner;

public class media {
   public static void main(String[] args) throws Exception {
      double n1, n2, n3, media;
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Digite a primeira nota: ");
      n1 = scan.nextDouble();
      System.out.println("Digite a segunda nota: ");
      n2 = scan.nextDouble();
      System.out.println("Digite a terceira nota: ");
      n3 = scan.nextDouble();
      media = (n1 + n2 + n3) / 3;
      System.out.printf("A media das notas e: %.2f" , media);
      System.out.println("   ");
      scan.close();

   }
}
}
