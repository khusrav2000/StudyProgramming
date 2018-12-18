import javax.security.sasl.SaslServer;
import java.util.ArrayList;

public class Pharmacy {
    public String[] buypreparetion(ArrayList<Lekarstvo> namepreparetions){
        System.out.println("Сейчас найду то что вам нужно");
        System.out.println("Вот ваши лекарство");
        CreatChek creatChek = new CreatChek();
        String[] chek = creatChek.creatChek(namepreparetions);

        pharmacistSayBye(creatChek.getTotalPrice());
        return chek;
    }
    public void pharmacistSayHello(){
        System.out.println("Здравствуйте, Чем могу помоч");
    }
    public void pharmacistSayBye(Double totalPrice){
        System.out.print("С вас ");
        System.out.print(totalPrice);
        System.out.println(" Рублей");
        System.out.println("Ваш чек");
        System.out.println("Спасибо за покупку");
    }
}
