class AlphabetThread extends Thread{

    public void run(){

        try {
            
            System.out.println("Wait for 3 Second ...");
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAlphabets From A to Z \n");

        for(char ch = 'A'; ch <= 'Z'; ch ++){

            System.out.print(ch+ " ");

        }
        System.out.println("\n");
    }

}
class Assignment_13{

    public static void main(String[] args) {
        
        AlphabetThread at = new AlphabetThread();
        at.start();

    }

}