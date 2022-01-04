public abstract class Rocket implements SpaceShip{

    protected final int maxWeight;
    protected int rocketLoad;

    protected Rocket(int maxWeight, int rocketWeight) {
        this.maxWeight = maxWeight;
        rocketLoad = rocketWeight;
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
        return rocketLoad + item.weight <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        rocketLoad = rocketLoad + item.weight; // todo - check if can be carried
    }

    private double payload() {
        return rocketLoad/(double)maxWeight; // fixme - should depend only on cargo not on rocket weight
    }

    protected boolean doRiskyThing(double risk) {
        double chanceOfExplosion = risk * payload();
        double luck = Math.random();

        return luck > chanceOfExplosion;
    }


}
