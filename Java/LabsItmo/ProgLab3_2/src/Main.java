public class Main {
    public static void main(String[] args){
        Doctor doc1 = new Doctor("Ганнибал" , "Лектор");
        Doctor doc2 = new Doctor("Григори" , "Хаус");
        doc1.knowAboutDoctor(doc2);
        Room room = new Room();
        room.setDoctorForThisRoom(doc1);
        Pharmacy pharmacy = new Pharmacy();
        for(int i = 0 ; i < 4 ; i ++) {
            PrintNumber(i + 1);
            Patient patient = new Patient();
            patient.setPharmacy(pharmacy);
            room.enterTheRoom(patient);
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
