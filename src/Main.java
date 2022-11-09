public class Main {
    public static void main(String[] args) {
        // Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 –
        // с помощью ключевого слова new.
        int[] vegetables = new int[3];
        vegetables[0] = 1;
        vegetables[1] = 2;
        vegetables[2] = 3;
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –
        // сразу заполнив его значениями.
        double[] fruit = {1.57, 7.654, 9.986};
        //Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого
        // слова или сразу заполненный элементами.
        int[] childHeight = {82, 83, 84, 85, 87, 88, 89, 91, 94, 99};
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех
        // трех массивов, начиная с первого элемента, через запятую.
        // Запятая между последним элементом одного массива и первым элементом
        // следующего не нужна.
        System.out.println("Task2");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.print(vegetables[i]);
            if (i != vegetables.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fruit.length; i++) {
            System.out.print(fruit[i]);
            if (i != fruit.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < childHeight.length; i++) {
            System.out.print(childHeight[i]);
            if (i != childHeight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // 3 задача
        //Теперь ваша задача – распечатать все элементы всех трех массивов,
        // но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы
        // одного массива располагаются на одной строчке, а элементы другого
        // массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом
        // следующего не нужна.
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //1.57, 7.654, 9.986
        //*произвольные элементы третьего массива*
        //То в третьем задании результат должен быть
        // 3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*
        System.out.println("Task 3");
        for (int i = vegetables.length - 1; i >= 0; i--) {
            System.out.print(vegetables[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fruit.length - 1; i >= 0; i--) {
            System.out.print(fruit[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = childHeight.length - 1; i >= 0; i--) {
            System.out.print(childHeight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //### 4 задача
        //
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в
        // нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом,
        // поэтому для решения задания вам нужно использовать циклы.
        //
        //Распечатайте результат преобразования в консоль.
        System.out.println("Task 4");
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i] % 2 != 0) {
                vegetables[i] += 1;
            }
            System.out.println(vegetables[i]);
        }
    }
}