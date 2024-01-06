package practice.gencomp;

public enum Menu {
    ADD(1, "Add employee gender"), ACTIVEREPORTS(2, "View the report"),
    PRINTLIST(3,"Print List"),EXIT(4, "Exit");

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

