package java_lang.data_structure.tree;

public class BTree {
    BTreeNode root;
    int t;

    public BTree(int t) {
        this.t = t;
        root = null;
    }

    public void insert(int k) {
        if (root == null) {
            root = new BTreeNode(t, true);
            root.keys.add(k);
        } else {
            if (root.keys.size() == (2 * t - 1)) {
                BTreeNode s = new BTreeNode(t, false);
                s.children.add(0, root);
                s.splitChild(0, root);
                int i = 0;
                if (s.keys.get(0) < k)
                    i++;
                s.children.get(i).insertNonFull(k);
                root = s;
            } else {
                root.insertNonFull(k);
            }
        }
    }

    public boolean search(int k) {
        return (root == null) ? false : root.search(k);
    }

    public void traverse() {
        if (root != null)
            root.traverse();
    }
}