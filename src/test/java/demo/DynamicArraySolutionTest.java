package demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicArraySolutionTest {

    @Test
    public void appendArrayTest() {
        DynamicArraySolution da = new DynamicArraySolution(1);
        da.appendArray(1, 1, 1);

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        assertEquals(arr, da.seq);
    }


}