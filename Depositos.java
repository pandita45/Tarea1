package org.example;
import java.util.ArrayList;

abstract class DepositoBase<item> {
    protected ArrayList<item> Deposito;

    public DepositoBase() {
        Deposito = new ArrayList<>();
    }

    public void add(item a) {
        Deposito.add(a);
    }

    public item get() {
        if (Deposito.size() != 0) {
            return Deposito.remove(0);
        } else {
            return null;
        }
    }

    public int getStock() {
        return Deposito.size();
    }
}

class DepositoBebida extends DepositoBase<Bebida> {
}

class DepositoMoneda extends DepositoBase<Moneda> {
}

class DepositoDulce extends DepositoBase<Dulce> {
}
