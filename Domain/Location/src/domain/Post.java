package domain;

public abstract class Post {
    
    private int id;
    private String name;
    
    public Post(int id, String name) {
        this.setId(id);
        this.setName(name);
    }
    
    private void setId(int id) {
        if(id < 0) {
            throw new DomainException("Please give a real id");
        }
        this.id = id;
    }
    
    public int getId() {
        return this.id;
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

}
