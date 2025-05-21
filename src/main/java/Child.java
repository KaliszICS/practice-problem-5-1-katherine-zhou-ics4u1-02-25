import java.util.ArrayList;

public class Child extends Person{
    private Parent parent1;
    private Parent parent2;
    private ArrayList<Child> siblings;


    public Child(String name, int age, Parent parent1, Parent parent2){
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new ArrayList<>();
    }


    public String getName(){
        return super.getName();
    }

    public void setName(String name){
        super.setName(name);
    }

    public int getAge() {
        return super.getAge();
    }

    public void setAge(int age){
        super.setAge(age);
    }

    public Parent getParent1(){
        return this.parent1;
    }

    public Parent getParent2(){
        return this.parent2;

    }

    public ArrayList<Child> getSiblings(){
        return this.siblings;
    }

    public void setSiblings(ArrayList<Child> siblings){
        this.siblings = siblings;
    }

    public void addSibling(Child sibling){
        this.siblings.add(sibling);
    }
}
