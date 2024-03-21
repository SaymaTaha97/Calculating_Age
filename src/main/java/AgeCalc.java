import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.io.PrintWriter;

public class AgeCalc {
  public static void main(String[] args) throws IOException {

    String inputFileName = args[0];
    String outputFileName = args[1];;

    File inputFile = new File(inputFileName);
    Scanner sc = new Scanner(inputFile);

    PrintWriter outputfile = new PrintWriter(outputFileName);

    sc.useDelimiter(",|\n");

    while (sc.hasNext()) {
      String name = sc.next();

      int month =  Integer.parseInt(sc.next().trim());

      int year = Integer.parseInt(sc.next().trim());

      Calendar calendar = Calendar.getInstance();

      int CurrM = calendar.get(Calendar.MONTH);
      int CurrY = calendar.get(Calendar.YEAR);

      int age = CurrY - year;
      if (CurrM < month) {
        age = age - 1;
      }
      outputfile.println(name + " is " + age + " years old.");
    }
    sc.close();
    outputfile.close();
  }
}