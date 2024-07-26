class Sprint extends Run implements BallSport{

    Sprint(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Sprint::move()");
    }
}
