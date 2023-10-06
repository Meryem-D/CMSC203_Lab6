import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class GradebookTester {

	// create at least two objects of GradeBook to hold 5 scores.
	// Then call the addScore method for each of the GradeBook 
	// objects at least twice (but no more than 5 times) to add
	// some random scores of your choice to the GradeBook objects
	
	private GradeBook g1, g2;
	@BeforeEach
	public void setUp() throws Exception 
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(65.0);
		g1.addScore(40.0);
		g2.addScore(10.0);
		g2.addScore(100.0);
		
	}
	// set the two objects of GradeBook to null.
	@AfterEach
	public void tearDown()
	{
		g1 = g2 = null;
	}
	
	//	Use the toString method to compare the contents of what
	// is in the scores array vs. what is expected to be in the
	// scores array assertTrue( . . .)
	@Test
	public void testAddScore() 
	{
		assertTrue(g1.toString().equals("65.0 40.0 "));
		assertTrue(g2.toString().equals("10.0 100.0 "));
		assertEquals(g1.getScoreSize(), 2);
		assertEquals(g2.getScoreSize(), 2);
	}
	
	//Compare what is returned by sum() to the expected sum of
	// the scores entered.
	@Test
	public void testSum() 
	{
		assertEquals(105.0, g1.sum(), .0001);
		assertEquals(110.0, g2.sum(), .0001);
	}
	
	//	Compare what is returned by minimum() to the expected 
	// minimum of the scores entered.
	@Test
	public void testMinimum() 
	{
		assertEquals(40.0, g1.minimum(), .001);
		assertEquals(10.0, g2.minimum(), .001);
	}
	
	//	Compare what is returned by finalScore() to the expected
	// finalScore of the scores entered. The finalScore is the sum 
	// of the scores, with the lowest score dropped if there are 
	// at least two scores, or 0 if there are no scores.
	@Test
	public void testFinalScore() 
	{
		assertEquals(65.0, g1.finalScore(), .0001);
		assertEquals(100.0, g2.finalScore(), .0001);
	}


}
