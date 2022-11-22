package utils;

public class RandomRating {


    public static String getRandomRating() {
        int min = 0;
        int max = 10;
        int random = (int) (Math.random() * (max - min + 1)) + min;
        return String.valueOf(random);
    }

}
