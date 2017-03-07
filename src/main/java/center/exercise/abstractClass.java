package center.exercise;

/**
 * Created by ZW on 2017/3/7.
 */
public abstract class abstractClass {
    public abstractClass(String name) {
        this.name = name;
    }

    public abstractClass() {

    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean marry();

    public abstract boolean house();
}
