import java.util.Scanner;
/* SOBRECARGA
  É o conceito do Java de permitir a criação de dois ou
  mais métodos na mesma classe, com o mesmo nome.
  A "função" desse método "de mesmo nome" pode ser diferente
  PORÉM, apesar do método ter o mesmo nome, a
  ASSINATURA DELE deve ser diferente.
  É através dessa assinatura que a classe vai saber
  qual deles deve usar.
  -> assinatura: -> public double calcular()
*/
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Geometria circulo = new Geometria();

        circulo.raio =34;
        System.out.println("Área do Círculo: " + circulo.calcular());

        Geometria retangulo = new Geometria();
        float A = 45;
        float B = 78;
        retangulo.calcular(A,B);
        System.out.println("Área do Retângulo: " + retangulo.calcular(A,B));

        //Criar o objeto de Geometria, agora sendo o triângulo:



        Geometria triangulo = new Geometria();
        double base = 30;
        double altura = 30;
        triangulo.calcular(base,altura);
        System.out.println(" Área do triângulo" + triangulo.calcular(base,altura));

        System.out.println("Ivan Ricardo");

        int numero = 12;



    }

}