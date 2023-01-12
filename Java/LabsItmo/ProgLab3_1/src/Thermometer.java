public class Thermometer {
    public Double measureTemperature(Object person){
        Person person1 = (Person) person;
        return person1.getTemperature();
    }
}
