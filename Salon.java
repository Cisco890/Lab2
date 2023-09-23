public class Salon {
    private int idSalon;
    private int capacidadSalon;
    private String edificio;

    // Constructor
    public Salon(int idSalon, int capacidadSalon, String edificio) {
        this.idSalon = idSalon;
        this.capacidadSalon = capacidadSalon;
        this.edificio = edificio;
    }

    // Métodos de acceso (getters)
    public int getIdSalon() {
        return idSalon;
    }

    public int getCapacidadSalon() {
        return capacidadSalon;
    }

    public String getEdificio() {
        return edificio;
    }

}
