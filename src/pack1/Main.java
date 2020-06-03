package pack1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> LinkedList = new ArrayList<>();


        //long start1 = System.nanoTime();

   //     for (int i = 0; i < 100000; i++) {
   //         arrayList.add(0, i);
  //      }
   //     long stop1 = System.nanoTime();
   //     System.out.println("Время выполнения операции вставки в начало" + "ArrayList = " + (stop1 - start1) / 1e9 + "s");


//        long start2 = System.nanoTime();

//        for (int i = 0; i < 100000; i++) {
 //           LinkedList.add(0, i);
//        }
//        long stop2 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "LinkedList = " + (stop2 - start2) / 1e9 + "s");

//        long start3 = System.nanoTime();

 //       for (int i = 0; i < 100000; i++) {
//            arrayList.get(i);
//        }
//        long stop3 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "ArrayList = " + (stop3 - start3) / 1e9 + "s");


//        long start4 = System.nanoTime();

//        for (int i = 0; i < 100000; i++) {
//            LinkedList.get(i);
//        }
//        long stop4 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "LinkedList = " + (stop4 - start4) / 1e9 + "s");

//        long start5 = System.nanoTime();

//        for (int i = 0; i < 100000; i++) {
//            LinkedList.set(i, 100);
//        }
//        long stop5 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "LinkedList = " + (stop5 - start5) / 1e9 + "s");

//        long start6 = System.nanoTime();

//        for (int i = 0; i < 100000; i++) {
//            LinkedList.remove(0);
//        }
//        long stop6 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "LinkedList = " + (stop6 - start6) / 1e9 + "s");

//        long start7 = System.nanoTime();

//        for (int i = 0; i < 100000; i++) {
//            arrayList.set(i, 100);
//        }
//        long stop7 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "ArrayList = " + (stop7 - start7) / 1e9 + "s");

//        long start8 = System.nanoTime();

//        for (int i = 0; i < 100000; i++) {
//            arrayList.remove(0);
//        }
//        long stop8 = System.nanoTime();
//        System.out.println("Время выполнения операции вставки в начало" + "ArrayList = " + (stop8 - start8) / 1e9 + "s");

//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        ArrayList<Integer> arrayList3 = new ArrayList<>();

//        for (int i = 0; i < 10; i++) {
//            arrayList1.add(0, i);
//            arrayList2.add(0, i);
//            arrayList3.add(0, i + 1);
//        }
//        System.out.println("Списки 'List1' и 'List2' равны:" + arrayList1.equals(arrayList2));
//        System.out.println("Списки 'List1' и 'List3' равны:" + arrayList1.equals(arrayList3));



//        ArrayList<User> userList = new ArrayList<User>();

//       User user1 = new User("Sasha", "nick1", 19);
//        User user2 = new User("Anna", "nick2", 27);
//        User user3 = new User("Masha", "nick3", 35);

//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);

//        System.out.println(userList);
//        System.out.println("Сравнение одинаковых пользователей :" +
//                new User("Sasha", "nick1", 19).equals(
//                        new User("Sasha", "nick1", 19)));
//        System.out.println("Сравнение первого и второго пользователя :" +
//                user1.equals(
//                        user2));

//        System.out.println(userList.contains(new User("Anna", "nick2", 27)));
//        userList.remove(new User("Anna", "nick2", 27));

//        System.out.println(userList);

//        ArrayList<User> userList1 = new ArrayList<User>();
//        ArrayList<User> userList2 = new ArrayList<User>();
//        ArrayList<User> userList3 = new ArrayList<User>();

//     userList1.add(new User("Sasha", "nick1", 19));
  //      userList2.add(new User("Sasha", "nick1", 19));
  //      userList3.add(new User("Masha", "nick3", 35));

  //      System.out.println("Сравнение первого и второго пользователя"+ userList1.equals(userList2));
 //       System.out.println("Сравнение первого и третьего пользователя"+ userList1.equals(userList3));

        ArrayList<HashSet> studentsList = new ArrayList<HashSet>();

        HashSet<String> hash = new HashSet<>();
        hash.add("Евсюкова");
        hash.add("Калина");
        hash.add("Огиенко");
        hash.add("Гаевой");
        hash.add("Вдовицька");
        hash.add("Рогинский");
        hash.add("Королович");
        hash.add("Коноверская");
        hash.add("Именниник");
        hash.add("Санжаров");
        hash.add("Топчий");
        hash.add("Трегубов");
        hash.add("Овчаренко");
        System.out.println("фамилии");
        hash.forEach(surname -> System.out.println(surname));
        System.out.println("Фамили, начинающиеся на согласные: ");
        for(String str: hash){
            boolean test = str.matches("^(?i:[АЕЄИІОУЯ]).*");
            if(test) {
                ;
            }
            else{
                System.out.println(str);
            }
        }

        ArrayList<TreeSet> treeSetsList = new ArrayList<TreeSet>();

        TreeSet<String> tree = new TreeSet<>();
        tree.add("Евсюкова");
        tree.add("Калина");
        tree.add("Огиенко");
        tree.add("Гаевой");
        tree.add("Вдовицька");
        tree.add("Рогинский");
        tree.add("Королович");
        tree.add("Коноверская");
        tree.add("Санжаров");
        tree.add("Именниник");
        tree.add("Топчий");
        tree.add("Трегубов");
        tree.add("Овчаренко");

        System.out.println("Вывод первых 3 фамилий :");


        Iterator<String> iterator = tree.iterator();
        int i=0;
        while(iterator.hasNext()){
            while (i<3) {
                String name = iterator.next();
                System.out.println(name);
                i++;
            }
            break;
        }
    }
}

