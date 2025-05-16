import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradeManagerTest {
    private GradeManager gradeManager;

    @BeforeEach
    void setUp() {
        gradeManager = new GradeManager();
    }

    @Test
    void testAddGrade() {
        gradeManager.addGrade("Alice", 90);
        assertEquals(90, gradeManager.getGrade("Alice"));
    }

    @Test
    void testRemoveGrade() {
        gradeManager.addGrade("Bob", 85);
        gradeManager.removeGrade("Bob");
        assertThrows(IllegalArgumentException.class, () -> gradeManager.getGrade("Bob"));
    }

    @Test
    void testGetGrade() {
        gradeManager.addGrade("Charlie", 75);
        assertEquals(75, gradeManager.getGrade("Charlie"));
    }

    @Test
    void testSaveAndLoadGrades() throws IOException {
        gradeManager.addGrade("David", 88);
        gradeManager.saveGrades("grades.txt");

        GradeManager newGradeManager = new GradeManager();
        newGradeManager.loadGrades("grades.txt");
        assertEquals(88, newGradeManager.getGrade("David"));

        // Clean up the test file
        new File("grades.txt").delete();
    }
}