import java.util.*;
public class main {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream
    System.out.print("What is the input string? ");
    String str= sc.nextLine();
    int count = str.length();
    System.out.printf("%s has %d characters.", str, count);
}
}
