public class CargoPlane extends Airplane {
    private int capacity;   // максимальная грузоподъемность
    private int volume;     // максимальный объём

    public CargoPlane() {
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    protected String getInfo() {
        String enter = "\n";
        String result =  super.getInfo() + enter +
                "Технические характеристики грузового судна: " + enter +
                "максимальная грузоподъемность: " + capacity + enter +
                "Максимальный объём : " + volume;
        return result;
    }
}
