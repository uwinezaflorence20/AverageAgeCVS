public class Main {
    public static void main(String[] args) {
        try {
            CSVStreamProcessor.calculateAverageAge("C:\\Users\\user\\OneDrive\\Desktop\\InhertanceAssignment\\AverageAgeCSV\\src\\people.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String path = "C:\\Users\\user\\OneDrive\\Desktop\\InhertanceAssignment\\AverageAgeCSV\\src\\people.csv";
        try {
            double avg = CSVStreamProcessor.calculateAverageAge(path);
            System.out.printf("Average Age: %.2f%n", avg);
        } catch (Exception e) {
            System.err.println("Error reading or processing file:");
            e.printStackTrace();
        }
    }
}
