public interface SpaceShip {

    boolean launch();

    boolean land();

    boolean canCarry(Item item);

    int carry(Item item);

}
