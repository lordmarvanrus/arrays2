public class homework {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // 1 задание
        System.out.println("1 задание");
        int expenses = 0;
        for (int i = 0; i < arr.length; i++) {
            expenses = expenses + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + expenses + " рублей");
        // 2 задание
        int max = 0;
        int min = 1_000_000;
        System.out.println("2 задание");
        for (int i = 0; i < arr.length; i++) {
                if (max < arr[i] - 1) {
                    max = arr[i];
                }
                if (min > arr[i] - 1) {
                    min = arr[i];
                }
            }
            System.out.println("Минимальная сумма расходов составила " + min + " рублей");
            System.out.println("Максимальная сумма расходов составила " + max + " рублей");
        // 3 задание
        System.out.println("3 задание");
        double averageExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            averageExpenses = averageExpenses + arr[i];
        }
        System.out.println("Средняя сумма расходов составила " + (averageExpenses / arr.length) + " рублей");
        // 4 задание
        System.out.println("4 задание");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char letter = 'a';
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            }

        }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
