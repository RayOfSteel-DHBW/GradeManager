public class GradeManager {
    private List<Integer> grades;
    private final String filePath = "grades.txt";

    public GradeManager() {
        grades = new ArrayList<>();
        loadGrades();
    }

    public void addGrade(int grade) {
        grades.add(grade);
        saveGrades();
    }

    public void removeGrade(int grade) {
        grades.remove(Integer.valueOf(grade));
        saveGrades();
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    private void saveGrades() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int grade : grades) {
                writer.write(String.valueOf(grade));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadGrades() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                grades.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            // File may not exist yet, ignore
        }
    }

    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        // Example usage
        manager.addGrade(90);
        manager.addGrade(85);
        System.out.println("Grades: " + manager.getGrades());
        manager.removeGrade(85);
        System.out.println("Grades after removal: " + manager.getGrades());
    }
}