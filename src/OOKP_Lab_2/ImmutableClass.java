package OOKP_Lab_2;

import java.io.Serializable;

public final class ImmutableClass implements Comparable<ImmutableClass>, Serializable {
    private String name;


    public ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableClass that = (ImmutableClass) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(ImmutableClass o) {
        return o.getName().compareTo(getName()); //just an example
    }
}
