package billTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bill.CorrectedBill;

public class CorrectedBillTest {
	CorrectedBill test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		test = new CorrectedBill();
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}
	
	//Corresponds to Test Case #1
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
		
		if (!test.modify() || !test.stateExpected("inPreparation")) {
			fail("modify failed");
		}
		
	}
	
	//Corresponds to Test Case #2
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
	
	//Corresponds to Test Case #3
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
	
	//Corresponds to Test Case #4
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
	
	//Corresponds to Test Case #5
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
	
	//Corresponds to Test Case #6
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
	
	//Corresponds to Test Case #7
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
	
	//Corresponds to Test Case #8
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
	
	//Corresponds to Test Case #9, expected to fail due to trying to go straight from inHouseOfCommons to awaitingRoyalAssent
	//without going through inSenate
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
		assertTrue(!test.getIsCommonsBill() && test.votePasses() && test.stateExpected("awaitingRoyalAssent") && test.houseStateExpected("Null"));

	}
	
	//Corresponds to Test Case #10
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
		
		assertTrue(test.votePasses() && test.getIsCommonsBill() && test.stateExpected("inSenate") && test.houseStateExpected("Null") && test.senateStateExpected("firstReadingS"));
		
	}
	
	//Corresponds to Test Case #11
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
	
	//Corresponds to Test Case #12
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
	
	//Corresponds to Test Case #13
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
	
	//Corresponds to Test Case #14
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
	
	//Corresponds to Test Case #15
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
	
	//Corresponds to Test Case #16
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
	
	//Corresponds to Test Case #17
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.voteFails() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #18
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.withdraw() && test.stateExpected("withdrawn") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #19, expected to fail due to trying to go straight from inSenate to awaitingRoyalAssent
	//without going through inHouseOfCommons
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #20
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && !test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.houseStateExpected("firstReading") && 
				test.stateExpected("inHouseOfCommons"));
	}
	
	//Corresponding to test case #21
	@Test
	public void conformanceTest21() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(test.royalAssent() && test.stateExpected("actOfParliament"));
		
	}
	
	//Corresponds to Test Case #22
	@Test
	public void sneakTest22() {
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
	
	//Corresponds to Test Case #23
	@Test
	public void sneakTest23() {
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
	
	//Corresponds to Test Case #24
	@Test
	public void sneakTest24() {
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
	//Corresponds to Test Case #25
	@Test
	public void sneakTest25() {
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
	
	//Corresponds to Test Case #26
	@Test
	public void sneakTest26() {
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
	
	//Corresponds to Test Case #27
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
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #28
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
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #29
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
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #30
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
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("firstReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #31
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
		
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #32
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
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #33
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
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("secondReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #34
	@Test
	public void sneakTest34() {
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
	
	//Corresponds to Test Case #35
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
		
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #36
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
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #37
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
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #38
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
		
		assertTrue(!test.royalAssent() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("committeeConsideration") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #39
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
		
		assertTrue(!test.modify() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #40
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
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #41
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
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("inHouseOfCommons") &&
				test.houseStateExpected("thirdReading") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #42
	@Test
	public void sneakTest42() {
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
	
	//Corresponds to Test Case #43
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
		
		assertTrue(!test.votePasses() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #44
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
		
		assertTrue(!test.voteFails() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #45
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
		
		assertTrue(!test.withdraw() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #46
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
		
		assertTrue(!test.introduceInHouse() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #47
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
		
		assertTrue(!test.introduceInSenate() &&
				test.isIsCommonsBill() &&
				test.stateExpected("withdrawn") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #48
	@Test
	public void sneakTest48() {
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
	
	//Corresponds to Test Case #49
	@Test
	public void sneakTest49() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.modify() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	//Corresponds to Test Case #50
	@Test
	public void sneakTest50() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.introduceInHouse() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	//Corresponds to Test Case #51
	@Test
	public void sneakTest51() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.introduceInSenate() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	//Corresponds to Test Case #52
	@Test
	public void sneakTest52() {
		assertTrue(test != null && test.isIsCommonsBill() && test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") && test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && !test.isIsCommonsBill() && 
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("firstReadingS"));
	}
	
	//Corresponds to Test Case #53
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
		assertTrue(!test.modify() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
		}
	
	//Corresponds to Test Case #54
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
		assertTrue(!test.introduceInHouse() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
	}
	
	//Corresponds to Test Case #55
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
		assertTrue(!test.introduceInSenate() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
	}
	
	//Corresponds to Test Case #56
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
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("secondReadingS"));
	}
	
	//Corresponds to Test Case #57
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
		assertTrue(!test.modify() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}
	
	//Corresponds to Test Case #58
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
		assertTrue(!test.introduceInHouse() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}

	//Corresponds to Test Case #59
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
		assertTrue(!test.introduceInSenate() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}
	
	//Corresponds to Test Case #60
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
		assertTrue(!test.royalAssent() && !test.isIsCommonsBill() &&
				test.stateExpected("inSenate") && test.senateStateExpected("committeeConsiderationS"));
	}
	
	//Corresponds to Test Case #61
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.modify() && test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	//Corresponds to Test Case #62
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.introduceInHouse() && test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	//Corresponds to Test Case #63
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.introduceInSenate() &&	test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	//Corresponds to Test Case #64
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(!test.royalAssent() && test.stateExpected("inSenate") && test.senateStateExpected("thirdReadingS"));
	}
	
	//Corresponds to Test Case #65
	@Test
	public void sneakTest65() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(!test.modify() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #66
	@Test
	public void sneakTest66() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(!test.votePasses() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #67
	@Test
	public void sneakTest67() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(!test.voteFails() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #68
	@Test
	public void sneakTest68() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(!test.introduceInHouse() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #69
	@Test
	public void sneakTest69() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(!test.introduceInSenate() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #70
	@Test
	public void sneakTest70() {
		conformanceTest10();
		assertTrue(test.votePasses() && test.senateStateExpected("secondReadingS"));
		assertTrue(test.votePasses() && test.senateStateExpected("committeeConsiderationS"));
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && test.getIsCommonsBill() && 
				test.senateStateExpected("Null") && test.stateExpected("awaitingRoyalAssent"));
		assertTrue(!test.withdraw() && test.getIsCommonsBill() &&
				test.stateExpected("awaitingRoyalAssent") && test.senateStateExpected("Null"));
	}
	
	//Corresponds to Test Case #71
	@Test
	public void sneakTest71() {
		conformanceTest21();
		assertTrue(!test.modify() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #72
	@Test
	public void sneakTest72() {
		conformanceTest21();
		assertTrue(!test.votePasses() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #73
	@Test
	public void sneakTest73() {
		conformanceTest21();
		assertTrue(!test.voteFails() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #74
	@Test
	public void sneakTest74() {
		conformanceTest21();
		assertTrue(!test.introduceInHouse() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #75
	@Test
	public void sneakTest75() {
		conformanceTest21();
		assertTrue(!test.introduceInSenate() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #76
	@Test
	public void sneakTest76() {
		conformanceTest21();
		assertTrue(!test.withdraw() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponds to Test Case #77
	@Test
	public void sneakTest77() {
		conformanceTest21();
		assertTrue(!test.royalAssent() && test.stateExpected("actOfParliament"));
	}
	
	//Corresponding to test case #78
	@Test
	public void whiteBoxTest78() {
		conformanceTest2();
		assertTrue(test.modify() && test.stateExpected("inPreparation"));
	}
	
	//Corresponding to test case #79
	@Test
	public void whiteBoxTest79() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.voteDenied() && test.houseStateExpected("lastReading"));
		
	}
	
	//Corresponding to test case #80
	@Test
	public void whiteBoxTest80() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInSenate() && 
				!test.isIsCommonsBill() && 
				test.senateStateExpected("firstReadingS"));
		assertTrue(test.voteDenied() && test.senateStateExpected("firstReadingS"));
	}
	
	//Corresponding to test case #81
	@Test
	public void whiteBoxTest81() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertTrue(!test.voteDenied() && test.stateExpected("inPreparation"));
	}
	
	//Corresponding to test case #82
	@Test
	public void whiteBoxTest82() {
		assertTrue(test != null &&
				test.getIsCommonsBill() &&
				test.stateExpected("inPreparation") &&
				test.houseStateExpected("Null") &&
				test.senateStateExpected("Null"));
		assertTrue(test.introduceInHouse() && test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("secondReading"));
		assertTrue(test.votePasses() && test.houseStateExpected("committeeConsideration"));
		
		assertTrue(test.votePasses() && test.houseStateExpected("thirdReading"));
		assertTrue(test.setIsCommonsBill(false));
		assertTrue(test.votePasses() && !test.getIsCommonsBill() && test.stateExpected("awaitingRoyalAssent") && test.houseStateExpected("Null"));
	}
	
	//Corresponding to test case #83
	@Test
	public void whiteBoxTest83() {
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
		assertTrue(test.votePasses() && test.senateStateExpected("thirdReadingS"));
		assertTrue(test.votePasses() && !test.getIsCommonsBill() && test.senateStateExpected("Null") && 
				test.stateExpected("inHouseOfCommons") && test.houseStateExpected("firstReading"));
	}
	
	//Correspondng to test case #84
	@Test
	public void whiteBoxTest84() {
		assertTrue(test != null && 
				test.isIsCommonsBill() && 
				test.stateExpected("inPreparation") && 
				test.houseStateExpected("Null") && 
				test.senateStateExpected("Null"));
		assertEquals(test.toString(), test.getClass().getName() + "@" + Integer.toHexString(test.hashCode()) + "["+
	            "isCommonsBill" + ":" + test.getIsCommonsBill()+ "]");
	}
	
}
