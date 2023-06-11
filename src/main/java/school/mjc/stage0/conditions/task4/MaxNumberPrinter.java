package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        if(first > second || first > third){
            System.out.println("The greatest number is : " + "" + first);
        } else if(second > first || second > third){
            System.out.println("The greatest number is : " + "" + second);
        } else if(third > first || third > second){
            System.out.println("The greatest number is : " + "" + third);
        } else if(first == second && first == third){
            System.out.println("They are equal");
        }

    }
}
