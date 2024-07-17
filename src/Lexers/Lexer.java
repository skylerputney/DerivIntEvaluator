package Lexers;

import java.util.Queue;
import java.util.LinkedList;
import Tokens.Token;
import Tokens.TokenName;

public class Lexer {

	public Queue<Token> tokenize(String input) {
		Queue<Token> tokens = new LinkedList<Token>();
		
		for(int i = 0; i < input.length(); i++) {
			
			if(Character.isWhitespace(input.charAt(i)))
				continue;
			
			if(input.charAt(i) == '=')
				tokens.add(new Token(TokenName.EQUAL));
			else if(input.charAt(i) == '+')
				tokens.add(new Token(TokenName.ADD));
			else if(input.charAt(i) == '-')
				tokens.add(new Token(TokenName.SUBTRACT));
			else if(input.charAt(i) == '*')
				tokens.add(new Token(TokenName.MULTIPLY));
			else if(input.charAt(i) == '/')
				tokens.add(new Token(TokenName.DIVIDE));
			else if(input.charAt(i) == '^')
				tokens.add(new Token(TokenName.POWER));
			else if(input.charAt(i) == '(')
				tokens.add(new Token(TokenName.OPEN_PAREN));
			else if(input.charAt(i) == ')')
				tokens.add(new Token(TokenName.CLOSE_PAREN));
			else if(Character.isLetterOrDigit(input.charAt(i))) {
				int len = 1;
				while ((i + len) < input.length() && Character.isLetterOrDigit(input.charAt(i + len))) {
					i++;
				}
				
				String lexeme = input.substring(i, i + len);
				i += len - 1;
				tokens.add(new Token(TokenName.ALPHANUMERIC, lexeme));
			}
			
		}
		
		return tokens;
	}
}
