import java.util.ArrayList;

public class Assignatura {
    public long id = 0;
    private String nom = "";
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    public static void main(String[] args) {
        mainexported();
    }

    private static void mainexported() {
        Assignatura ass1 = new Assignatura(1,"Xarxes",150,6,true);
        Assignatura ass2 = new Assignatura(2,"Sistemes Operatius",100,4,true);
        Assignatura ass3 = new Assignatura(2,"Entorns",75,3,true);
        ArrayList<Assignatura> assignatures = new ArrayList<Assignatura>();
        assignatures.add(ass1);
        assignatures.add(ass2);
        assignatures.add(ass3);
        Matricula prova = new Matricula(2018090103, "Josep", "Garcia Marti", "12345678X", 1, assignatures);
        System.out.print("Cost de la matricula " + prova.costMatricula());
    }
}
