def aboveThreshold(readings)
  readings.select { |r| r.kwh > THRESH }.size
end
