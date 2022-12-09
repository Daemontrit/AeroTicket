public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int price;
    protected String aeroDeparture;
    protected String aeroArrival;
    protected int time;


    public String getAeroDeparture() {
        return aeroDeparture;
    }


    public String getAeroArrival() {
        return aeroArrival;
    }


    public Ticket(int id, int price, String aeroDeparture, String aeroArrival, int time) {
        this.id = id;
        this.price = price;
        this.aeroDeparture = aeroDeparture;
        this.aeroArrival = aeroArrival;
        this.time = time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        }
        return 0;
    }
}
