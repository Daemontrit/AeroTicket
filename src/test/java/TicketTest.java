import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    public void testSotrTicket() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);
        Ticket ticket = new Ticket(1, 100, "Moscow", "Kaluga", 120);
        Ticket ticket1 = new Ticket(2, 1444, "Moscow", "Kaluga", 120);
        Ticket ticket2 = new Ticket(3, 1444, "Moscow", "Kaluga", 120);
        Ticket ticket3 = new Ticket(4, 55, "Moscow", "Kaluga", 120);
        Ticket ticket4 = new Ticket(5, 1231231, "Sibir", "Kaluga", 120);
        manager.add(ticket);
        manager.add(ticket4);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);

        Ticket[] actual = manager.findAll("Moscow", "Kaluga");
        Ticket[] expected = {ticket3, ticket, ticket1, ticket2};
        Assertions.assertArrayEquals(expected, actual);
    }
}
