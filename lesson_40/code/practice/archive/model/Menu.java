package practice.archive.model;

public enum Menu {
    // Mеню с функциями:
    //  -  добавить документ (запрос id документа, id папки, названия документа,
    //       url, присвоение текущей даты и времени)
    //  -  показать список всех документов в архиве
    //  -  узнать количество хранимых документов в архиве
    //  -  выход

    ADD(1, "Add"),SHOWLIST(2, "Show List"),
    QUANTITY(3, "Quantity"), EXIT(4, "Exit");
    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public static void printMenu(){
        System.out.println();
        Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i] + " | ");
        }
        System.out.println();
    }
}
