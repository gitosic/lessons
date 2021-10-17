package ru.curs.packege2;

public class Roads implements Information {
    String region;
    int number;
    String city;

    public Roads(){
    }

    /**
     * Javadocs
     * @param region регион
     * @param number гос номер на машине
     * @param city город
     *
     */
    public Roads(String region, int number, String city){
        this.region = region;
        this.number = number;
        this.city = city;
    }

    /**
     *
     * @param region
     * @param number
     */
    public void getInfoByRoad(String region, int number){
        System.out.println("Машины в " + region + " ездят с " + number + " номером на гос знаках");
    }


    @Override
    public void getInfoCity() {
        System.out.println("Машины в городе " + city);
    }
}
