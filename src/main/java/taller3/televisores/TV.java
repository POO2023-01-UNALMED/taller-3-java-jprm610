package taller3.televisores;

public class TV {
    private Marca marca;
    public int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    // Constructor
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    // Gets
    public Marca getMarca() {
        return this.marca;
    }

    public Control getControl() {
        return this.control;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public int getCanal() {
        return this.canal;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public static int getNumTV() {
        return numTV;
    }

    // Sets
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public static void setNumTV(int numTv) {
        numTV = numTv;
    }

    // Metodos
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public void canalUp() {
        if (this.canal == 120 || !this.estado) {
            return;
        }
        this.canal++;
    }

    public void canalDown() {
        if (this.canal == 1 || !this.estado) {
            return;
        }
        this.canal--;
    }

    public void volumenUp() {
        if (this.volumen == 7 || !this.estado) {
            return;
        }
        this.volumen++;
    }

    public void volumenDown() {
        if (this.volumen == 0 || !this.estado) {
            return;
        }
        this.volumen--;
    }
}
