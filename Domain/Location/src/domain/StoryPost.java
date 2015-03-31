package domain;

public class StoryPost extends Post {

    private String description;
    
    public StoryPost(int id, String name, String description) {
        super(id, name);
        this.setDescription(description);
    }
    
    private void setDescription(String description) {
        if(description == null || description.isEmpty()) {
            throw new DomainException("Please give a real description");
        }
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
       
}
