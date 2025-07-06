// package chapter3;

// import java.io.Serializable;

// public class Students implements Serializable {

//     private String StdName;
//     private String StdSubject;

//     //No argument Constructor
//     Students(){

//     }
    
//     public void setter(String stdName,String stdSubject){
//         StdName = stdName;
//         StdSubject = stdSubject;
//     }

//     public String getter(){
//         return StdName ;
//     }
// }

// public class Students {
//     public static void main(String[] args) {
//         Students detail = new Students();
//        String stdname= detail.getter();
//        System.out.println(stdname);
//     }
    
// }


package chapter3;

class Students {
    private String name;
    private String subject;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSubject(){
        return subject;
        
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
}
