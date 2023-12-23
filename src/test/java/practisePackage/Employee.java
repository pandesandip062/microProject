package practisePackage;

import java.io.Serializable;

public class Employee implements Serializable {
   private static final long serialVersionUID = -8316380005289388388L;
    private int id;
    private String name;
    private int sal;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
