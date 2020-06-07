
public class Miles {
    // Первый аргумент это цена билета
    public static void main(String[] args) {
        if (args.length != 1)
            throw new IllegalArgumentException("Number of arguments not equal 1");
        long price_ticket = Long.parseLong(args[0]);
        System.out.println(price_ticket / 20);
    }
}
