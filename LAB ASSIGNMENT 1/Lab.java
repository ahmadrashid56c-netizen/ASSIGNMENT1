public class Lab {
    private static int counter = 0;
    private static final String ID_PREFIX = "COM";

    private String id;
    private String universityName;
    private String departmentName;
    private String sectionName;
    private String labName;
    private int totalComputers;
    private int bookedComputers;
    private Date labDate;

    public Lab() {
        this("Unknown", "Unknown", "Unknown", "Unknown Lab", 30, new Date(1, 1, 2025));
    }

    public Lab(String universityName, String departmentName, String sectionName,
               String labName, int totalComputers, Date labDate) {
        this.universityName = universityName;
        this.departmentName = departmentName;
        this.sectionName = sectionName;
        this.labName = labName;
        this.totalComputers = totalComputers;
        this.bookedComputers = 0;
        this.labDate = new Date(labDate);
        counter++;
        this.id = ID_PREFIX + "_" + counter;
    }

    public Lab(Lab other) {
        this.id = other.id;
        this.universityName = other.universityName;
        this.departmentName = other.departmentName;
        this.sectionName = other.sectionName;
        this.labName = other.labName;
        this.totalComputers = other.totalComputers;
        this.bookedComputers = other.bookedComputers;
        this.labDate = new Date(other.labDate);
    }

    public static int getTotalLabsCreated() {
        return counter;
    }

    public String getId() { return id; }
    public int getTotalComputers() { return totalComputers; }
    public int getBookedComputers() { return bookedComputers; }

    public boolean bookComputers(int count) {
        if (count > 0 && bookedComputers + count <= totalComputers) {
            bookedComputers += count;
            return true;
        }
        return false;
    }

    public boolean cancelBooking(int count) {
        if (count > 0 && bookedComputers >= count) {
            bookedComputers -= count;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lab ID: " + id + "\n" +
               "University Name Name: " + universityName + "\n" +
               "Department Name Name: " + departmentName + "\n" +
               "Section Name: " + sectionName + "\n" +
               "Lab Name: " + labName + "\n" +
               "Total Computers: " + totalComputers + "\n" +
               "Booked Computers: " + bookedComputers + "\n" +
               "Lab Date: " + labDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lab other = (Lab) obj;
        return id.equals(other.id) &&
               universityName.equals(other.universityName) &&
               departmentName.equals(other.departmentName) &&
               sectionName.equals(other.sectionName) &&
               labName.equals(other.labName) &&
               totalComputers == other.totalComputers &&
               labDate.equals(other.labDate);
    }
}