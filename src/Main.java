public class Main {
    public static void main(String[] args) {
        String firstName = "Boba";
        String lastName = "Fett";
//    Year in BBY
        int birthYear = 32;
        String birthWorld = "Kamino";
//    Height in Meters
        float charHeight = 1.83f;
//    Weight in kilograms
        int charWeight = 78;
        float purse = 150.0f;

//        Shopping spree
        float driod = 24.3f;
        float boots = 45f;

        purse -= driod;
        purse -= boots;
        purse *= 2;
        float aTenth = (purse / 10);
        purse -= aTenth;
        System.out.println(purse);
//    LightSaber Part 3
    String bladeColor = "purple";
    String handleColor = "black";

    if (bladeColor == "purple" && handleColor == "black"){
        System.out.println("This is the one");
    } else {
        System.out.println("Pass");
    }

//  Spaceship
    String shipName = "Mellenium Falcon";

    if(shipName == "Mellenium Falcon"){
        System.out.println("Let's go");
    } else {
        System.out.println("I better hide somewhere");
    }


    }
}


