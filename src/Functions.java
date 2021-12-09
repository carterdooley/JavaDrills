public class Functions {
    public static void main(String[] args){
    helloWorld();
    greeting("Carter");
    add(1,2);
    favColor("black");
    oddIndeed(5);
    }



    private static void helloWorld(){
        System.out.println("Hello World");
    }


    private static void greeting(String name){
        System.out.println("Hello, " + name);
    }

    private static <Int> float add(float num1, float num2) {
        float result = num1 + num2;
        System.out.println(result);
        return result;
    }

    private static void favColor(String color){
        if(color.equals("red") || color.equals("Red")){
            System.out.println("Red is a great color");
        } else if (color.equals("green") || color.equals("Green")){
            System.out.println("Green is a solid color");
        } else if (color.equals("black")|| color.equals("Black")){
            System.out.println("So trendy");
        } else {
            System.out.println("You need a new favorite color");
        }
    }



    private static void oddIndeed(float num){
        if (num % 2 == 0){
            System.out.println("That's not odd");
        } else {
            System.out.println("Odd indeed...");
        }
    }

}




