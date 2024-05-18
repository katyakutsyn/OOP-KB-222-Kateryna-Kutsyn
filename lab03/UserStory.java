import java.util.ArrayList;
import java.util.List;

public class UserStory extends Ticket {
    private List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies != null ? new ArrayList<>(dependencies) : new ArrayList<>();
    }

    @Override
    public void complete() {
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {
                return; // Не можна завершити, поки залежності не завершені
            }
        }
        super.complete();
    }

    public List<UserStory> getDependencies() {
        return new ArrayList<>(dependencies); // Захищена копія
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
