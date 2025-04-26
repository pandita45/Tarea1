package org.example;
import java.util.ArrayList;

abstract class Producto {
    private int serie;

    public Producto(int a){
        this.serie = a;
    }

    public int getSerie() {
        return serie;
    }
    public abstract String accion();
}

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

abstract class Moneda {
    public Moneda() {
    }

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }

    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }

    public int getValor() {
        return 100;
    }
}

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

class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA= 3;
    public static final int SUPER8 = 4;
    public static final int SNICKERS= 5;
    private DepositoBebida CocaCola;
    private DepositoBebida Sprite;
    private DepositoBebida Fanta;
    private DepositoDulce Super8;
    private DepositoDulce Snickers;
    private DepositoMoneda monVu;
    private final int precio;

    public Expendedor(int a, int b) {
        this.precio = b;
        this.monVu = new DepositoMoneda();
        this.CocaCola = new DepositoBebida();
        this.Sprite = new DepositoBebida();
        this.Fanta = new DepositoBebida();
        this.Super8 = new DepositoDulce();
        this.Snickers = new DepositoDulce();
        for (int i = 0; i < a; i++) {
            CocaCola.add(new CocaCola(100 + i));
            Sprite.add(new Sprite(200 + i));
            Fanta.add(new Fanta(300 + i));
            Super8.add(new Super8(400 + i));
            Snickers.add(new Snickers(500+i));
        }
    }

    public Producto comprarProducto(Moneda moneda, int y) {
        if (moneda != null) {
            switch (y) {
                case COCA: {
                    int a = CocaCola.getStock();
                    if (moneda.getValor() >= precio && a != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return CocaCola.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case SPRITE: {
                    int b = Sprite.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Sprite.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case FANTA: {
                    int b = Fanta.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Fanta.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case SUPER8: {
                    int b = Super8.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Super8.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case SNICKERS: {
                    int b = Snickers.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Snickers.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
            }
        }
        monVu.add(moneda);
        return null;
    }

    public Moneda getVuelto() {
        return monVu.get();
    }
}

class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int NumPad, Expendedor exp) {

        Producto b = exp.comprarProducto(m,NumPad);
        if (b != null) {
            sonido = b.accion();
        } else {
            sonido = null;
        }
        Moneda mon;
        while ((mon = exp.getVuelto()) != null) {
            vuelto += mon.getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
