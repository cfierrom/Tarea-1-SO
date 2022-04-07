/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carreras2;

/**
 *
 * @author 56981
 */
public class Carreras2 {

    public static void main(String[] args) {
        int c=5;
        int m=50;
        int matriz[][] = new int[c][m];
        int posicion[] = new int[c];
        double aleatorio;
        int meta = m-5;
        int ganadores[];
        ganadores = new int[c];
        
        //inicializando posiciones
        for(int i=0;i<c;i++){
            posicion[i]=0;
        }
        
       //asignamos la matriz y caballos
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < m; j++) {
                if (j!=meta){
                    matriz[i][j]=0;
                }else{
                    matriz[i][j] = 8;
                }
               // System.out.print(matriz[i][j]+" ");
            }
            matriz[i][0]=1;
           //System.out.println();	// Imprime salto de línea 
        }
        //mostrar matriz y caballos
        
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < m; j++) {
                
                System.out.print(matriz[i][j]+" ");
            } 
           System.out.println();	 
        }
        
        int co = 0;
       //inicia partida   carrera
        while(co < c){
            System.out.println();
            for (int i = 0; i < c; i++) {
                aleatorio = Math.random()*3+1;
                matriz[i][posicion[i]] = 0;
                posicion[i] = posicion[i] + (int) aleatorio;
                if(posicion[i] < meta){
                    matriz[i][posicion[i]] = 1;
                }else{
                    if(( posicion[i] >= meta ) && ( co < c )){
                        ganadores[c] = i;
                        co++;
                    }
                }
                for(int j=0;j<m;j++){
                    System.out.print(matriz[i][j]+" ");
                } 
                System.out.println();
            }
        }
        System.out.println("Posiciones:");
        for(int x = 0;x < c;x++){
           System.out.println((x+1)+".- Posición: "+ ganadores[x]);
        }
    }
}
