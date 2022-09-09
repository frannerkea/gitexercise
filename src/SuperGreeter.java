import java.util.Scanner;

public class SuperGreeter {

    public void start() {
        System.out.println("det virker!");
        udskrivNavn();
    }

    public void udskrivNavn() {
        System.out.println("Hvad er dit navn?");
        System.out.println("Skriv did navn: ");
        Scanner brugerInput = new Scanner(System.in);
        String ditNavn = brugerInput.nextLine();
        System.out.print("Hej" + ditNavn);
    }


    //          Scanner brugerInput = new Scanner(System.in);
    //        int antalPersoner = brugerInput.nextInt();
    //        opskrift.setAntalPersoner(antalPersoner);


    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

    }


}
