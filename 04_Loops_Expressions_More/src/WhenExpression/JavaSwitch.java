package WhenExpression;

public class JavaSwitch {

    public static void main(String[] args) {
        int number=200;
        switch(number){
            case 100:
                System.out.println(100);
                break;
            case 200:
                System.out.println(200);
                break;
            default:
                System.out.println("Didn't match anything");
        }
    }
}
