package Parsers;

import java.util.Queue;
import Tokens.Token;
import Tokens.TokenName;
import Lexers.Lexer;

public class Parser {

	private Queue<Token> tokens;
	
	public String analyze(String input) {
		tokens = new Lexer().tokenize(input);
		
		String result = "";
		
		return result;
	}
	
	/**
	 * @brief Peeks at the next token in the queue and returns false if its name does not match the param name,
	 * 			removes it and returns true if its name matches param name
	 * @param name TokenName/type of token to accept
	 * @return true if next token from queue's name matched param name and token was removed from queue, false otherwise
	 */
	private boolean accept(TokenName name) {
		if(tokens.peek().name != name)
			return false;
		
		tokens.remove();
		return true;
	}
	
	/**
	 * @brief Peeks at the next token in the queue and returns true if its name matches param name
	 * @param name Expected token name
	 * @return true if next token from queue's TokenName matches name, false otherwise
	 */
	private boolean peek(TokenName name) {
		return tokens.peek().name == name;
	}
	
	/**
	 * @brief Peeks at the next token in the queue and throws an exception if its TokenName/type doesn't match param name
	 * 			and returns the token value if it does match
	 * @param name Expected token name	 
	 * @return value of removed Token
	 */
	private Object expect(TokenName name) {
		if(tokens.peek().name != name)
			throw new RuntimeException("Expected: " + name + ", but found: " + tokens.peek().name);
		
		return tokens.remove().value;
	}
	
	
}
