public class ConditionalStat {
    public static void main(String[] args) {
        int age = 16;
        if(age>19){
            System.out.println("You Can Voe , Drive");
        }
        if(age>13 && age<18){
            System.out.println("teenages");
        }
        else{
            System.out.println("Enter Correct Age");
        }
    }
}
