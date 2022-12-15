import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount;          //Жабьи глаза
        int ghoulTearsCount;        //Слезы вурдалака
        int ravenBonesCount;        //Кости ворона
        int dumplingsCount;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Для приготовления эликсиров необходимо ввести количество ингредиентов (целые положительные числа)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество жабьих глаз");
        toadEyesCount = scan.nextInt();
        System.out.println("Введите количество слез вурдалака");
        ghoulTearsCount = scan.nextInt();
        System.out.println("Введите количество костей ворона");
        ravenBonesCount = scan.nextInt();
        System.out.println("Введите количество пельменей");
        dumplingsCount = scan.nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда

        boolean isVigilance = false;
        boolean isStrong = false;
        boolean isSecrecy = false;
        boolean isForbidden = false;

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить эликсир зоркости.");
            isVigilance = true;
        } else {
            System.out.println("На эликсир зоркости не хватает ингредиентов!");
        }

        if (ravenBonesCount >= 2 && dumplingsCount >= 4 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить эликсир стойкости.");
            isStrong = true;
        } else {
            System.out.println("На эликсир стойкости не хватает ингредиентов!");
        }

        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить эликсир скрытности.");
            isSecrecy = true;
        } else {
            System.out.println("На эликсир скрытности не хватает ингредиентов!");
        }

        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить Запретный эликсир.");
            isForbidden = true;
        } else {
            System.out.println("На Запретный эликсир не хватает ингредиентов!");
        }

        if (!isVigilance && !isStrong && !isSecrecy && !isForbidden) {
            System.out.println("Не хватает ингредиентов для любого эликсира!");
        }
    }
}