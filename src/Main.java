public class Main {
    public static void main(String[] args) {
       Sheep sheep1 = new Sheep(40,4,"M","sheep");
        Sheep sheep2 = new Sheep(40,4,"M","sheep");
        Sheep sheep3 = new Sheep(40,4,"M","sheep");
        Sheep[]sheepsOfFarm1 = {sheep1,sheep2,sheep3};
        Sheep sheep = new Sheep(23,1,"F","sheep");
        Sheep[]sheep4OfFarm2 = {sheep};
        Cow cows1 = new Cow(60,6,"F", "Avengus0");
        Cow cows2 = new Cow(60,6,"F", "Avengus0");
        Cow cows3 = new Cow(60,6,"F", "Avengus0");
        Cow cows4 = new Cow(60,6,"F", "Avengus0");
        Cow cows5 = new Cow(60,6,"F", "Avengus0");
        Cow[] cowOfFarm1= {cows1,cows2,cows3,cows4,cows5};
        Cow cow6 = new Cow(60,6,"F", "Avengus0");
        Cow[]cowOfFarm2 = {cow6};

Hoerse hoerses1 = new Hoerse(100,3, "M", "Horse");
        Hoerse hoerses2 = new Hoerse(100,3, "M", "Horse");
        Hoerse[] horseFarm1 = {hoerses1, hoerses2};
        Hoerse hoerse3= new Hoerse(110,6,"F", "Horse");
        Hoerse[] horseFarm2 = {hoerse3};




        Farm farms = new Farm("Moscow", sheepsOfFarm1, cowOfFarm1,horseFarm1,"Asko");
        Farm farms1 = new Farm("Moscow", sheep4OfFarm2, cowOfFarm2, horseFarm2,"Asko");
        System.out.println(farms);
        System.out.println(farms1);
    }

}