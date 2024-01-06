package practice.containers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ShipmentAppl {
    // Создайте класс Container с полями: String label (маркировка) и List -
    // список коробок с посылками.
    // Создайте класс Box с полем: List - список посылок. Классы Container и Box
    // являются итерируемыми. Создайте класс Parcel (посылка)
    // с полем double weight - вес посылки. Создайте класс ShipmentAppl с методом main.
    // Задумайте случайное количество контейнеров (от 10 до 20).
    // В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
    // В каждой коробке задумайте случайное количество посылок (от 5 до 10).
    // Предположим, что каждая посылка в среднем имеет вес = 2кг

    public static void main(String[] args) {
        Random random = new Random();
        int numContainers = random.nextInt(10, 21);


        List<Container> containers = Stream.generate(() ->
                        new Container("Wakanda", random.nextInt(10, 21)))
                .limit(numContainers)
                .collect(Collectors.toList());

        List<Integer> contNumbers = IntStream.rangeClosed(1, numContainers)
                .boxed()
                .collect(Collectors.toList());

        IntStream.range(0, numContainers).forEach(index -> {
            Container container = containers.get(index);
            System.out.println("Container " + contNumbers.get(index) + " : " + container.label);
            container.boxes.forEach(box -> {
                System.out.println("  Box with " + box.parcels.size() + " parcels");
                box.parcels.forEach(parcel ->
                        System.out.println("    Parcel with weight: " + parcel.weight + " kg"));
            });
            System.out.println();
        });

        int totalParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .sum();

        double totalWeight = containers.stream()
                .flatMap(container -> container.boxes.stream())
                .flatMap(box -> box.parcels.stream())
                .mapToDouble(parcel -> parcel.weight)
                .sum();

        System.out.println("Total parcels: " + totalParcels);
        System.out.println("Total weight: " + totalWeight + " kg");

        int maxParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .max()
                .orElse(0);
        System.out.println("Max parcel in Container = " + maxParcels);
        System.out.println();
        System.out.println("Containers with the maximum number of parcels:");
        containers.stream()
                .filter(container -> container.getTotalParcels() == maxParcels)
                .forEach(System.out::println);

    }
}