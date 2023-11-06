package practice.todolist_appl.model;

public enum Menu {
    ADD(1, "Add"),SHOWLIST(2, "Show List"),
    REMOVE(3, "Remove"), EXIT(4, "Exit");

    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }


    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i] + " | ");
        }
        System.out.println();
    }
}
