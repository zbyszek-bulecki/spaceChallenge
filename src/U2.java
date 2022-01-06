public class U2 extends Rocket{

    private static final int ROCKET_WEIGHT = 18_000;
    private static final int MAX_WEIGHT = 29_000;
    private static final int ROCKET_COST = 120_000_000;
    private static final double TAKEOFF_RISK = 0.04;
    private static final double LANDING_RISK = 0.08;

    public U2() {
        super(MAX_WEIGHT, ROCKET_WEIGHT, ROCKET_COST);
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

//    Rocket cost = $120 Million
//        Rocket weight = 18 Tonnes
//        Max weight (with cargo) = 29 Tonnes
//        Chance of launch explosion = 4% * (cargo carried / cargo limit)
//        Chance of landing crash = 8% * (cargo carried / cargo limit)