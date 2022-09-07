package Java2.HW3;

import java.util.Objects;

public class UserBroken {
    private int age;
    private String name2;

    public UserBroken (String name2) {
        this.name2 = name2;
    }

    @Override
    public int hashCode() {
        return 10;
    }
    @Override
    public String toString() {
        return "User{" + "name='" + name2 + '\'' + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBroken that = (UserBroken) o;
        that.name2 = this.name2;
        return true;
    }
}
