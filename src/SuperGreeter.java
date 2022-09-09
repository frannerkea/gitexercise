import java.util.Scanner;

public class SuperGreeter {

    public void start() {
        System.out.println("det virker!");
        printName();
        askAboutAge();
    }

    public void printName() {
        System.out.println("What is your name?");
        System.out.println("Write your name: ");
        Scanner userName = new Scanner(System.in);
        String yourName = userName.nextLine();
        System.out.print("Hej med dig! " + yourName);
        System.out.println(" ");
    }

    public void askAboutAge() {
        System.out.println("How old is u? ");
        Scanner userAge = new Scanner(System.in);
        int age = userAge.nextInt();
        System.out.println("okay you are " + age + " old");

    }


    //          Scanner brugerInput = new Scanner(System.in);
    //        int antalPersoner = brugerInput.nextInt();
    //        opskrift.setAntalPersoner(antalPersoner);


    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();


    }


}
