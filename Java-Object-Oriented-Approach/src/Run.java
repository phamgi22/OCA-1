abstract class Run implements Exercise{
    private double distanceKm;

    public Run(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public double distanceCovered() {
        return this.distanceKm;
    }

}
