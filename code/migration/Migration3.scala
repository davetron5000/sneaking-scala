def aboveThreshold(readings:Array[EnergyReading]) = readings filter (_.kwh > THRESH) size
