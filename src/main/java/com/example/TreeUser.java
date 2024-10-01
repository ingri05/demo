package com.example;

public class TreeUser {
    User root;

    public TreeUser() {
        root = null;
    }

    // Insertar un usuario por su name
    public void insert(String name) {
        root = insertRec(root, name);
    }

    private User insertRec(User root, String name) {
        if (root == null) {
            root = new User(name);
            return root;
        }
        if (name.compareTo(root.name) < 0)
            root.left = insertRec(root.left, name);
        else if (name.compareTo(root.name) > 0)
            root.right = insertRec(root.right, name);

        return root;
    }
    public boolean search(String name) {
        return searchRec(root, name);
    }
    
    private boolean searchRec(User root, String name) {
        if (root == null) {
            return false;
        }
        if (root.name.equals(name)) {
            return true;
        }
        return name.compareTo(root.name) < 0 ? searchRec(root.left, name) : searchRec(root.right, name);
    }

    public void preOrder() {
        preOrderRec(root);
    }
    
    private void preOrderRec(User root) {
        if (root != null) {
            System.out.println(root.name);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    
}

