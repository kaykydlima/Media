
package media;

import java.util.Scanner;


public class Media {

    public static void main(String[] args) {
        // Programa de médias
        
        Scanner leia = new Scanner(System.in);
        
        //declaração das notas pelo usuário (n = nota)
        double n1, n2, n3, n4, media;
        System.out.println("Olá! digite a primeira nota: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = leia.nextDouble();
        
        //calculo média
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Sua média é de: " + media);
    }
    
}
