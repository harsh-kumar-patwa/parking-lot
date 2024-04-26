package models;
import java.util.List;
public class ParkingSpot extends BaseModel{;
    private int spotNumber;
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloors;

}
