package codificacao_apoio;

public enum Direction {
	
	EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String string, String shortCode) {
		this.shortCode = shortCode;		
	}

	Direction(String string) {
		this.shortCode = "";		
	}

	public String getShortCode() {
        return shortCode;
    }
}
