public class Car extends Transport{
    private String brand;   // модель
    private String body;    // тип кузова
    /*
        Типы кузова:
            седан
            универсал
            хэтчбек
            кабриолет
            купе
            пикап
            внедорожник
            минивэн
    */
    private int doors;      // количество дверей
    private int seats ;     // количество мест
    private int clearance;  // клиренс
    private int price;      // цена

    public Car(int year, int weight, int speed, int power, String color, String VIN, String brand, String body, int doors, int seats, int clearance) {
        super(year, weight, speed, power, color, VIN);
        this.body = brand;
        this.body = body;
        this.doors = doors;
        this.seats = seats;
        this.clearance = clearance;
    }

    public String getBrand() {
        return brand;
    }

    public String getBody() {
        return body;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public int getClearance() {
        return clearance;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    @Override
    protected String getInfo() {
        String enter = "\n";
        String result = "Автомобиль " + brand + enter +
                "Основные характеристики: " + enter + super.getInfo() + enter +
                "тип кузова: " + body + enter +
                "количество дверей: " + doors + enter +
                "мест в салоне:  " + seats + enter +
                "клиренс " + clearance + enter +
                "стоимость: " + price;
        return  result;
    }
}
