/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex8;

import java.util.Scanner;


public class Ex8 {
            
    public static int soma(int[] vet, int tam){
        if(tam<0)
            return 0;
        else
            return soma(vet, tam-1) + vet[tam];
    }
    public static void main(String[] args) {
        
        int tam = 5;
        int vet[] = new int[tam];
        Scanner receber = new Scanner(System.in);
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite o "+ (i+1) +"º número do vetor: ");
            vet[i] = receber.nextInt();
        }
        
        System.out.print("\nVetor digitado: [ ");
        for(int i=0; i<tam; i++){
            System.out.print(vet[i]+" ");
        }
        System.out.println("]");
        
        System.out.println("\n\nSoma dos valores do vetor digitado: ");
        
        System.out.println(Ex8.soma(vet, tam-1)+"\n");
        
        
    }
    
}
