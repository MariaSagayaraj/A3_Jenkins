import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalTest {

	@Test
	public void addshouldreturnval() {
		Cal c1=new Cal();
		assertEquals (6,c1.add(2,4));
			
	}

	}

