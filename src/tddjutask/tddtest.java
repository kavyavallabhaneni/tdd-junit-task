package tddjutask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tddtest {

	@Test
	void testremove() {
		RemoveA ra=new RemoveA();
		String k;
		k=ra.rem("KAVYA");
		assertEquals("KVYA",k);
	}

}
