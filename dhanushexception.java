public class dhanushexception {
    public dhanushexception(String message){
        super(message);
    }
}

class student{
    private String name;
    private double cgpa;
    public student(String name,double cgpa){
        this.name=name;
        this.cgpa=cgpa;
    }
    public void checkaddmission()throw dhanushexception{
        if(cgpa<75){
            throw new dhanushexception("pls pass first year");
        }
        else{
            System.out.println("congrats"+name+ "i you are eligible for admission");
        }
    }
}

public class customexcept{
    
}

