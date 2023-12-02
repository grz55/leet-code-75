package pl.grz55.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    void shouldFailOnEmptyArray() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] arrayWithDuplicates = {};
        assertFalse(containsDuplicate.containsDuplicate(arrayWithDuplicates));
    }

    @Test
    void shouldFailOnSingleElementArray() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] arrayWithDuplicates = {5};
        assertFalse(containsDuplicate.containsDuplicate(arrayWithDuplicates));
    }

    @Test
    void shouldPassOnArrayWithDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] arrayWithDuplicates = {5, 7, 9, 3, 4, 5};
        assertTrue(containsDuplicate.containsDuplicate(arrayWithDuplicates));
    }

    @Test
    void shouldPassOnArrayWithDuplicates2() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] arrayWithDuplicates = {5, 7, 2, 3, 4, 1, 2};
        assertTrue(containsDuplicate.containsDuplicate(arrayWithDuplicates));
    }

    @Test
    void shouldFailOnArrayWithDistinctValues3() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 6};
        assertFalse(containsDuplicate.containsDuplicate(arrayWithDuplicates));
    }
}
