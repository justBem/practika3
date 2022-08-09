public class Kurs {
    private String name,name2,day;
    private int mounth,skorost;
    public Kurs(String name,String name2,String day){
        this.name = name;
        if (name.length()<2) {
            System.out.println("Imya ne mojet sostoit iz dvux bukv");
        }
        else
            {
                this.name2 = name2;
            }

        this.day = day;

    }
    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }
    public String getDay() {  return day; }


}
