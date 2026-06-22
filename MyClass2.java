class MyClass2 {

    public static void main(String agrs[]){


        int age = 17;

        try{
            if(age < 18){
                throw new AgeException2("Please provide the legal age : ");
            }
        }catch(AgeException2 ex){

            System.out.println(ex.getMessage());

        }



    }

}