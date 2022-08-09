
public class Main {
    public static void main(String[] args) {
       Cours cours=new Cours("Peaksoft","Janarbek","Tuesday",9,25);
       System.out.println("name:"+cours.getName()+" name2:"+cours.getName2()+" day:"+cours.getDay()+" month:"+cours.getMonth());
       Student student1=new Student("Bermet",19,"jen",7," begiiner","online");
       Student student2=new Student("Aidana",20,"jen",46," advanced","offline");
       Student student3=new Student("Burulai",19,"jen",32," elementery","offline");

       Student [] arr={student1,student2,student3};
       int counter=0;
       for(int i=0; i<arr.length;i++){
           if (arr[i].getSpeed()>=cours.getSkorost()){
               System.out.println("Prosol student:"+arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getPol()+" "+arr[i].getSpeed()+""+arr[i].getLevel()+" "+arr[i].getFormat());
               counter++;
           }

       }
        System.out.println("Kolichestvo proshedshix studentov"+counter);
    }
}