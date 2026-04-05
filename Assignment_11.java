class Assignment_11{

    public static void main(String[] args) {
        
        Thread thread = Thread.currentThread();

        System.out.println("Default Thread Name : "+thread.getName());
        System.out.println("Defoult Thread Priority : "+thread.getPriority());

        thread.setName("MyThread");
        thread.setPriority(3);

        System.out.println();

        System.out.println("Update Thread Name : "+thread.getName());
        System.out.println("Update Thread Priority : "+thread.getPriority());

    }

}