package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;
    private int bookedRoomsCount = 0;

    public abstract String getLocation();
}

