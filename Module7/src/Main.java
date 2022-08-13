public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(69);
        tree.insert(420);
        tree.insert(39);
        tree.insert(9);
        tree.insert(6);
        tree.insert(10);

        //tree.traverseInOrder();

        System.out.println(tree.get(420));
    }
}