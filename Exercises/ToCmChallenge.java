public class ToCmChallenge {
    public static double convertToCentimeters(int inchesHeight) {
        // 1 inch: 2,54 cm = inchesHeight : x
        double cmHeight = (inchesHeight*2.54);
        return cmHeight;

        
    }

    public static double convertToCentimeters(int feetHeight, int inchesRemainder) {
        //convert feet and inches to just inches
        // 1 feet : 12 inches = feetHeight : x
        int totalInches = inchesRemainder + feetHeight*12;
        double res = convertToCentimeters(totalInches);
        return res;

    }

}
