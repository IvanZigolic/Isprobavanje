import java.util.Scanner; // import the Scanner class

class Unos_broja {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String ocjena;

        // Enter username and press Enter
        System.out.println("Unesi ocjenu");
        ocjena = myObj.nextLine();

        if(ocjena.equals("1")){
            System.out.println("Nedovoljan"); // Ako je uvjet iz IF istinit ovo se izvrsava
        }
        else if(ocjena.equals("2")) {
            System.out.println("Dovoljan");
        }
        else if(ocjena.equals("3")) {
            System.out.println("Dobar");
        }
        else if(ocjena.equals("4")) {
            System.out.println("Vrlo dobar");
        }
        else if(ocjena.equals("5")) {
            System.out.println("Odlican");
        }
        else{
            System.out.println("Pogresan unos, unesite ocjenu 1-5");
        }
        }
    }