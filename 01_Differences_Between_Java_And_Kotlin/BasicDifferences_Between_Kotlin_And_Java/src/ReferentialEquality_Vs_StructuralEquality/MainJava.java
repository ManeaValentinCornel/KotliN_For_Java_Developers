package ReferentialEquality_Vs_StructuralEquality;

public class MainJava {
    public static void main(String[] args) {

        EmployeeJava employee1=new EmployeeJava("Mary",1);
        EmployeeJava employee2=new EmployeeJava("John",2);
        EmployeeJava employee3=new EmployeeJava("John",3);
        //1 REFERENTIAL EQUALITY
        //Equals(==))operator checks for referential equality, which means is going to return true if:
        //the instance on the left hand side is exact the same instance as the one on the right hand side
        System.out.println(employee1==employee2);//false
        System.out.println(employee2==employee3);//false
        //2 STRUCTURAL EQUALITY
        //.equals() method check the content of the object, more concise checks the structural equality of 2 objects
        System.out.println(employee1.equals(employee2));//false
        System.out.println(employee2.equals(employee3));//true
    }
}
