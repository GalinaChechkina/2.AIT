package practice.todolist_appl.model;

import java.io.Serializable;

public enum Menu implements Serializable {
    ADD(1, "Add task"), LIST(2, "List of tasks"),
    REMOVE(3, "Remove task"), SAVE(4, "Save"),
    LOAD(5, "Load"), EXIT(6, "Exit");


    private int menuItem;
    private String action;


    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }


    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        System.out.println();
    }
}
