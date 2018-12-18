public abstract class Person {
    String name , surname;

    public void setNameandSurname(String name , String Surname) {
        this.name = name;
        this.surname = Surname;
    }

    public String getName(){
        return name ;
    }
    public String getSurname(){
        return surname;
    }
}
