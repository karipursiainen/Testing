package fi.agileo.testing;

public class LiianVanhaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  // Ei pakollinen

	public String getMessage() {
		return "Matkustaja ei voi olla liian vanha";
	}

	@Override
	public String toString() {
		return "LiianVanhaException";
	}
	
	
}
