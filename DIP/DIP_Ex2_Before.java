class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    public void processOrder(String order) {
        database.save(order);
    }
}

class MainDIPBefore2 {
    public static void main(String[] args) {
        OrderProcessor order = new OrderProcessor();
        order.processOrder("'Donnees a sauvegarder'");
    }
}
