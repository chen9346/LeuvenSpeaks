package db;

import domain.Location;
import java.util.List;

public interface Repository {

    public Location getLocation(int id);
    public List<Location> getLocations();
    
}
