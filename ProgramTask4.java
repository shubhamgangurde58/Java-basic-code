class ProgramTask4 {

    protected void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        ProgramTask4 obj = new ProgramTask4();
        obj = null;

        System.gc();
    }
}