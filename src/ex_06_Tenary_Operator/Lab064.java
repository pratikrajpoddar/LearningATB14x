package ex_06_Tenary_Operator;

public class Lab064 {
    public static void main(String[] args) {
        int age = 25;
        String result = (age>18) ? (age >=25? "You can drive" :"Not drive"):"No";
        System.out.println(result);
    }
}
