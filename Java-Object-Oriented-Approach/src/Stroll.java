class Stroll extends Walk {

    Stroll(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Stroll:moving()");
    }

}
