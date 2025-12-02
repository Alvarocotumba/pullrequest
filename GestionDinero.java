public class GestionDinero {
    private String nombre;
    private int dinero;

    public GestionDinero(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " tiene " + dinero + "$.");
    }

    public void gastarDinero(int cantidad, String item) {
        if (cantidad <= dinero) {
            this.dinero -= cantidad;  // RESTA el dinero (no suma como en tu versión)
            System.out.println(nombre + " gasta " + cantidad + "$ en " + item + ".");
        } else {
            System.out.println("No tiene suficiente dinero para gastar " + cantidad + "$.");
        }
    }

    public static void main(String[] args) {
        // Crear un personaje con 500$ (como en el ejemplo original)
        GestionDinero jugador = new GestionDinero("Trevor", 500);
        
        // Mostrar información inicial
        jugador.mostrarInfo();
        
        // Gastar 100$ en ropa nueva
        jugador.gastarDinero(100, "ropa nueva");
        
        // Mostrar información después del gasto
        jugador.mostrarInfo();
    }
}