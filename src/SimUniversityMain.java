import java.util.ArrayList;

/*
 * IST 311 sim univeristy assignment
 */

/**
 * @author Ben Shive
 */

public class SimUniversityMain 
{
    public static void main(String[] args)
    {
        ArrayList people = new ArrayList<>();
        
        Faculty f1, f2, f3;
        Staff sta1, sta2, sta3;
        Student stu1, stu2, stu3;
        
        f1 = new Faculty("Richard", "Jones", "4849305918", "rjones@simuniversity.com", "B23",
            "4843281123", "03/04/2004", "CEO");
        f2 = new Faculty("Ben", "Johnson", "2156503340", "bjohnson@simuniversity.com", "B34",
            "4843281459", "11/23/2008", "Executive Assistant");
        f3 = new Faculty("Derrick", "Blake", "6102312243", "dblake@simuniversity.com", "B28",
            "4843284552", "01/01/2001", "Janitor");
        
        sta1 = new Staff("Victoria", "Neville", "3425934040", "vneville@simuniversity.com", "A34", 
                "4843287979", "03/06/1996", "Spanish Professor");
        sta2 = new Staff("Melissa", "Velasquez", "5120090034", "mvelasquez@simuniversity.com", "A35", 
                "4843281213", "03/12/2003", "Earth Science Professor");
        sta3 = new Staff("Alissa", "Collins", "2152133359", "acollins@simuniveristy.com", "B12", 
                "4843289757", "07/29/1997", "History Professor");
        
        stu1 = new Student("Marya", "Ernest", "6103438940", "mernest@simuniversity.com", "Freshman");
        stu2 = new Student("James", "Allen", "2924930202", "jallen@simuniversity.com", "Senior");
        stu3 = new Student("Jaime", "Smith", "2154349012", "jsmith@simuniversity.com", "Sophmore");
        
        people.add(f1);
        people.add(f2);
        people.add(f3);
        
        people.add(sta1);
        people.add(sta2);
        people.add(sta3);
        
        people.add(stu1);
        people.add(stu2);
        people.add(stu3);
        
        people.forEach(System.out::println);
    }
}