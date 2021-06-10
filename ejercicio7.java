import java.util.*;

public class ejercicio7{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

        Random aleatorio = new Random();
        int random;
        int pares = 0;
        int impares = 0;
        int ceros = 0;
        double porPares;
        double porImpares;
        double porCeros;
        for(int i=0;i<15;i++){
            random = aleatorio.nextInt(36 - 0);
            System.out.println(random);
            while(random>2){
                random = random - 2;
            }
            if(random == 2){
                pares++;
            }
            else if(random == 1){
                impares++;
            }
            else{
                ceros++;
            }
        }

        porPares = (double) pares*100/15;
	    porImpares = (double) impares*100/15;
	    porCeros = (double)ceros*100/15;
        
        System.out.println("El porcentaje de números pares es " + porPares + " %");
        System.out.println("");
        System.out.println("el porcentade de números impares es de " + porImpares + " %" );  
        System.out.println("");
        System.out.println("y el porcentaje de ceros es de " + porCeros + " %");
    }

}