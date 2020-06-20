package ReferentialEquality_Vs_StructuralEquality;

public class EmployeeJava {
    private String name;
    private int id;

    public EmployeeJava(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmployeeJava) {
            return name.equals(((EmployeeJava) obj).name) && id == ((EmployeeJava) obj).id;
        }
        return false;
    }

}
