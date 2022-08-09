public class Cours {
    private String name,name2,day;
    private int month,skorost;
    public Cours(String name,String name2,String day,int month,int skorost){
        this.name = name;
        if (name.length()<2) {
            System.out.println("Imya ne mojet sostoit iz dvux bukv");
        }
        else
            {
                this.name2 = name2;
            }

        this.day = day;
       this.month=month;
       if(skorost>=30) {
           System.out.println("ne mojem vas vzyat");
       }
       else {
           this.skorost=skorost;
       }

    }
    public String getName() {return name;
    }

    public String getName2() {return name2;
    }
    public String getDay() {  return day; }
    public int getMonth(){ return month;}
    public int getSkorost(){ return skorost;
    }


}
