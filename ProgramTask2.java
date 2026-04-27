// 2. Define class person with suitable data member and methods. And extend this class in Manager class.
// Display manager details.

class Person{

    int id;
    String name;
    int age;

    public void setData(int id , String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;

    }

}

class Manager extends Person{

    public void display(){
        System.out.println("Manager Details : ");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}



class ProgramTask2{

    public static void main(String args[]){

        Manager obj = new Manager();

        obj.setData(101, "shubham", 35);
        obj.display();

    }

}
