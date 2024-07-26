class Soccer extends Run implements BallSport{

    Soccer(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Soccer::move()");
    }
}
