abstract class Walk implements Exercise{
    private double distanceCovered;

    public Walk(double distanceCovered) {
        this.distanceCovered = distanceCovered;
    }
    @Override
    public double distanceCovered() {
        return this.distanceCovered;
    }

    @Override
    public void move() {

    }
}
