
package matriz;


public class Matriz {

    
    public static void main(String[] args) {
        
            int matriz[][] = new int [5][5];
            
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                  matriz[i][j] = (int)(Math.random()*90)+5;
                }
            }
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    System.out.print("["+ matriz[i][j]+ "] " );
                }
                System.out.println("");
            }//rrecorrido de la matriz si se quita se imprime toda la matriz
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5 ; j++){
                    if (i == j){
                        System.out.print(" ["+ matriz[i][j]+ "] " );
                        
                    }
                }
                System.out.println("");
            
            
            }
    }
    
}
