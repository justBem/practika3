public class Student {
    private String  name;
    private int age;
    private String pol;
    private int speed;
    private String level;
    private String format;
    public Student(String name, int age, String pol,int speed,String level, String format){
        if(name.length()>2){this.name=name;}
        if(age<0) {
            System.out.println("Vozrast ne mojet otrisatelnym");
        }
        else {
            this.age=age;}
        if(pol.equals("muj") ||pol.equals("jen"))
        this.pol=pol;
        this.speed=speed;
        this.level=level;
        if(format.equals("offline") || format.equals("online")){
            this.format=format;
        }
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getPol(){return pol;}
    public String getLevel(){return level;}
    public String getFormat(){return  format;}
    public int getSpeed(){return speed;}
}
