package com.company.lesson3;

import com.company.lesson3.entity.Item;
import com.company.lesson3.entity.Order;
import com.company.lesson3.entity.User;
import com.company.lesson3.repository.ItemRepository;
import com.company.lesson3.repository.OrderRepository;
import com.company.lesson3.repository.UserRepository;
import com.company.lesson3.service.ItemService;
import com.company.lesson3.service.OrderService;
import com.company.lesson3.service.UserService;
import com.company.lesson3.ui.ConsoleUi;

public class ConsoleApplication {

    private static final int ITEMS_NUMBER = 5;
    private static final int USER_QUANTITY = 5;
    private static final int ORDER_NUMBER = 3;

    public static void main(String[] args) {

        Item[] items = initItems();
        User[] users = initUsers();
        Order[] orders = initOrders(items, users);

        ItemRepository itemRepository = new ItemRepository(items);
        UserRepository userRepository = new UserRepository(users);
        OrderRepository orderRepository = new OrderRepository(orders);

        ItemService itemService = new ItemService(itemRepository);
        UserService userService = new UserService(userRepository);
        OrderService orderService = new OrderService(orderRepository);

        ConsoleUi consoleUi = new ConsoleUi(userService);

        consoleUi.run();
    }

    private static Item[] initItems() {
        Item[] items = new Item[ITEMS_NUMBER];
        items[0] = new Item(11L, "Shirt-S", 10000);
        items[1] = new Item(20L, "Shirt-M", 10500);
        items[2] = new Item(21L, "Shirt-L", 12000);
        items[3] = new Item(41L, "Shirt-XL", 13000);
        items[4] = new Item(42L, "Shirt-XXL", 13500);
        return items;
    }

    private static User[] initUsers() {
        User users[] = new User[USER_QUANTITY];
        users[0] = new User(1L, "alice@gmail.com", "qwerty");
        users[1] = new User(2L, "bob@gmail.com", "1234");
        users[2] = new User(3L, "charles@gmail.com", "passw0rd");
        users[3] = new User(5L, "dennis@gmail.com", "qwertz123");
        users[4] = new User(4L, "elton@gmail.com", "gfhjkmjlby");
        return users;
    }

    private static Order[] initOrders(Item[] items, User[] users) {
        Order[] orders = new Order[ORDER_NUMBER];
        orders[1] = new Order(1L, items[0], users[3]);
        orders[1] = new Order(1L, items[1], users[1]);
        orders[1] = new Order(1L, items[3], users[2]);
        return orders;
    }

}
