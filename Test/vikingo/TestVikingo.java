package vikingo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;





public class TestVikingo {

	@Test

	public void testBeber(){
		Vikingo v=new Vikingo();
		v.beber();
		Assert.assertEquals(v.getAtaque(), 7);
	}
	

	
}
