package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
//        (e.g.: given -> 489, expected -> 984
        int newNumber = 0;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            int reminder = number % 10;
            newNumber += (int) (reminder * Math.pow(10, (2 - i)));
            number /= 10;

        }

        System.out.println(newNumber);
    }
}
