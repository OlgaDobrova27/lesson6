public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] weight = {1, 2, 3,};
        float[] weight2 = {1.57f, 7.654f, 9.986f};
        short[] weight3 = {90, 91, 92, 93};

        // Задание 2

        int[] num = {1, 2, 3,};
        float[] num2 = {1.57f, 7.654f, 9.986f};
        short[] num3 = {90, 91, 92, 93};

        System.out.println(num[0] + "," + num[1] + "," + num[2]);
        System.out.println(num2[0] + "," + num2[1] + "," + num2[2]);
        System.out.println(num3[0] + "," + num3[1] + "," + num3[2] + "," + num3[3]);

        // Задание 3

        int[] one = {1, 2, 3,};
        float[] two = {1.57f, 7.654f, 9.986f};
        short[] three = {90, 91, 92, 93};

        System.out.println(one[2] + "," + one[1] + "," + one[0]);
        System.out.println(two[2] + "," + two[1] + "," + two[0]);
        System.out.println(three[3] + "," + three[2] + "," + three[1] + "," + three[0]);

        // Задание 4

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) one[i] += 1;

        }
    }
}
