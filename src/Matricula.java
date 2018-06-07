import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Matricula {

    public static final int PREUXCREDIT = 15;
    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";
    private int curs = 0;
    private Collection assignatures;

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.curs = curs;
        this.assignatures = assignatures;
    }
//  @return int This returns multiplied of credits and PREUXCREDIT
    public float costMatricula(){

        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * PREUXCREDIT;
        return cost;
    }

}