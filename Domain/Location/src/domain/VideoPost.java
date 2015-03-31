package domain;

public class VideoPost extends Post {
    
    private double length;
    private String url;

    public VideoPost(int id, String name, double length) {
        super(id, name);
        this.setLength(length);
    }
    
    public VideoPost(int id, String name, double length, String url) {
        super(id, name);
        this.setLength(length);
        this.setUrl(url);
    }
    
    private void setLength(double length) {
        if(length < 0) {
            throw new DomainException("Please give a real length");
        }
        this.length = length;
    }
    
    public double getLength() {
        return this.length;
    }
    
    private void setUrl(String url) {
        this.url = url;
    }
    
    public String getUrl() {
        return this.url;
    }
    
}
