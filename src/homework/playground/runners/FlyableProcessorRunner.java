package homework.playground.runners;

import homework.playground.essence.Flyable;
import homework.playground.essence.craft.air.AirTransport;
import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plane;
import homework.playground.essence.craft.air.Rocket;
import homework.playground.essence.creatures.Fly;
import homework.playground.essence.creatures.Insect;
import homework.playground.essence.creatures.Mosquito;
import homework.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {

    public static void main(String[] args) {

        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        //Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        AirTransport aircraftCopter = new Copter(223, "Mi8 Aircraft");
        AirTransport aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        AirTransport aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        FlyableProcessor flyableProcessor = new FlyableProcessor();

        flyableProcessor.runFlyable(flyablePlane);
        System.out.println();
        flyableProcessor.runFlyable(flyableRocket);
        System.out.println();
        //flyableProcessor.runFlyable(flyableFly);      Fly cannot be converted to homework.playground.essence.Flyable
        flyableProcessor.runFlyable(flyableMosquito);
        System.out.println();

        flyableProcessor.runFlyable(aircraftCopter);
        System.out.println();
        flyableProcessor.runFlyable(aircraftPlane);
        System.out.println();
        flyableProcessor.runFlyable(aircraftRocket);
        System.out.println();

        //flyableProcessor.runFlyable(insectFly);
        System.out.println();
        //flyableProcessor.runFlyable(insectMosquito);
        System.out.println();

        flyableProcessor.runFlyable(aCopter);
        System.out.println();
        flyableProcessor.runFlyable(aPlane);
        System.out.println();
        flyableProcessor.runFlyable(aRocket);
        System.out.println();

        //flyableProcessor.runFlyable(aFly);   Fly cannot be converted to homework.playground.essence.Flyable
        System.out.println();
        flyableProcessor.runFlyable(aMosquito);
        System.out.println();

        System.out.println();
        System.out.println();

        flyableProcessor.runFlyable(aCopter, "НИКУДА");
        System.out.println();
        flyableProcessor.runFlyable(aircraftRocket, "ПОВСЮДУ");


    }
}
