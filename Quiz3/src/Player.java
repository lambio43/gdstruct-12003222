import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

    private int id;
    private String name;
    private int level;

    public Player() {
        this.id = ThreadLocalRandom.current().nextInt(1, 60 + 1);
        this.level = ThreadLocalRandom.current().nextInt(40, 200 + 1);
        this.name = "Player" + (id + level);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }
}
