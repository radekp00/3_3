// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = 0;
    char symbol;
    System.out.println("Podaj n");

    n = myObj.nextInt();

    System.out.println("Podaj symbol");

    symbol = myObj.next().charAt(0);

    for (int i = 0; i < n; i++) {
      for(int j = n; j > i+1; j--){
        System.out.print(" ");
      }
      for(int j = 0; j < i+1; j++){
        System.out.print(symbol);
      }
      System.out.println();
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}