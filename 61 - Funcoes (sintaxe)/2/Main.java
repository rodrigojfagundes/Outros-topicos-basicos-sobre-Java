import java.util.Scanner;

public class Main {


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);




//o usuario digita 3 numeros... e o sistema descobre qual e o MAIOR dos 3 numeros... SEM USAR FUNCAO


System.out.println("digite 3 numeros");

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();


if (a > b && a > c) {

System.out.println("o A e o maior numero " + a);

} else if (b > c) {

System.out.println(" O maior numero e o B " + b);

} else {
System.out.println("o maior numero e o C " + c);

}


sc.close();
}
}
