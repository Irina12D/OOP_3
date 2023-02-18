public class Airplane extends Transport {
    private String brand;       // марка судна
    private int flightRange;    // дальность полёта
    private int speedAltitude;  // максимальная скорость на высоте
    private int speedGround;    // максимальная скорость у земли
    private int ceiling;        // максимально достижимая высота полета
    private int wingspan;       // размах крыла
    private int length;         // длина судна
    private int height;         // высота судна
    private int width;          // ширина судна

    public Airplane() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public void setSpeedAltitude(int speedAltitude) {
        this.speedAltitude = speedAltitude;
    }

    public void setSpeedGround(int speedGround) {
        this.speedGround = speedGround;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getBrand() {
        return brand;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getSpeedAltitude() {
        return speedAltitude;
    }

    public int getSpeedGround() {
        return speedGround;
    }

    public int getCeiling() {
        return ceiling;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    protected String getInfo() {
        String about = "Пассажирский самолет " + brand + "\n" +
                       "Основные характеристики: " + "\n" + super.getInfo() + "\n" +
                       "дальность полёта: " + flightRange + "\n" +
                       "максимальная скорость на высоте: " + speedAltitude + "\n" +
                       "максимальная скорость у земли: " + speedGround + "\n" +
                       "максимально достижимая высота полета: " + ceiling + "\n" +
                       "размах крыла " + wingspan + "\n" +
                       "длина судна: " + length + "\n" +
                       "высота судна " + height + "\n" +
                       "ширина судна: " + width;
        return about;
    }
}
