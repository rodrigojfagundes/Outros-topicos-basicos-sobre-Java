import java.util.Scanner;

public class Main {


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String original = "abcde FHHIJ ABC abc DEFG   ";

//convertendo a var ORIGINAL para letra minuscula
String s01 = original.toLowerCase();
//em letras maiscula
String s02 = original.toUpperCase();
//sem espaco e string original
String s03 = original.trim();
//somente o caracter da posicao 2 em diante
String s04 = original.substring(2);
//da letra C a letra H
String s05 = original.substring(2, 9);
//trocar letra A por X
String s06 = original.replace ('a', 'x');
//trocar letra em substring
String s07 = original.replace ("abc", "xy");
//pegando a primeira posicao do BC
int i = original.indexOf("bc");
//pegando a ultima posicao do BC
int j = original.lastIndexOf("bc");


System.out.println("original - = " + original +"-");
System.out.println("letra minuscula - = " + s01 +"-");
System.out.println("em maiuscula - = " + s02 + "-");
System.out.println("sem espaco- = " + s03 + "-");
System.out.println("primeiras 2 letras - = " + s04 + "-");
System.out.println("letra 2 a 9- = " + s05 + "-");
System.out.println("substituir A por X- = " + s06 + "-");
System.out.println("trocar ABC por XY - = " + s07 + "-");
System.out.println("pegando a primeira posicao do BC = " + i);
System.out.println("pegando a ultima posicao do BC = " + j);




sc.close();

}
}
