import java.util.ArrayList;

class Parent extends Person{
    private Parent spouse;
    private ArrayList<Child> children;

    public Parent (String name, int age, Parent spouse){
        super (name, age);
        this.spouse = spouse;
        this.children = new ArrayList<>();
    }

    public Parent (String name, int age){
        super (name, age);
        this.spouse = null;
        this.children = new ArrayList<>();
    }

    public Parent getSpouse(){
        return this.spouse;
    }

    public void setSpouse(Parent spouse){
        this.spouse = spouse;
    }

    public ArrayList<Child> getChildren(){
        return this.children;
    }

    public void setChildren (ArrayList<Child> children){
        this.children = children;
    }

    public void addChild(Child child){
        children.add(child);
    }
}