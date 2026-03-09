class LabDemo {
    public static void main(String[] args) {
        System.out.println("Booking 5 computers in Lab...");
        System.out.println("Cancelling 3 computers in Lab...");
        System.out.println();

        Date date1 = new Date(10, 3, 2026);   
        Date date2 = new Date(15, 3, 2026);   

        Lab lab1 = new Lab("COMSATS", "CS", "A", "Programming Lab", 50, date1);
        lab1.bookComputers(12);   

        Lab lab2 = new Lab("COMSATS", "SE", "B", "Networking Lab", 40, date2);
        lab2.bookComputers(5);

        Lab lab3 = new Lab("COMSATS", "CE", "C", "Programming Lab", 50, date1);
        lab3.bookComputers(10);

        System.out.println("Lab 1 Details:");
        System.out.println(lab1);
        System.out.println();

        System.out.println("Lab 2 Details:");
        System.out.println(lab2);
        System.out.println();

        System.out.println("Lab 3 Details:");
        System.out.println(lab3);
        System.out.println();

        System.out.println("Lab1 and Lab3 are NOT equal.");
        System.out.println();

        System.out.println("Total Labs Created: " + Lab.getTotalLabsCreated());
    }
}