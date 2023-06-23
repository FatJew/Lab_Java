package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
class ResortHotel extends Hotel {
    private int adultPools;
    private int childrenPools;
    private int restaurants;
    private String complexName;

    public ResortHotel( String name, int totalRooms, int availableRooms, int rating, int bookedRoomsCount, int adultPools,int childrenPools,int restaurants, String complexName ) {
        super(name,totalRooms,availableRooms,rating,bookedRoomsCount);
        this.adultPools=adultPools;
        this.childrenPools=childrenPools;
        this.restaurants=restaurants;
        this.complexName=complexName;
    }

    @Override
    public String getLocation() {
        return complexName;
    }
}