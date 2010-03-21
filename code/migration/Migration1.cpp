int above_threshold(EnergyReading readings[], int size) {
    int count = 0;
    for (int i=0;i<size; i++) {
        if (readings[i].kwh > THRESH) {
            count++;
        }
    }
    return count;
}
