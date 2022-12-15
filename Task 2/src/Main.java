public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int count = 0;
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Уволен айтишник с id " + i);
            count++;
        }
        System.out.println("Всего уволено " + count + " сотрудников");
        System.out.println();

        // решение с помощью while
        int team = 2;
        int count2 = 0;
        while (team <= 100) {
            System.out.println("Уволен айтишник с id " + team);
            team += 2;
            count2 ++;
        }
        System.out.println("Всего уволено " + count2 + " сотрудников");
    }
}
