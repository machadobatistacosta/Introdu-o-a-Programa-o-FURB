import java.util.Scanner;
public class Uni5Exe13 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Quantos kilometros foram feitos na viagem ? :");
        double km = scanner.nextDouble();
        System.out.println();
        System.out.println("Quantas paradas foram feitas no total da viagem: ");
        int paradas = scanner.nextInt();
       
        int litros;
        Double kmParada;
        int litrosTotal = 0;

        for(int i=0; i < paradas; i++)
        {
            System.out.println("Quantos litros foram colocados na parada:");
            litros = scanner.nextInt();
            litrosTotal += litros;
            System.out.println("Quantos kilometros foram percorridos ate a proxima parada");
            kmParada = scanner.nextDouble();
            Double litrosKmParada = kmParada / litros;
            for(int j=0; j < i; j++)
            {
                System.out.println("A quilometragem por litro na parada foi de: " + litrosKmParada);
            }
        }
        Double kmPorLitro =  km / litrosTotal;
        System.out.println("Foram feitos " + kmPorLitro + " km por litro na viagem toda");

        scanner.close();
        
    }    
}