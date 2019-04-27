package ru.job4j.tracker;

public class StartUI {
    private static final String ADD = "0";
    private static final String SHOW_ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FIND_ID = "4";
    private static final String FIND_NAME = "5";
    private static final String EXIT = "6";
    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();
            } else if (SHOW_ALL.equals(answer)) {
                this.findAllItem();
            } else if (EDIT.equals(answer)) {
                  this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FIND_ID.equals(answer)) {
                this.findId();
            } else if (FIND_NAME.equals(answer)) {
                this.findName();
//              Добавить остальные действия системы по меню.
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long created = System.currentTimeMillis();
        Item item = new Item(name, desc, created);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void findAllItem() {
        System.out.println("------------ Вывод на экран всех заявок --------------");
        Item[] item = tracker.findAll();
        if (item.length == 0) {
            System.out.println("----------------Заявок не найдено!!!------------------");
        } else {
            for (int i = 0; i < item.length; i++) {
                System.out.println("Заявка №" + (i + 1) + " " + item[i].getName()
                                    + " " + item[i].getDecs() + " " + item[i].getId());
            }
        }
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long created = System.currentTimeMillis();
        Item result = new Item(name, desc, created);
        result.setId(id);
        if (tracker.replace(id, result)) {
            System.out.println("------------Заявка изменена--------------");
        } else {
            System.out.println("------------Заявка не изменена--------------");
        }
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        if (tracker.delete(id)) {
            System.out.println("------------Заявка удалена--------------");
            } else {
            System.out.println("------------Заявка не удалена-----------");
        }
    }

    private void findId() {
        System.out.println("------------ Поиск заявки по ID--------------");
        String id = this.input.ask("Введите id заявки :");
        Item itemId = tracker.findById(id);
        if (itemId != null && id.equals(itemId.getId())) {
            System.out.println("Найденная заявка " + itemId.getName()
                        + " " + itemId.getDecs() + " " + itemId.getId());
        } else {
            System.out.println("Заявка с таким ID не существует");
        }
    }

    private void findName() {
        System.out.println("------------ Поиск заявки по Name--------------");
        String name = this.input.ask("Введите name заявки :");
        Item[] item = tracker.findByName(name);
        if (item.length != 0) {
            for (Item item1: item) {
                System.out.println("Заявка с запрашиваем Name найдена "
                        + item1.getName() + " " + item1.getDecs() + " " + item1.getId());
            }
        } else {
            System.out.println("Заявка с запрашиваем Name  не найдена");
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
