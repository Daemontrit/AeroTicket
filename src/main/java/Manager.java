import java.util.Arrays;

public class Manager {
    Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] tickets = new Ticket[0];

        for (Ticket ticket : repo.findAll()) {
            if ((ticket.getAeroDeparture().equals(from)) && (ticket.getAeroArrival().equals(to))) {
                Ticket[] tmp = new Ticket[tickets.length + 1];
                for (int i = 0; i < tickets.length; i++) {
                    tmp[i] = tickets[i];
                }
                tmp[tmp.length - 1] = ticket;
                tickets = tmp;
            }
        }
        Arrays.sort(tickets);
        return tickets;
    }

    public void add(Ticket ticket) {
        repo.add(ticket);
    }
}
