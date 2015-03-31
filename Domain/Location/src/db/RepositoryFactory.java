package db;

public class RepositoryFactory {
    
    public Repository createRepository(String type) {
        if(type.equals("Memory")) {
            return new MemoryRepository();
        }
        
        throw new DatabaseException("Repository not found");
    }
}
