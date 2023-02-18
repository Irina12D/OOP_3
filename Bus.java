public class Bus extends Transport{
    private String purpose; // назначение: городские, междугородние, аэродромные, туристические ...
    private int capacity;   // пассажировместимость
    private int floors;     // количество этажей
    private int dimensions; // типы по габаритам
    /*
        По габаритам:
            1 - Особо малые (4.5 — 6 м)
            2 - Малые (7 — 7.5 м)
            3 - Средние (8 — 9.5 м)
            4 - Большие (10 — 11 м)
            5 - Особо большие (12 — 17 м)
    */
    private int engine;     // типы двигателей
    /*
        двигатели:
            1 - дизельные
            2 - бензиновые
            3 - газовые
            4 - электродвигатель
     */

    public Bus(int year, int weight, int speed, int power, String color, String VIN, String purpose, int capacity, int floors, int dimensions, int engine) {
        super(year, weight, speed, power, color, VIN);
        this.purpose = purpose;
        this.capacity = capacity;
        this.floors = floors;
        this.dimensions = dimensions;
        this.engine = engine;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloors() {
        return floors;
    }

    public int getDimensions() {
        return dimensions;
    }

    public int getEngine() {
        return engine;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    protected String getInfo() {
        String enter = "\n";
        String classDimensions ="";
        switch (dimensions) {
            case 1: classDimensions = "особо малый"; break;
            case 2: classDimensions = "малый"; break;
            case 3: classDimensions = "средний"; break;
            case 4: classDimensions = "большой"; break;
            case 5: classDimensions = "особо большой";
        }
        String classEngine = "";
        switch (engine) {
            case 1: classEngine = "дизельный"; break;
            case 2: classEngine = "бензиновый"; break;
            case 3: classEngine = "газовый"; break;
            case 4: classEngine = "электродвигатель";
        }

        String result = "Автобус назначения " + purpose + enter +
                "Основные характеристики: " + enter + super.getInfo() + enter +
                "пассажировместимость: " + capacity + enter +
                "количество этажей: " + floors + enter +
                "класса " + classDimensions + enter +
                "тип силового узла " + classEngine;
        return  result;
    }
}
