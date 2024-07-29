public class Population {

    String cname;
    long population;
    public  Population(String cname, long population){
        this.cname=cname;
        this.population=population;

    }
    public String getcname(){
        return cname;
    }
    public long Population(){
        return population;
    }
    public static void main(String[] args) {

        Population[] pp = new Population[4];

        pp[0] = new Population("USA", 331449281);
        pp[1] = new Population("China", 1444216107);
        pp[2] = new Population("India", 1393409038);
        pp[3] = new Population("Brazil", 213993437);

        Population max = pp[0];

        for(int i=0; i<pp.length;i++){
            if(pp[i].population > max.population){
                max = pp[i];
            }
        }
        System.out.println("Country with the highest population: "+max.cname+ " : "+max.population);
    }
}
    

