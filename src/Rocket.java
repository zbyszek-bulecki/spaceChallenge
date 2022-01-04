public abstract class Rocket implements SpaceShip{

    protected final int maxWeight;
    protected int rocketPayLoad;
    protected boolean NewRocketNeeded = false;

    protected Rocket(int maxWeight, int rocketWeight) {
        this.maxWeight = maxWeight;
        rocketPayLoad = rocketWeight;
    }

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
        return rocketPayLoad + item.weight <= maxWeight;
    }

    @Override
    public void carry(Item item) { // Checks if another item can be loaded and calculates the rocket's weight.
        if (canCarry(item)) {
            rocketPayLoad = rocketPayLoad + item.weight; // todo - check if an item can be carried
        } else {
            NewRocketNeeded = true;
        }
    }

//    protected boolean doRiskyThing(double risk) {
//        double chanceOfExplosion = risk * load();
//        double luck = Math.random();
//
//        return luck > chanceOfExplosion;
    }


}
