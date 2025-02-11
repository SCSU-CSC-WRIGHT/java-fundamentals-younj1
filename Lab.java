public class Lab {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("Hello World!");
        //Exercise 2
        int x = 10;
        String message = "The number is ";
        System.out.println(message + x);
        //Exercise 3
        int num = 15;
        if (num % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        //Exercise 4
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //Exercise 5
        System.out.println(greet("Alice"));
        //Exercise 7
        int[] number = {1,2,3,4,5};
        for (int i = 0; i< number.length; i++){
            System.out.println(number[i]);

        }
        //Exercise 8
                try {
                    int results = 10 / 0;
                }
                catch (ArithmeticException e) {
                    System.out.print("Division by zero is not allowed.");
                }

    }
    //Exercise 5
    public static String greet(String name){
        return "Hello " + name + "!";
    }
}
