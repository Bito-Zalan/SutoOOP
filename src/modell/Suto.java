package modell;


public class Suto {

    public boolean toString;

    public enum Uzemmod {
        SÜTÉS,GRILLEZÉS
    }
    
    public enum Szinek {
        PIROS,ZÖLD
    }
    
    private static final String RED = "\u001B[31m";
    
    private int homerseklet;
    private boolean bekapcsolva;
    private final int maxHomerseklet = 200;
    
    private Uzemmod uzemmod;
    private String uzemmodSzoveg;
    private Szinek szin;
    private String szinKod;
    private String szinSzoveg;
    
    public Suto(){
        this(40);
    }
    public Suto(int homerseklet){
        this(40, Uzemmod.GRILLEZÉS, Szinek.PIROS);
    }
    
    public Suto(int homerseklet, Uzemmod uzemmod, Szinek szin){
        this.homerseklet = homerseklet;
        this.uzemmod = uzemmod;
        this.szin = szin;
        
        switch (szin) {
            case PIROS:
                    this.szinSzoveg ="piros";
                    this.szinKod = Suto.RED;
                break;
           
        }
        switch (uzemmod) {
            case GRILLEZÉS:
                    this.uzemmodSzoveg = "//";
                break;
        }
         
        
        
    }
    public int getHomerseklet() {
        return homerseklet;
    }
    public boolean isBekapcsolva(){
        return bekapcsolva;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }
    public String adatKiIr(){
        return String.format("Grill: // \nMelegentart: MT\n Sütés: ?"
                + "\nÜzemmód: %s \n Szinszöveg: %s",this.uzemmod,this.szinKod);
    }

    @Override
    public String toString() {
        return "Suto{" + "homerseklet=" + homerseklet + ", bekapcsolva=" + bekapcsolva + ", maxHomerseklet=" + maxHomerseklet + ", uzemmod=" + uzemmod + ", uzemmodSzoveg=" + uzemmodSzoveg + ", szin=" + szin + ", szinKod=" + szinKod + ", szinSzoveg=" + szinSzoveg + '}';
    }
    
    
}
