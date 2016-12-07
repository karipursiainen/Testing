package fi.agileo.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class MatkustajaTesti {
	
	@Mock
	Profiili mockProfiili;
	
	@Test(expected=LiianVanhaException.class)
	public void testVanhene() throws LiianVanhaException {
		Matkustaja testattava = new Matkustaja(mockProfiili, 25);
		testattava.vanhene(99);
	}
	
	@Test
	public void testVanhenePoikkeus() throws LiianVanhaException {
		Matkustaja testattava = new Matkustaja(mockProfiili, 30);
		int paluuArvo;
		paluuArvo = testattava.vanhene(30);
		
		assertEquals(60, paluuArvo);
	}

}
