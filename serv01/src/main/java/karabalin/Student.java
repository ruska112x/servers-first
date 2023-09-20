package karabalin;

import java.util.Objects;

public class Student extends Human {
    private StudentStatus status;
    private Group group;

    public Student(Integer id, String patronymic, String surname, String name, StudentStatus status, Group group) {
        super(id, patronymic, surname, name);
        this.status = status;
        this.group = group;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status=" + status +
                ", group=" + group +
                ", id=" + id +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return status == student.status && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status, group);
    }
}
