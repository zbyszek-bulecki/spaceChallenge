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
        return doRiskyThing(TAKEOFF_RISK);
    }

    @Override
    public boolean land() {
        return doRiskyThing(LANDING_RISK);
    }

}


    /*Rocket cost = $100 Million
        Rocket weight = 10 Tonnes
        Max weight (with cargo) = 18 Tonnes
        Chance of launch explosion = 5% * (cargo carried / cargo limit)
        Chance of landing crash = 1% * (cargo carried / cargo limit)*/