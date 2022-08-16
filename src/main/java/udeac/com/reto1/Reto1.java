/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udeac.com.reto1;

/**
 *
 * @author hughu
 */
public class Reto1 {

    public static void main(String[] args) {
        
        int[] participantes = {12 , 23, 54, 31, 11, 21, 43, 44, 9};
        
        System.out.println(reporte(participantes));              
    }
    
    
    public static int[] reporte(int[] participantes){// Inicio solucion (creo metodo)
        
        int[] resultados = new int[3]; // creamos el obj array que recibirá los resultados
        
        int menorTm, mayorTm;
        menorTm = mayorTm = participantes[0];
        for(int i =0; i<participantes.length; i++){
            if(participantes[i] < menorTm){
                menorTm = participantes[i];
            }else if(participantes[i] > mayorTm){
                mayorTm = participantes[i];
            }// fin if
        }// fin for
        
        resultados[0] = participantes.length;
        resultados[1] = menorTm;
        resultados[2] = mayorTm;
        
        return resultados;// devuelve el array resultados{[0]cantidad de participantes; [1]menor tiempo; [2]mayor tiempo}
    }// fin del metodo reporte

}

