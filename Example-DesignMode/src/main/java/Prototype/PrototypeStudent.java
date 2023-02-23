package Prototype;

/**
 * 原型模式示例
 *
 * @author DiiD
 */
public class PrototypeStudent {
    private int id;
    private String name;
    private int score;

    public PrototypeStudent copy() {
        PrototypeStudent prototypeStudent = new PrototypeStudent();
        prototypeStudent.id = id;
        prototypeStudent.name = name;
        prototypeStudent.score = score;
        return prototypeStudent;
    }

    public PrototypeStudent() {

    }

    public PrototypeStudent(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "PrototypeStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
