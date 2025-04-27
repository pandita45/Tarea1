package org.example;

abstract class Bebida extends Producto {
    public Bebida (int a){
        super(a);
    }

    public String accion(){
        return "Bebida";
    }
}

class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }

    public String accion() {
        return "sprite";
    }
}

class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    public String accion() {
        return "cocacola";
    }
}

class Fanta extends Bebida {
    public Fanta(int serie) {
        super(serie);
    }

    public String accion() {
        return "fanta";
    }
}
