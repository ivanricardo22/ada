public class Geometria {
    // Esta classe deve poder calcular a área de um círculo
    // area = PI * raio ao quadrado

    // Agora, a classe deve suportar o cálculo da área do
    // retângulo
    // area = ladoA * ladoB
    // Usem a sobrecarga de métodos
    public float raio;
    public float PI = 3.14f;
    public float ladoA;
    public float ladoB;
    public double base;
    public double altura;

    //
    // método do cálculo
    public float calcular(){
        float area =  PI * (this.raio * this.raio);
        return area;
    }
    //Aplicar a sobrecarga
    public float calcular(float A, float B){
        this.ladoA = A;
        this.ladoB = B;
        float area = (this.ladoA * this.ladoB);
        return area;
    }
    //Aplicar uma segunda sobrecarga: calcular a área do
    //triângulo, sendo:  area = (base * altura) /2
    public double calcular(double base, double altura){
        this.base = base;
        this.altura = altura;
        double area = (this.base * this.altura)/2;
        return area;



    }


}
