package java_lang.data_structure.tree;

import java.util.ArrayList;
import java.util.List;

class BTreeNode {
    List<Integer> keys;
    int t;
    List<BTreeNode> children;
    boolean leaf;

    public BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        keys = new ArrayList<>();
        children = new ArrayList<>();
    }

    public int searchKey(int k) {
        int idx = 0;
        while (idx < keys.size() && keys.get(idx) < k)
            idx++;
        return idx;
    }

    public void insertNonFull(int k) {
        int i = keys.size() - 1;
        if (leaf) {
            keys.add(k);
            while (i >= 0 && keys.get(i) > k) {
                int temp = keys.get(i);
                keys.set(i, keys.get(i + 1));
                keys.set(i + 1, temp);
                i--;
            }
        } else {
            while (i >= 0 && keys.get(i) > k)
                i--;
            if (children.get(i + 1).keys.size() == (2 * t - 1)) {
                splitChild(i + 1, children.get(i + 1));
                if (keys.get(i + 1) < k)
                    i++;
            }
            children.get(i + 1).insertNonFull(k);
        }
    }

    public void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.t, y.leaf);
        keys.add(i, y.keys.get(t - 1));
        for (int j = 0; j < t - 1; j++)
            z.keys.add(j, y.keys.get(j + t));
        if (!y.leaf) {
            for (int j = 0; j < t; j++)
                z.children.add(j, y.children.get(j + t));
        }
        y.keys.subList(t - 1, y.keys.size()).clear();
        y.children.subList(t, y.children.size()).clear();
        children.add(i + 1, z);
    }

    public void traverse() {
        int i;
        for (i = 0; i < keys.size(); i++) {
            if (!leaf)
                children.get(i).traverse();
            System.out.print(keys.get(i) + " ");
        }
        if (!leaf)
            children.get(i).traverse();
    }

    public boolean search(int k) {
        int i = 0;
        while (i < keys.size() && k > keys.get(i))
            i++;
        if (keys.contains(k))
            return true;
        if (leaf)
            return false;
        return children.get(i).search(k);
    }
}