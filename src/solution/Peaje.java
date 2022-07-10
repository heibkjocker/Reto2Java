package solution;
/**
 *
 * @author Cristian Quintero
 */
public class Peaje {

    // EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    private String filaCoches[];
    private String[] cochesFlyPass;
    private boolean estadoPeaje;
    private int cocheEnAtencion;
    private int cantidadCochesAtendidos;

    // A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    // EN EL ENUNCIADO DEL PROBLEMA:
    public Peaje(String[] filaCoches) {
        // COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
        this.filaCoches = filaCoches;
        int n = filaCoches.length;
        this.cochesFlyPass = new String [n];
        for (int i = 0; i < filaCoches.length; i++) {
            cochesFlyPass[i] = " ";
        }
        this.estadoPeaje = true;
        this.cocheEnAtencion = 0;
        this.cantidadCochesAtendidos = 1;
    }

    public void proximoCoche() {
        // COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if (estadoPeaje) {
            cocheEnAtencion++;
            cantidadCochesAtendidos++;
        }
    }

    // NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI
    // MODIFICARLO!
    public void agregarCocheFlyPass() {
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for (String coche : cochesFlyPass) {
            if (coche.equals(cocheABuscar)) {
                break;
            }
            if (" ".equals(coche)) {
                coche = cocheABuscar;
            }
        }
    }

    public void cambiarEstadoPeaje() {
        // COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if (estadoPeaje) {
            estadoPeaje = false;
        } else {
            estadoPeaje = true;
        }
    }

    // INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:
    //************Se crean los GETTERS*****///

    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

  
}
