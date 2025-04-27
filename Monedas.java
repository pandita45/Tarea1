package org.example;

abstract class Moneda implements Comparable<Moneda>{
    public Moneda() {
    }

    @Override
    public int compareTo(Moneda Moneda) {
        return this.getSerie().compareTo(Moneda.getSerie());
    }

    public String getSerie() {
        return this.toString();
    }

    public abstract int getValor();
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }
    @Override
    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }
    @Override
    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }
    @Override
    public int getValor() {
        return 100;
    }
}