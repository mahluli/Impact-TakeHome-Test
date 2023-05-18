package numberrangesummarizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberRangeSummarizerTest {
	//This module test the collect method on the interface.
	@Test
	void testCase1() {
		DemoNumberRangeSummarizer inputCollector = new DemoNumberRangeSummarizer();
		Collection<Integer> results = inputCollector.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
		assertEquals(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31), results);
	}
	//This module test the summarizeCollection	 method on the interface.
	@Test
	void testCase2() {
		DemoNumberRangeSummarizer inputCollector = new DemoNumberRangeSummarizer();
		Collection<Integer> results = inputCollector.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
		String summerizedRange = inputCollector.summarizeCollection(results);
		assertEquals("1, 3, 6 - 8, 12 - 15, 21 - 24, 31", summerizedRange);
		}

}
