package practice.containers;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Container implements Iterable<Box> {
    static AtomicInteger counter=new AtomicInteger(1);
    String label;
    List<Box> boxes;

    public Container(String label, int numBoxes) {
        this.label = "Container- "+counter.getAndIncrement();
        Random random = new Random();
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Box(random.nextInt(5, 11)))
                .collect(Collectors.toList());
    }
    public int getTotalParcels() {
        return boxes.stream()
                .mapToInt(box -> box.parcels.size())
                .sum();
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public List<Box> getBoxes() {
        return boxes;
    }
    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
    @Override
    public String toString() {
        return "Container{ " +
                "label=' " + label + '\'' +
                ", boxes= " + boxes;
    }
    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}