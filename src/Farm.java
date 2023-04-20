import java.util.Arrays;

public class Farm {

    private String address;
   private Sheep[] sheep;
    private Cow[] cows;
    private Hoerse[] horses;

    private String owerName;




    public Farm(String address, Sheep[] sheep, Cow[] cows, Hoerse[] horses, String owerName) {
        this.address = address;
        this.sheep = sheep;
        this.cows = cows;
        this.horses = horses;
        this.owerName = owerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Hoerse[] getHorses() {
        return horses;
    }

    public void setHorses(Hoerse[] horses) {
        this.horses = horses;
    }

    public String getOwerName() {
        return owerName;
    }

    public void setOwerName(String owerName) {
        this.owerName = owerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", sheeps=" + Arrays.toString(sheep) +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", owerName='" + owerName + '\'' +
                '}';
    }
}
