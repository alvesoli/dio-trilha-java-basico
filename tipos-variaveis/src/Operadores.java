import javax.sound.midi.SysexMessage;

public class Operadores {
    public static void main(String[] args) throws Exception {
       String nomeUm = "Carolina";
       String nomeDois = new String ("Carolina");

       System.out.println(nomeUm.equals(nomeDois));
       
       
       
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
        System.out.print("A nossa condição é verdadeira");
        }
	   
        
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de  numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
            
            }
        }
        
        


