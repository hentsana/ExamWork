package domain;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;;

public abstract class MainDomain {
    public int id;

    public MainDomain() {
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
