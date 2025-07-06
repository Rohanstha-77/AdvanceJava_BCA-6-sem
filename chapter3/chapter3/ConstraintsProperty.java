package chapter3;
import java.beans.*;

public class ConstraintsProperty{
    private int age;
    private final VetoableChangeSupport support = new VetoableChangeSupport(this);

    public ConstraintsProperty(){ } //no argument constructor

    public ConstraintsProperty(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void addVetoableChangeListener(VetoableChangeListener listener){
        support.addVetoableChangeListener(listener);
    }

    public void setAge(int newAge) throws PropertyVetoException{
        try {
            support.fireVetoableChange("age",this.age,newAge);
            this.age = newAge;
            System.out.println("Age is updated to " + this.age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}