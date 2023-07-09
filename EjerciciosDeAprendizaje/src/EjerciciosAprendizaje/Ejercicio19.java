/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosAprendizaje;

public class Ejercicio19 {
   
    public static void main(String[] args) {
        //Creo la matriz original, asignando los valores
        int [][] matriz = {{0,2,4,5},{-2,0,8,9},{-4,-8,0,7},{-5,-9,-7,0}};
        
        mostrarMatriz(matriz);
        System.out.println(" ");
        int[][] matrizTraspuesta = trasponer(matriz);
        mostrarMatriz(matrizTraspuesta);
        System.out.println("");
        validarAntisimetria (matriz, matrizTraspuesta);
        
    }

public static int [][] trasponer (int matriz [][]){

    int[][] Traspuesta = new int [matriz.length][matriz.length];
    
    for (int i = 0; i < Traspuesta.length; i++) {
        for (int j = 0; j < Traspuesta.length; j++) {
           Traspuesta [i][j]= matriz [j][i];
        }
    }
        return Traspuesta;

}

public static void mostrarMatriz (int matrizX [][]){

    for (int i = 0; i < matrizX.length; i++) {
        for (int j = 0; j < matrizX.length; j++) {
            System.out.print("[" + matrizX [i][j] + "]");
        }
        System.out.println("");
    }   
}

public static void validarAntisimetria (int matriz [][], int [][] matrizTraspuesta){

    boolean simetria = true;   
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
          if (matriz[i][j]==(matrizTraspuesta[i][j])*-1) {
          } else {
              simetria=false;
          }  
        }
    }
    
   if (simetria) {
       System.out.println("Laa matrices son Antisimetricas");
   }else 
        System.out.println("Las matrices NO son antisimetricas");
}


}


