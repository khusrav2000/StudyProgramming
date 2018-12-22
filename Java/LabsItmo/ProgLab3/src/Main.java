public class Main {
    public static void main(String[] args){
        Doctor doc = new Doctor();
        Pharmacy pharmacy = new Pharmacy();
        for(int i = 0 ; i < 4 ; i ++) {
            PrintNumber(i + 1);
            Patient patient = new Patient();
            patient.setPharmacy(pharmacy);
            patient.say_hello();
            doc.AskName();
            patient.Say_Name();
            doc.measure_temperature(patient);
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
    public static void PrintNumber(int i){
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("Пациент номер ");
        System.out.print(i);
        System.out.println(" на сегодня");
        System.out.println();
    }
}
