package ExamProblems.Avatar;

import ExamProblems.Avatar.benders.*;
import ExamProblems.Avatar.monuments.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<AirBender> airBenders = new ArrayList<>();
        List<FireBender> fireBenders = new ArrayList<>();
        List<EarthBender> earthBenders = new ArrayList<>();
        List<WaterBender> waterBenders = new ArrayList<>();

        List<AirMonument> airMonuments = new ArrayList<>();
        List<FireMonument> fireMonuments = new ArrayList<>();
        List<EarthMonument> earthMonuments = new ArrayList<>();
        List<WaterMonument> waterMonuments = new ArrayList<>();

        StringBuilder wars = new StringBuilder();
        int warCounter = 0;

        while(true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].trim().equalsIgnoreCase("quit")) {
                System.out.println(wars.toString().trim());
                break;
            }

            switch (input[0].trim().toLowerCase()) {
                case "bender":

                    if (input[1].trim().equalsIgnoreCase("water")) {
                       WaterBender bender = new WaterBender(input[2], Long.valueOf(input[3]), Double.valueOf(input[4]));
                       waterBenders.add(bender);
                    } else if (input[1].trim().equalsIgnoreCase("air")) {
                        AirBender bender = new AirBender(input[2], Long.valueOf(input[3]), Double.valueOf(input[4]));
                        airBenders.add(bender);
                    } else if (input[1].equalsIgnoreCase("earth")) {
                        EarthBender bender = new EarthBender(input[2], Long.valueOf(input[3]), Double.valueOf(input[4]));
                        earthBenders.add(bender);
                    } else {
                        FireBender bender = new FireBender(input[2], Long.valueOf(input[3]), Double.valueOf(input[4]));
                        fireBenders.add(bender);
                    }
                    break;
                case "monument":
                    if (input[1].trim().equalsIgnoreCase("water")) {
                        WaterMonument monument = new WaterMonument(input[2], Long.valueOf(input[3]));
                        waterMonuments.add(monument);
                    } else if (input[1].trim().equalsIgnoreCase("air")) {
                        AirMonument monument = new AirMonument(input[2], Long.valueOf(input[3]));
                        airMonuments.add(monument);
                    } else if (input[1].trim().equalsIgnoreCase("earth")) {
                        EarthMonument monument = new EarthMonument(input[2], Long.valueOf(input[3]));
                        earthMonuments.add(monument);
                    } else {
                        FireMonument monument = new FireMonument(input[2], Long.valueOf(input[3]));
                        fireMonuments.add(monument);
                    }
                    break;
                case "status":
                    System.out.println(input[1].trim() + " Nation");

                    if (input[1].trim().equalsIgnoreCase("water")) {

                        if (waterBenders.size() == 0) {
                            System.out.println("Benders: None");
                        } else {
                            System.out.println("Benders:");
                            waterBenders.forEach(waterBender -> System.out.println("###" + waterBender));
                        }

                        if (waterMonuments.size() == 0) {
                            System.out.println("Monuments: None");
                        } else {
                            System.out.println("Monuments:");
                            waterMonuments.forEach(waterMonument-> System.out.println("###" + waterMonument));
                        }
                    } else if (input[1].trim().equalsIgnoreCase("air")) {
                        if (airBenders.size() == 0) {
                            System.out.println("Benders: None");
                        } else {
                            System.out.println("Benders:");
                            airBenders.forEach(airBender -> System.out.println("###" + airBender));
                        }

                        if (airMonuments.size() == 0) {
                            System.out.println("Monuments: None");
                        } else {
                            System.out.println("Monuments:");
                            airMonuments.forEach(airMonument -> System.out.println("###" + airMonument));
                        }
                    } else if (input[1].trim().equalsIgnoreCase("earth")) {
                        if (earthBenders.size() == 0) {
                            System.out.println("Benders: None");
                        } else {
                            System.out.println("Benders:");
                            earthBenders.forEach(earthBender -> System.out.println("###" + earthBender));
                        }

                        if (earthMonuments.size() == 0) {
                            System.out.println("Monuments: None");
                        } else {
                            System.out.println("Monuments:");
                            earthMonuments.forEach(earthMonument-> System.out.println("###" + earthMonument));
                        }
                    } else {
                        if (fireBenders.size() == 0) {
                            System.out.println("Benders: None");
                        } else {
                            System.out.println("Benders:");
                            fireBenders.forEach(fireBender -> System.out.println("###" + fireBender));
                        }

                        if (fireMonuments.size() == 0) {
                            System.out.println("Monuments: None");
                        } else {
                            System.out.println("Monuments:");
                            fireMonuments.forEach(fireMonument -> System.out.println("###" + fireMonument));
                        }
                    }
                    break;
                case "war":
                    warCounter++;
                    wars.append("War ").append(warCounter).append(" ").append("issued by ").append(input[1]).append("\n");

                    Long airTotal = 0L;
                    for (AirBender airBender : airBenders) {
                        airTotal += (long)airBender.getTotalPower();
                    }

                    Long earthTotal = 0L;
                    for (EarthBender earthBender : earthBenders) {
                        earthTotal += (long)earthBender.getTotalPower();
                    }

                    Long fireTotal = 0L;
                    for (FireBender fireBender : fireBenders) {
                        fireTotal += (long)fireBender.getTotalPower();
                    }

                    Long waterTotal = 0L;
                    for (WaterBender waterBender : waterBenders) {
                        waterTotal += (long)waterBender.getTotalPower();
                    }

                    Long airMonumentSum = 0L;
                    for (AirMonument airMonument : airMonuments) {
                        airMonumentSum += airMonument.getAirAffinity();
                    }

                    Long waterMonumentSum = 0L;
                    for (WaterMonument waterMonument : waterMonuments) {
                        waterMonumentSum += waterMonument.getWaterAffinity();
                    }

                    Long earthMonumentSum = 0L;
                    for (EarthMonument earthMonument : earthMonuments) {
                        earthMonumentSum += earthMonument.getEarthAffinity();
                    }

                     Long fireMonumentSum = 0L;
                    for (FireMonument fireMonument : fireMonuments) {
                        fireMonumentSum += fireMonument.getFireAffinity();
                    }

                    airTotal += ((airTotal / 100) * airMonumentSum);
                    earthTotal += ((earthTotal / 100) * earthMonumentSum);
                    waterTotal += ((waterTotal / 100) * waterMonumentSum);
                    fireTotal += ((fireTotal / 100) * fireMonumentSum);

                    if (airTotal > earthTotal && airTotal > waterTotal && airTotal > fireTotal) {
                        earthBenders.clear();
                        earthMonuments.clear();

                        waterBenders.clear();
                        waterMonuments.clear();

                        fireBenders.clear();
                        fireMonuments.clear();
                    } else if (earthTotal > waterTotal && earthTotal > airTotal && earthTotal > fireTotal) {
                        airBenders.clear();
                        airMonuments.clear();

                        waterBenders.clear();
                        waterMonuments.clear();

                        fireBenders.clear();
                        fireMonuments.clear();
                    } else if (waterTotal > earthTotal && waterTotal > airTotal && waterTotal > fireTotal) {
                        airBenders.clear();
                        airMonuments.clear();

                        earthBenders.clear();
                        earthMonuments.clear();

                        fireBenders.clear();
                        fireMonuments.clear();
                    } else {
                        airBenders.clear();
                        airMonuments.clear();

                        earthBenders.clear();
                        earthMonuments.clear();

                        waterBenders.clear();
                        waterMonuments.clear();
                    }

                    break;
            }
        }
    }
}
