package maquinarefrigerador;

public class MaquinaRefrigerador {

    private int tem_entrada;
    private int tem_aumento;
    private int tem_reducir;
    private int tiempo;

    public MaquinaRefrigerador() {
        int ban = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("seleccione una opcion");
                System.out.println("    1: CALENTAR");
                System.out.println("    2: ENFRIAR");
                System.out.println("    3: MANTENER TEMPERATURA");
                System.out.println("    4. TERMINAR PROCESO");
                if (seleccion >= 1 && seleccion <= 4) {
                    ban = 1;
                } else {
                    System.out.println("-------------");
                    System.out.println("opcion no disponible");
                    System.out.println("-------------");
                }
            } while (ban == 0);
            if (seleccion == 1) {

            } else if (seleccion == 2) {

            } else if (seleccion == 3) {

            } else if (seleccion == 4) {
                System.out.println("--------------");
                System.out.println("PROCESO TERMINADO");
                System.out.println("--------------");
                ban = 2;
            }
        } while (ban != 2);
    }

  
    

}
