public class U1 extends Rocket {

    private static final int ROCKET_WEIGHT = 10_000;
    private static final int MAX_WEIGHT = 18_000;
    private static final double TAKEOFF_RISK = 0.05;
    private static final double LANDING_RISK = 0.01;

    public U1() {
        super(MAX_WEIGHT, ROCKET_WEIGHT);
    }

    @Override
    public boolean launch() {
        double chanceOfExplosion = TAKEOFF_RISK * load();
        double luck = Math.random();

        return luck > chanceOfExplosion;
    }

    @Override
    public boolean land() {
        double chanceOfExplosion = LANDING_RISK * load();
        double luck = Math.random();

        return luck > chanceOfExplosion;
    }

    private double load() { // Calculates how much the rocket can carry in kg.
        return (MAX_WEIGHT - ROCKET_WEIGHT) / (double)MAX_WEIGHT;
        // return rocketPayLoad /(double)maxWeight; // fixme - should depend only on cargo not on rocket weight
    }

    }


    /*Rocket cost = $100 Million
        Rocket weight = 10 Tonnes
        Max weight (with cargo) = 18 Tonnes
        Chance of launch explosion = 5% * (cargo carried / cargo limit)
        Chance of landing crash = 1% * (cargo carried / cargo limit)*/