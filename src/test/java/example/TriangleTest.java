package example;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void equilateralTriangleHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    public void isocelesTriangleHaveTwosSides() throws Exception {
        Triangle triangle = new Triangle(6, 6, 8);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    public void scaleneTriangleHaveDifferentSides() throws Exception {
        Triangle triangle = new Triangle(4, 8, 6);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    public void testInvalidZero() throws Exception {
        assertThrows(TriangleException.class, () -> {
            new Triangle(0, 0, 0);
        });
    }

    @Test
    public void testInvalidImpossibleSides() throws Exception {
        assertThrows(TriangleException.class, () -> {
            new Triangle(-3, 8, -6);
        });
    }

    @Test
    public void testInvalidInequality() throws Exception {
        assertThrows(TriangleException.class, () -> {
            new Triangle(1, 8, 6);
        });
    }
}