/*
Sanchez Torres Sergio Daniel
Distributed Systems
GFS
*/
public class Inode {
    protected String namespace;
    protected String currentLocation;
    protected String mappingFilesToChunks;
    
    /*
    Constructors
        -The first is a void constructor
        -The second is a constructor where are initialized currentLocation
        and mappingFilesToChunks
    */
    public Inode(){
        
    }
    
    public Inode(String namespace){
        this.namespace = namespace;
        //Then we initialize currenteLocation and mappingFilesToChunks
    }
    
    /*
    Methods
        -In this part, I declared the GFS's usual operations as methods
        -Perhaps most operations are already declared by Java for file managment
        but I declared them in my own way to make this example pretty didactic 
        and not make use of other test classes
    */
    public void createFile(){
        
    }
    
    public void deleteFile(){
        
    }
    
    public void openFile(){
        
    }
    
    public void closeFile(){
        
    }
    
    public void writring(){
        
    }
    
    public void snapshot(){
        
    }
    
    public void addLogs(){
        
    }
    
    /*
    Getters and Setters
        Not all attributed have Getters and Setters because as far as I'm
        concerned only namespace attribute can be modified within the program
        execution. The other attributes can only have getters to get their values
    */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public String getMappingFilesToChunks() {
        return mappingFilesToChunks;
    }

    public void setMappingFilesToChunks(String mappingFilesToChunks) {
        this.mappingFilesToChunks = mappingFilesToChunks;
    }
}