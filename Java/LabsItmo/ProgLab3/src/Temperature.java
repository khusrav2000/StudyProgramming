public class Temperature implements ChangeTemperatureTo{
    int x;

    @Override
    public void ChangeTemperature(int x) {
        this.x = x ;
    }

    @Override
    public int getTemperature() {
        return x ;
    }
}
