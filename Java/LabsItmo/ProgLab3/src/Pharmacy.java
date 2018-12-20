
import java.util.ArrayList;

public class Pharmacy{
    public String[] buypreparetion(PharmacyInterface pharmasist , ArrayList<Lekarstvo> namepreparetions){
        System.out.println("Сейчас найду то что вам нужно");
        System.out.println("Вот ваши лекарство");
        CreatChek creatChek = new CreatChek();
        String[] chek = creatChek.creatChek(namepreparetions);
        pharmasist.pharmacistSayBye(creatChek.getTotalPrice());
        return chek;
    }

}
