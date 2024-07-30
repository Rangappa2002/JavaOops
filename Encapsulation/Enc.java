public class Enc {

    private String USN;
    private String Name;
    private String Branch;
    private int age;

    public void setUSN(String usn){
        this.USN = usn;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setBranch(String branch){
        this.Branch = branch;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getUSN(){
        return USN;
    }
    public String getName(){
        return Name;
    }
    public String getBranch(){
        return Branch;
    }
    public int getAge(){
        return age;
    }
}
