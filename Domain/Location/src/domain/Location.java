package domain;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private int id;
    private String name;
    private Geolocation  geolocation;
    private LocationType type;
    private List<Post> posts;
    
    public Location(int id, String name, Geolocation geo, LocationType type) {
        this.setId(id);
        this.setName(name);
        this.setGeolocation(geo);
        this.setLocationType(type);
        this.posts = new ArrayList<Post>();
    }
    
        public Location(int id, String name, Geolocation geo, LocationType type,
                                List<Post> posts) {
        this.setId(id);
        this.setName(name);
        this.setGeolocation(geo);
        this.setLocationType(type);
        this.posts = posts;
    }
    
    private void setId(int id) {
        if(id < 0) {
            throw new DomainException("Please give a real id");
        }
        this.id = id;
    }
    
    private void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new DomainException("Please give a real name");
        }
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    private void setGeolocation(Geolocation geolocation) {
        if(geolocation == null) {
            throw new DomainException("Please give a real geolocation");
        }
        this.geolocation = geolocation;
    }
    
    public Geolocation getGeolocation() {
        return this.geolocation;
    }
    
    private void setLocationType(LocationType type) {
        if(type == null) {
            throw new DomainException("Please give a real location type");
        }
        this.type = type;
    }
    
    public List<Post> getPosts() {
        return this.posts;
    }
}
