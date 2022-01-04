public abstract class Rocket implements SpaceShip{

    protected final int maxWeight;
    protected final int rocketWeight;
    protected final int cargoLimit;
    protected int cargoCarried;

    protected Rocket(int maxWeight, int rocketWeight) {
        this.maxWeight = maxWeight;
        this.rocketWeight = rocketWeight;
        this.cargoLimit = maxWeight - rocketWeight;
        cargoCarried = 0;
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
    public boolean canCarry(Item item) { // Checks if an item can be loaded into the rocket.
        return cargoCarried + item.getWeight() <= cargoLimit;
    }

    @Override
    public void carry(Item item) { // Updates the rocket's payload.
        if (canCarry(item)) {
            cargoCarried = cargoCarried + item.getWeight();
        } else {
            throw new IllegalArgumentException();
        }
    }

    private double checkLoad() { //Checks the current load of the rocket.
        return cargoCarried / (double)cargoLimit;
    }

    protected boolean doRiskyThing(final double risk) {
        final double chanceOfExplosion = risk * checkLoad();
        final double luck = Math.random();
        return luck > chanceOfExplosion;
    }

}
