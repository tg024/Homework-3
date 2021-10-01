package Work;

public class Exercise_3 {
    public static void main(String[] args) {
        Exercise_3 obj1 = new Exercise_3();
        oddNumbers();
        random_1();
        minValue_1();
        Average_1();
    }

    // კენტი რიცხვები 0 დან 30 ის ჩათვლით
    public static void oddNumbers() {
        {
            int number = 30;
            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        }
    }

    //რენდომ რიცხვები 0 დან 100 მდე
    public static void random_1() {
        int min = 1;
        int max = 100;
        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * (max - min)) + min;
            System.out.println(randomNumber);
        }
    }

    //მასივში მინიმალური მნიშვნელობა
    public static void minValue_1() {
        int[] array = {21, 322, 11, -21};
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Minimum value is:" + " " + minValue);
    }

    //მასივის საშუალო არითმეტიკული
    public static void Average_1() {
        double[] arr = {30, 45, 11.2, 22.3, 2};
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("The average is:" + " " + average);
    }
}