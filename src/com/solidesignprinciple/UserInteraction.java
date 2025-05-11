package com.solidesignprinciple;

import java.util.ArrayList;
import java.util.List;

// Interface for ListManager
interface ListManager {
    void add(String s);
    void show();
}

// Class responsible for managing the list
class ArrayListManager implements ListManager {
    private List<String> list;

    public ArrayListManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(String s) {
        if (s != null && !s.isEmpty()) {
            list.add(s);
        } else {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void show() {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

// Class responsible for user interaction
class UserInteraction {
    private ListManager listManager;

    public UserInteraction(ListManager listManager) {
        this.listManager = listManager;
    }

    public void performOperations() {
        listManager.add("Hello");
        listManager.add(null);
        listManager.show();
    }

    public static void main(String[] args) {
        ListManager listManager = new ArrayListManager();
        UserInteraction ui = new UserInteraction(listManager);
        ui.performOperations();
    }
}
