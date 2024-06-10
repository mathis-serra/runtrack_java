import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Veuillez entrer un nombre de minutes : ");
        int totalMinutes = scanner.nextInt();

  
        scanner.close();

   
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

     
        System.out.printf("Le temps converti est : %02d:%02d\n", hours, minutes);
    }
}
