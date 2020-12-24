public class People {
    String name;
    int age;
    int height;
    People(){
        name = "name:";
        age = 19;
        height = 161;
    }
    People(String newName, int newAge) {
        name = newName;
        age = newAge;
        height = 161;
    }
    People(String newName, int newAge, int newHeight) {
        name = newName;
        age = newAge;
        height = newHeight;
    }
    public void walk(){
        System.out.println( name + " walk");
    }
    public void voice(){
        System.out.println( name + " voice");
    }
}
