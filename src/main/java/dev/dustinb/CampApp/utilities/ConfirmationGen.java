package dev.dustinb.CampApp.utilities;

public class ConfirmationGen {

    //creates 10 character confirmation code
    public static String getConfirmationCode(){

        String confirmationCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder stringBuilder = new StringBuilder(10);

        for(int i = 0; i < 10; i++){
            int index = (int) (confirmationCharacters.length()*Math.random());
            stringBuilder.append(confirmationCharacters.charAt(index));

        }
        return stringBuilder.toString();
    }
}
