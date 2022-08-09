public class Main {
    public static void main(String[] args) {

        Player ploo = new Player(12,"Plooful", 135);
        Player Tarik = new Player(54,"Tar1k", 419);
        Player Stewie = new Player(45,"Stewie2k", 200);
        Player You = new Player(68,"Yousoru", 213);
        Player Soulja = new Player(39,"Crank Dat", 195);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(ploo.getUserName(), ploo);
        hashTable.put(Tarik.getUserName(), Tarik);
        hashTable.put(Stewie.getUserName(), Stewie);
        hashTable.put(You.getUserName(), You);
        hashTable.put(Soulja.getUserName(), Soulja);

        //hashTable.printHashTable();

        System.out.println(hashTable.get("Yousoru"));
    }
}