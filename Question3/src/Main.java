public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Hapag-LLyod", "1998");
        ships[1] = new CruiseShip("MSC", "2010", 3000);
        ships[2] = new CargoShip("Maersk", "2015", 7000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
