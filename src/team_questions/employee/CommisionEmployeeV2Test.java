package team_questions.employee;

/**
 * Created by FreakingM on 10/20/2016.
 */
public class CommisionEmployeeV2Test {
    public static void main(String[]args){
        CommisionEmployeeV2 testObject = new CommisionEmployeeV2("Sue","Jones","222-22-2222",10000,.06);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%s %s%n","first name is",testObject.getFirstName());
        System.out.printf("%s %s%n","last name is",testObject.getLastName());
        System.out.printf("%s %s%n","social security number is",testObject.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","gross sales is",testObject.getGrossSales());
        System.out.printf("%s %.2f%n","commission rate is",testObject.getCommissionRate());

        testObject.setGrossSales(5000);
        testObject.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n","Updated employee infomation obtained by toString",testObject);
    }
}