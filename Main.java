package org.example;
import java.util.ArrayList;

abstract class Bebida{
    private int serie;
    public Bebida(int a){
        this.serie = a;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String beber();

}
class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return "sprite";
    }
}

class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return  "cocacola";
    }
}

abstract class Snacks{
    private int serie;
    public Snacks(int b){
        this.serie=b;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String Comer();
}
class Super8 extends Snacks{
    public Super8(int serie){
        super(serie);
    }

    @Override
    public String Comer() {
        return "Super8";
    }
}
class Snickers extends Snacks{
    public Snickers(int serie){
        super(serie);
    }

    @Override
    public String Comer() {
        return "Snickers";
    }
}

abstract class Moneda{
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor() {
        return 1000;
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
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

    class DepositoSnacks extends DepositoBase<Snacks> {

    }


    class Expendedor {
        public static final int COCA = 1;
        public static final int SPRITE = 2;
        private DepositoBebida CocaCola;
        private DepositoBebida Sprite;
        private DepositoMoneda monVu;
        private final int precio;

        public Expendedor(int a, int b) {
            this.precio = b;
            this.monVu = new DepositoMoneda();
            this.CocaCola = new DepositoBebida();
            this.Sprite = new DepositoBebida();
            for (int i = 0; i < a; i++) {
                CocaCola.add(new CocaCola(100 + i));
                Sprite.add(new Sprite(200 + i));
            }
        }

        public Bebida comprarBebida(Moneda moneda, int y) {
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
                    case SPRITE:
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

        public Comprador(Moneda m, int cualBebida, Expendedor exp) {
            Bebida b = exp.comprarBebida(m, cualBebida);
            if (b != null) {
                sonido = b.beber();
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

