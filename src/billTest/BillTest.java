package billTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bill.Bill;
import bill.Bill.*;

public class BillTest {
	Bill test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		test = new Bill();
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void conformanceTest1() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		
		if (!test.voteFails() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("voteFails failed");
		}
		
		if (!test.modify() || test.stateExpected("inPreparation")) {
			fail("modify failed");
		}
		
	}
	
	@Test
	public void conformanceTest2() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		
		if (!test.withdraw() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("withdraw failed");
		}
		
	}
	
	@Test
	public void conformanceTest3() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("secondReading")) {
			fail("votePasses failed");
		}
		if (!test.voteFails() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("voteFails failed");
		}
		
	}
	
	@Test
	public void conformanceTest4() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("secondReading")) {
			fail("votePasses failed");
		}
		if (!test.withdraw() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("withdraw failed");
		}
	}
	
	@Test
	public void conformanceTest5() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("secondReading")) {
			fail("firstReading votePasses failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("committeeConsideration")) {
			fail("secondReading votePasses failed");
		}
		if (!test.voteFails() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("voteFails failed");
		}
	}
	
	@Test
	public void conformanceTest6() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("secondReading")) {
			fail("firstReading votePasses failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("committeeConsideration")) {
			fail("secondReading votePasses failed");
		}
		if (!test.withdraw() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("withdraw failed");
		}
	}
	
	@Test
	public void conformanceTest7() {
		if (test == null ||
				!test.getIsCommonsBill() ||
				!test.stateExpected("inPreparation") ||
				!test.houseStateExpected("Null") ||
				!test.senateStateExpected("Null")) {
			fail("constructor failed");
		}
		if (!test.introduceInHouse() ||
				!test.stateExpected("inHouseOfCommons") ||
				!test.houseStateExpected("firstReading")) {
			fail("introduceInHouse failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("secondReading")) {
			fail("firstReading votePasses failed");
		}
		if (!test.votePasses() || !test.houseStateExpected("committeeConsideration")) {
			fail("secondReading votePasses failed");
		}
		
		assertFalse(!test.votePasses() || !test.houseStateExpected("thirdReading"));
		
		if (!test.voteFails() ||
				!test.stateExpected("withdrawn") ||
				!test.houseStateExpected("Null")) {
			fail("voteFails failed");
		}
			
	}
	
	@Test
	public void conformanceTest8() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		assertTrue(test.withdraw() && test.stateExpected("withdrawn") && test.houseStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest9() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		
		//isCommonBill not changed to false along this path
		if (test.isIsCommonsBill()) {
			fail("isCommonBill not false");
		}
		assertTrue(!test.getIsCommonsBill() && test.votePasses() && test.stateExpected("awaitingRoyalAssent") && test.houseStateExpected("Null"));

	}
	
	@Test
	public void conformanceTest10() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		if (!test.getIsCommonsBill()) {
			fail("isCommonBill not true");
		}
		assertTrue(test.votePasses() && test.stateExpected("inSenate") && test.houseStateExpected("Null") && test.senateStateExpected("firstReadingS"));
		
	}
	
	@Test
	public void conformanceTest11() {
		
	}
	

}
