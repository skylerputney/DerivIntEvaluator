package Tokens;

public enum TokenName {
	ALPHANUMERIC, // regex [A-Z | 0-9]
	VARIABLE, // regex /A-Z/i
	NUMBER, // regex /[0-9]+
	ADD, // regex /+/
	SUBTRACT, // regex /-/
	MULTIPLY, // regex /*/
	DIVIDE, // regex /\//
	POWER, // regex /^/
	EQUAL, // regex /=/
	OPEN_PAREN, // regex /\(/
	CLOSE_PAREN, // regex /\)/

	END_OF_INPUT, // signifies end of input
	UNEXPECTED_INPUT // signifies unexpected input sequence
};
