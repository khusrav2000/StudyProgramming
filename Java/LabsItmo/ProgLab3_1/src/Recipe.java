import java.util.ArrayList;
public class Recipe {
    ArrayList<Medicaments> medicaments = new ArrayList<>();
    void toPrescribeMedication(Object medicament){

        medicaments.add((Medicaments) medicament);
    }
    public ArrayList<Medicaments> getMedicaments(){
        return medicaments;
    }
}
