public class PassengerPlane extends Airplane {
    private int seats;          // количество кресел
    private double сhairPitch;  // шаг кресел
    private boolean isLuggage;          // наличие багажного отсека

    public PassengerPlane() {
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setСhairPitch(double сhairPitch) {
        this.сhairPitch = сhairPitch;
    }

    public void setLuggage(boolean luggage) {
        isLuggage = luggage;
    }

    public int getSeats() {
        return seats;
    }

    public double getСhairPitch() {
        return сhairPitch;
    }

    public boolean isLuggage() {
        return isLuggage;
    }
    @Override
    protected String getInfo() {
        String enter = "\n";
        String text = (isLuggage)? "есть": "нет";
        String result =  super.getInfo() + enter +
                "Пассажирский салон: " + enter +
                "количество кресел: " + seats + enter +
                "шаг кресел (см): " + сhairPitch + enter +
                "наличие багажного отсека (кроме полок над креслом): " + text;
        return result;
    }
}
