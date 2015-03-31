package db;

import domain.Location;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRepository implements Repository {
    
    private Map<Integer, Location> locations;
    
    public MemoryRepository() {
        this.locations = new HashMap<Integer, Location>();
    }
    
    public Location getLocation(int id) {
        return this.locations.get(id);
    }
    
    public List<Location> getLocations() {
        return (List<Location>) this.locations.values();
    }
}
