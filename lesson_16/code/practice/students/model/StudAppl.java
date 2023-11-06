package practice.students.model;

public class StudAppl {
    public static void main(String[] args) {
    Students stud1=new Students(1,"Petr","Ivanov", 2003,"Biology");
    Students stud2=new Students(2,"Nina","Semenova", 2005,"Finance");
    Students stud3=new Students(3,"Polina","Idzikovich", 2002,"Programming");
    Students stud4=new Students(4,"Mustafa","Gemal", 2001,"Math");
    Students stud5=new Students(5,"Kim","Puck", 2004,"Physics");
    Students stud6=new Students(6,"Kevin","Smith", 2003,"Political science");
    Students stud7=new Students(7,"Paola","Fresco", 2000,"Pediatrics");

    stud1.display();
    stud2.display();
    stud3.display();
    stud4.display();
    stud5.display();
    stud6.display();
    stud7.display();

        System.out.println();
        Students.split();

    stud1.academ(stud1.getLastName());
    stud2.exam(stud2.getLastName());
    stud3.exam(stud3.getLastName());
    stud4.stud(stud4.getLastName());
    stud5.sick(stud5.getLastName());
    stud6.leave(stud6.getLastName());
    stud7.exam(stud7.getLastName());
    }
}
