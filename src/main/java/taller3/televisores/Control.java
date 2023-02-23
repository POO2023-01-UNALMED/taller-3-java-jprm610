package taller3.televisores;

public class Control {
    private TV tv;

    // Gets
    public TV getTV() {
        return tv;
    }

    // Sets
    public void setTV(TV tv) {
        this.tv = tv;
    }

    public void setCanal(int canal) {
        if (canal < 1 || canal > 120) {
            return;
        }
        tv.canal = canal;
    }

    // Metodos
    public void enlazar(TV tv) {
        this.tv = tv;
        this.tv.setControl(this);
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        tv.canalUp();
    }

    public void canalDown() {
        tv.canalDown();
    }

    public void volumenUp() {
        tv.volumenUp();
    }

    public void volumenDown() {
        tv.volumenDown();
    }
}
