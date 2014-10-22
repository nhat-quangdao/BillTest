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
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.voteFails() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest12() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.withdraw() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));	
	}
	
	@Test
	public void conformanceTest13() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.voteFails() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest14() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.withdraw() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest15() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.voteFails() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest16() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.withdraw() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest17() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.voteFails() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest18() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.withdraw() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void conformanceTest19() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void conformanceTest20() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && !test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.houseStateExpected("firstReading") && 
				test.stateExpected("inHouseOfCommons"));
	}
	
	@Test
	public void sneakTest21() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(!test.votePasses() &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest22() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(!test.voteFails() &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest23() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(!test.modify() &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest24() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(!test.withdraw() &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest25() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(!test.royalAssent() &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest48() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.modify() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	@Test
	public void sneakTest49() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.introduceInHouse() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	@Test
	public void sneakTest50() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.introduceInSenate() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	@Test
	public void sneakTest51() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	@Test
	public void sneakTest52() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(!test.modify() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
		}
	
	@Test
	public void sneakTest53() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(!test.introduceInHouse() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
	}
	
	@Test
	public void sneakTest54() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(!test.introduceInSenate() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
	}
	
	@Test
	public void sneakTest55() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
	}
	
	@Test
	public void sneakTest56() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(!test.modify() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}
	
	@Test
	public void sneakTest57() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(!test.introduceInHouse() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}

	@Test
	public void sneakTest58() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(!test.introduceInSenate() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}
	
	@Test
	public void sneakTest59() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}
	
	@Test
	public void sneakTest60() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.modify() && test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	@Test
	public void sneakTest61() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.introduceInHouse() && test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	@Test
	public void sneakTest62() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.introduceInSenate() && test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	@Test
	public void sneakTest63() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.royalAssent() && test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	@Test
	public void sneakTest64() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
		assertTrue(!test.modify() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest65() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
		assertTrue(!test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest66() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
		assertTrue(!test.voteFails() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest67() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
		assertTrue(!test.introduceInHouse() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest68() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
		assertTrue(!test.introduceInSenate() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest69() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
		assertTrue(!test.withdraw() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}

	@Test
	public void sneakTest70() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.modify() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void sneakTest71() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.votePasses() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void sneakTest72() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.voteFails() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void sneakTest73() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.introduceInHouse() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void sneakTest74() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.introduceInSenate() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void sneakTest75() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.withdraw() && test.stateExpected("actOfParliament"));
	}
	
	@Test
	public void sneakTest76() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.isIsCommonsBill() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		assertTrue(!test.royalAssent() && test.stateExpected("actOfParliament"));
	}
	
}
