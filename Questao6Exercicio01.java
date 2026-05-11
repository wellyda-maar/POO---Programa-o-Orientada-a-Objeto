public class Questao6Exercicio01 {
      public static void main(String[] args){
        int n1 = 0, n2 = 1, n3;
        System.out.print("Sequência de Fibonacci:" + n1 + "," + n2);
        for (int i = 2; i < 7; i++){
            n3 = n1 + n2;
            System.out.print("," + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
