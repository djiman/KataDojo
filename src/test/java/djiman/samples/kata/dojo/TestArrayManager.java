package djiman.samples.kata.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import djiman.samples.kata.config.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestArrayManager {

	@Autowired
	private ArrayManager arrayManager;
	
	@Test
	public void testIsIntPresentInArray_Present_1Element() {
		int [] numbers = {1};
		assertEquals(true, arrayManager.isIntPresentInArray(numbers, 1));
	}
	
	@Test
	public void testIsIntPresentInArray_Absent_1Element() {
		int [] numbers = {1};
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 2));
	}
	
	@Test
	public void testIsIntPresentInArray_Present_2Elements() {
		int [] numbers = {1, 2};
		assertEquals(true, arrayManager.isIntPresentInArray(numbers, 1));
	}
	
	@Test
	public void testIsIntPresentInArray_Absent_2Elements() {
		int [] numbers = {1, 2};
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 3));
	}
	
	@Test
	public void testIsIntPresentInArray_Present_3Elements() {
		int [] numbers = { 1, 2, 4};
		assertEquals(true, arrayManager.isIntPresentInArray(numbers, 4));
	}
	
	@Test
	public void testIsIntPresentInArray_Absent_3Elements() {
		int [] numbers = { 1, 2, 4};
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 3));
	}
	
	@Test
	public void testIsIntPresentInArray_Present_4Elements() {
		int [] numbers = { 1, 2, 4, 6};
		assertEquals(true, arrayManager.isIntPresentInArray(numbers, 4));
		assertEquals(true, arrayManager.isIntPresentInArray(numbers, 6));
	}
	
	@Test
	public void testIsIntPresentInArray_Absent_4Elements() {
		int [] numbers = { 1, 2, 4, 6};
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 3));
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 5));
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 9));
	}
	
	@Test
	public void testIsIntPresentInArray_present_20Elements() {
		int [] numbers = { 1, 2, 4, 6, 7, 9, 10, 13, 14, 15, 17, 18, 19, 20, 23, 25, 26, 28, 29, 30};
		assertEquals(false, arrayManager.isIntPresentInArray(numbers, 12));
	}

}
