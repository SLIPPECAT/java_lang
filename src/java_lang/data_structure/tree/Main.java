package java_lang.data_structure.tree;

public class Main {
    public static void main(String[] args) {
        BTree bTree = new BTree(3);

        bTree.insert(10);
        bTree.insert(20);
        bTree.insert(5);
        bTree.insert(6);
        bTree.insert(12);
        bTree.insert(30);

        System.out.println("B 트리 순회 결과: ");
        bTree.traverse();

        int searchKey = 6;
        System.out.println("\n\n" + searchKey + "를 찾았나요? " + bTree.search(searchKey));
    }
}
