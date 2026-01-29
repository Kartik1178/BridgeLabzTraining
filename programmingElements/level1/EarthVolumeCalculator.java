class EarthVolumeCalculator {
    public static void main(String[] args) {
        int radiusKm = 6378;

        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println(
                "Earth volume in cubic km: " + String.format("%.2f", volumeKm) +
                        ", cubic miles: " + String.format("%.2f", volumeMiles)
        );
    }
}
