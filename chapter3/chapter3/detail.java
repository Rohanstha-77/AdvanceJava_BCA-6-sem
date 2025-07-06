package chapter3;

class detail {
    public static void main(String[] args) {
        Students detail = new Students();
        detail.setName("Rohan");
        detail.setSubject("Java");
        String subject = detail.getSubject();
        String name = detail.getName();
        System.out.println(name);
        System.out.println(subject);
    }
    
}