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
	public void sneakTest26() {
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
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest27() {
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
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest28() {
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
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest29() {
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
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest30() {
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
		
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest31() {
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
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest32() {
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
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest33() {
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
		
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest34() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest35() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest36() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest37() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest38() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest39() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest40() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest41() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	
	@Test
	public void sneakTest42() {
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
		
		assertTrue(!test.votePasses() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest43() {
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
		
		assertTrue(!test.voteFails() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest44() {
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
		
		assertTrue(!test.withdraw() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest45() {
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
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest46() {
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
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	@Test
	public void sneakTest47() {
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
		
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}

	public void sneakTest48() {
		
	}
	
	@Test
	public void sneakTest49() {
		
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
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}

}
