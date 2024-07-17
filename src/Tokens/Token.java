package Tokens;

public class Token {
	public final TokenName name;
	public final Object value;
	
	public Token(TokenName name) {
		this.name = name;
		this.value = null;
	}
	
	public Token(TokenName name, Object value) {
		this.name = name;
		this.value = value;
	}
}
