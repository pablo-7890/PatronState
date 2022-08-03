package PatronState;

import java.util.Scanner;

public class Menu {
    Pou pou;

    public Menu(Pou pou) {
        this.pou = pou;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Que acción desea realizar? : " +
                "1) alimentar, 2) pasear, 3) jugar, 4) dormir, 5) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case '1': pou.comer(); break;
                case '2': pou.pasear(); break;
                case '3': pou.jugar(); break;
                case '4': pou.dormir(); break;
                case '5': System.out.println("Adios!"); System.exit(0);
                default: System.out.println("Seleccione una opción valida");
            }
        }
    }
}
