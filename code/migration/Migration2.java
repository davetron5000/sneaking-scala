public int aboveThreshold(EnergyReading[] readings) {
    int count = ;
    for (int i=0;i<readings.length; i++) {
        if (readings[i].getKWH() > THRESH) {
            count ++;
        }
    }
    return count;
}
