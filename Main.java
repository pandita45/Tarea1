package org.example;
import java.util.ArrayList;
import java.util.Scanner;

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

class Deposito {
    private ArrayList<Bebida> ar;

    public Deposito() {
        ar = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a) {
        ar.add(a);
    }

    public Bebida getBebida() {
        if (ar.size() != 0) {
            return ar.remove(0);
        } else {
            return null;
        }
    }
    public int getStock(){
        return ar.size();
    }
}
class DepositoM {
    private ArrayList<Moneda>am;
    public DepositoM() {
        am = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda m){
        am.add(m);
    }
    public int getSerie(){
        return am.size();
    }
    public Moneda getMoneda(){
        if(am.size()!=0){
            return am.remove(0);
        }
        else{
            return null;
        }
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
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor() {
        return 100;
    }
}
class Expendedor {
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    private Deposito CocaCola;
    private Deposito Sprite;
    private DepositoM monVu;
    private final int precio;
    public Expendedor(int a,int b) {
        this.precio=b;
        this.monVu=new DepositoM();
        this.CocaCola=new Deposito();
        this.Sprite=new Deposito();
        for (int i = 0; i < a; i++) {
            CocaCola.addBebida(new CocaCola(100+i));
            Sprite.addBebida(new Sprite(200+i));
        }
    }
    public Bebida comprarBebida(Moneda moneda, int y) {
        if(moneda!=null){
            switch (y){
                case COCA:{
                    int a=CocaCola.getStock();
                    if(moneda.getValor()>=precio && a!=0){
                        for(int i=0; i< (moneda.getValor()-precio)/100;i++){
                            monVu.addMoneda(new Moneda100());
                        }
                        return CocaCola.getBebida();
                    }
                    else{
                        monVu.addMoneda(moneda);
                        return null;
                    }
                }
                case SPRITE:
                    int b=Sprite.getStock();
                    if(moneda.getValor()>=precio && b!=0){
                        for(int i=0; i< (moneda.getValor()-precio)/100;i++){
                            monVu.addMoneda(new Moneda100());
                        }
                        return Sprite.getBebida();
                    }
                    else{
                        monVu.addMoneda(moneda);
                        return null;
                    }
            }
        }
        monVu.addMoneda(moneda);
        return null;
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m,int cualBebida, Expendedor exp){
        Bebida b= exp.comprarBebida(m,cualBebida);
        if(b!=null){
            sonido=b.beber();
        }
        else{
            sonido=null;
        }
        Moneda mon;
        while((mon= exp.getVuelto())!=null){
            vuelto+= mon.getValor();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        float hola = scanner.nextFloat();

        System.out.println("Hello, " + name + ". You are " + age + " years old.");

        scanner.close();

    }
}
