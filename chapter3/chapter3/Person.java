package chapter3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class Person {
    public static void main(String[] args) {
        try {
            ConstraintsProperty personAge = new ConstraintsProperty(25);
            System.out.println("Intitial age " + personAge.getAge());

            personAge.addVetoableChangeListener(new VetoableChangeListener() {

                @Override
                public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                    int newAge = (int) evt.getNewValue();
                    if(newAge < (int)evt.getOldValue()){
                        throw new PropertyVetoException("Age Cannt be decrease", evt);
                    }
                    
                }
            });

            personAge.setAge(30);
            personAge.setAge(22);
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println(e.getMessage());
        }
    }
}
