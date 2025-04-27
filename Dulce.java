package org.example;


abstract class Dulce extends Producto{
    public Dulce(int b) {
        super(b);
    }
    public String accion(){
        return "Comida";
    }
}

class Super8 extends Dulce {
    public Super8(int serie) {
        super(serie);
    }

    @Override
    public String accion() {
        return "Super8";
    }
}

class Snickers extends Dulce {
    public Snickers(int serie) {
        super(serie);
    }

    @Override
    public String accion() {
        return "Snickers";
    }
}
