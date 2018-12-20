public class pharmasist implements PharmacyInterface {
    @Override
    public void pharmacistSayHello(){
        System.out.println("Здравствуйте, Чем могу помоч");
    }
    @Override
    public void pharmacistSayBye(Double totalPrice){
        System.out.print("С вас ");
        System.out.print(totalPrice);
        System.out.println(" Рублей");
        System.out.println("Ваш чек");
        System.out.println("Спасибо за покупку");
    }
}
