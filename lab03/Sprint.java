import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int timeCapacity;
    private int ticketLimit;
    private List<Ticket> tickets;

    public Sprint(int timeCapacity, int ticketLimit) {
        this.timeCapacity = timeCapacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return addTicket(bugReport);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted() || tickets.size() >= ticketLimit 
            || getTotalEstimate() + ticket.getEstimate() > timeCapacity) {
            return false;
        }
        tickets.add(ticket);
        return true;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets); // Захищена копія
    }

    public int getTotalEstimate() {
        int totalEstimate = 0;
        for (Ticket ticket : tickets) {
            totalEstimate += ticket.getEstimate();
        }
        return totalEstimate;
    }
}
