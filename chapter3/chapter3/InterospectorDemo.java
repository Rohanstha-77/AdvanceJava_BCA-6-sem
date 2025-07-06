package chapter3;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class InterospectorDemo {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(Students.class);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for(PropertyDescriptor pd: propertyDescriptors){
                System.out.println("Property:" +pd.getName());
                System.out.println("Getter:" +pd.getReadMethod());
                System.out.println("Setter:" +pd.getReadMethod());
            }
        } catch (Exception e) {
            e.printStackTrace();            
        }
    }
}