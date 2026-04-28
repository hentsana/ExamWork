package domain;

public class Category {
    private String name;
    private int priorit;

    public Category(String name, int priorityc) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() { return name; }
    public int getPriority() { return priority; }

    public String toString() {
        return "Category name=" + name + ", priority=" + priority; }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category c = (Category) o;
        return name.equals(c.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
