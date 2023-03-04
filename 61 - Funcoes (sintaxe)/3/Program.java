//COM FUNCAO
//verificar qual e o maior numero digitado

import java.util.Scanner;

//classe publica program
public class Program {

//funcao Main
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

System.out.println("digite 3 numeros");

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

//chamando a funcao MAX e passando os valores q estao nas variaveis
//A, B e C... a variavel HIGHER vai receber o retorno/resultado
int higher = max(a, b, c);

//chamando a funcao ShowResult
showResult(higher);

sc.close();

}

//criando a funcao MAX
public static int max (int x, int y, int z){
int aux;
if (x > y && x > z){
aux = x;
} else if (y > z) {
aux = y;
} else {
aux = z;
}
return aux;
}

public static void showResult(int value){

System.out.println("Higher = " + value);
}

}
