public class Rocket implements SpaceShip{


    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {

        Spoon.weight = itemWeight;

        if(RocketLoad + itemWeight <= rocketLoadCapacity){
            return true;
        } else return false;
    }

    @Override
    public int carry(Item item) {
        return 0;
    }
}
