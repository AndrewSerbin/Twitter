package ua.com.andrewserbin.domain;

public class User {

    private String name;
    private Timeline timeline;

    public User() {
    }

    public User(String name, Timeline timeline) {
        this.name = name;
        this.timeline = timeline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return timeline != null ? timeline.equals(user.timeline) : user.timeline == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (timeline != null ? timeline.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", timeline=" + timeline +
                '}';
    }
}
