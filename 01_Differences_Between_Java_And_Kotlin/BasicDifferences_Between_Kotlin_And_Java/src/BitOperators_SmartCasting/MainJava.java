package BitOperators_SmartCasting;

public class MainJava {
    public static void main(String[] args) {
        int x=0b10000000;
        int y=0b00000001;
        //1 BITWISE OPERATOR IN JAVA
        //Bitwise operators return numbers when you use numbers represent as itnegers
        //xor ^
        //or |
        //and &
        System.out.println(x^y);
        System.out.println(x|y);
        System.out.println(x&y);
        //2 INSTANCE OF operator
        //Find if a variable is of a certain type by using instanceof operators
        Employee employee=new Employee();
        System.out.println(employee instanceof Employee );

    }

    class Empoloyee{

    }
}
