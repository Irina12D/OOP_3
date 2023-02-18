public class Transport {
    private int year;       // год выпуска
    private int weight;     // масса транспортного средства
    private int speed;      // максимально допустимая скорость
    private int power;      // мощность двигателя
    private String color;   // цвет
    private String VIN;     // идентификационный номер

    protected Transport(){

    }
    protected Transport (int year, int weight, int speed, int power, String color, String VIN){
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.power = power;
        this.color = color;
        this.VIN = VIN;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected void setVIN(String VIN) {
        this.VIN = VIN;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getYear() {
        return year;
    }

    protected String getVIN() {
        return VIN;
    }

    public int getWeight() {
        return weight;
    }

    protected int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    protected String getColor() {
        return color;
    }

    protected String getInfo(){
        String info = "year of release: " + year + "\n" +
                      "weight: " + weight + "\n" +
                      "maximum speed: " + speed + "\n" +
                      "engine power: " + power + "\n" +
                      "color: " + color;
        return info;
    }
}
