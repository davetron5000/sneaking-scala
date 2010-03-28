!SLIDE bullets incremental
# Why should your company want Scala?
* More productive
* More expressive
* (less bugs, right?)

!SLIDE
# Talent attractor?

!SLIDE
# It's a great fit as a new language

!SLIDE center
# It's a great fit as a new language
![Comparison](comparison.jpg)

!SLIDE center
# It's a great fit as a new language
![Comparison](comparison2.jpg)

!SLIDE 
# Why SHOULDN'T your company want Scala?

!SLIDE
# Steep learning curve

!SLIDE
# C++
    @@@ C
    int above_threshold(EnergyReading readings[], 
            int size) {
      int count = 0;
      for (int i=0;i<size; i++) {
        if (readings[i].kwh > THRESH) {
          count++;
        }
      }
      return count;
    }

!SLIDE
# Java

    @@@ Java
    public int aboveThreshold(
            EnergyReading[] readings) {
      int count = 0;
      for (int i=0;i<readings.length; i++) {
        if (readings[i].getKWH() > THRESH) {
          count ++;
        }
      }
      return count;
    }

!SLIDE
# Scala

    @@@ Scala
    def aboveThreshold(
        readings:Array[EnergyReading]) = 
      readings filter (_.kwh > THRESH) size

!SLIDE
# Java's delivering

!SLIDE
# What if Scala loses?

