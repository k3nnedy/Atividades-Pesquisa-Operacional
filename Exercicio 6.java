/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex6e7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Convidado
 */
public class Ex6e7 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        FileInputStream arquivo = new FileInputStream("Arquivo.txt");
        Scanner ler = new Scanner(arquivo);
        Scanner receber = new Scanner(System.in);
        
        ler.nextLine();
        ler.nextLine();
        
        int vertices, arestas;
        
        vertices = ler.nextInt();
        arestas = ler.nextInt();
        
        int mat[][] = new int[vertices][vertices];
        
        for(int i=0; i<vertices; i++){
            for(int j=0; j<vertices; j++){
                mat[i][j] = 0;
            }
        }
        
        for(int i=0; i<arestas; i++){
            int v1, v2, cam;
            
            v1 = ler.nextInt();
            v2 = ler.nextInt();
            cam = ler.nextInt();
            
            mat[v1][v2] = cam;
            mat[v2][v1] = cam;
        }
        
        System.out.println("\n\nGrau dos vértices do Grafo:\n");
        for(int i=0; i<vertices; i++){
            int grau = 0;
            System.out.println("\n-> Vértice "+ i +" : ");
            for(int j=0; j<vertices; j++){
                if(mat[i][j]!=0)
                    grau++;
            }
            System.out.println(grau);
        }
        
        
        int vert;
        System.out.println("\n\nDigite o número de um vértice: ");
        vert = receber.nextInt();
        System.out.println("--> Vértices adjacentes ao vértice "+vert+": ");
        for(int i=0; i<vertices; i++){
            if(mat[vert][i]!=0)
                System.out.println(i);
        }
        
        
    }
    
}
