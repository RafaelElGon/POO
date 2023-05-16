package Exercicio7;

public class TestaConcorrencia {
    public static void main(String [] args) throws InterruptedException{
        Contador cont = new Contador();
        System.out.println("O valor1 de cont é: " + cont.getValor());
        Thread t1 = new TA(cont);
        Thread t2 = new TB(cont);
        Thread t3 = new TB(cont);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(" valor2 de cont é: " + cont.getValor());
        t1.join();
        t2.join();
        t3.join();
        System.out.println(" valor final de cont é: " + cont.getValor());
    }
}   

/*Considerando o código mostrado a seguir, responda as seguintes questões:
1. Quantas threads são iniciadas pelo programa mostrado na classe TestaConcorrencia? Quais variáveis
representam estas threads?
Resposta: São iniciadas 3 threads. Pelas variáveis t1, t2 e t3.

2. Considerando uma possível execução do main da classe TestaConcorrencia, transcreva o que será
impresso na tela nessa execução.
Resposta: O volor atual de cont1 é impresso na tela, nesse momento zero. Então t1, t2 e t3 são inicializadas com cont como parâmetro,

3. Os blocos synchronized da classe Contador são necessários? Justifique.


4. Faça um teste JUnit que crie uma thread TA com um contador e ao final verifique se o valor do
contador está correto após o fim da execução de TA.


5. Qual seria uma implementação alternativa de TA ao invés de estender da classe Thread? Aponte uma
vantagem ou desvantagem dessa outra implementação?*/