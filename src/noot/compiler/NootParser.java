// $ANTLR 3.5 /Users/Thijs/Development/noot/src/noot/compiler/Noot.g 2013-07-08 18:17:00

  package noot.compiler;
  import noot.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NootParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOSTROPHE", "BECOMES", 
		"BOOL", "CHAR", "CHARACTER", "COMMA", "COMMENT", "CONST", "DEVIDE", "DIGIT", 
		"DO", "ELSE", "EQ", "FALSE", "FI", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", "MINUS", "MODULO", "MORE", 
		"MOREEQ", "MULTIPLY", "NEGATION", "NEQ", "NOOT", "NUMBER", "OD", "OR", 
		"PLUS", "PRINT", "RCURLY", "READ", "RPAREN", "SEMICOLON", "THEN", "TRUE", 
		"UPPER", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int APOSTROPHE=5;
	public static final int BECOMES=6;
	public static final int BOOL=7;
	public static final int CHAR=8;
	public static final int CHARACTER=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CONST=12;
	public static final int DEVIDE=13;
	public static final int DIGIT=14;
	public static final int DO=15;
	public static final int ELSE=16;
	public static final int EQ=17;
	public static final int FALSE=18;
	public static final int FI=19;
	public static final int IDENTIFIER=20;
	public static final int IF=21;
	public static final int INT=22;
	public static final int LCURLY=23;
	public static final int LESS=24;
	public static final int LESSEQ=25;
	public static final int LETTER=26;
	public static final int LOWER=27;
	public static final int LPAREN=28;
	public static final int MINUS=29;
	public static final int MODULO=30;
	public static final int MORE=31;
	public static final int MOREEQ=32;
	public static final int MULTIPLY=33;
	public static final int NEGATION=34;
	public static final int NEQ=35;
	public static final int NOOT=36;
	public static final int NUMBER=37;
	public static final int OD=38;
	public static final int OR=39;
	public static final int PLUS=40;
	public static final int PRINT=41;
	public static final int RCURLY=42;
	public static final int READ=43;
	public static final int RPAREN=44;
	public static final int SEMICOLON=45;
	public static final int THEN=46;
	public static final int TRUE=47;
	public static final int UPPER=48;
	public static final int WHILE=49;
	public static final int WS=50;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NootParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NootParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return NootParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Thijs/Development/noot/src/noot/compiler/Noot.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:90:1: program : NOOT ^ ( command )+ EOF !;
	public final NootParser.program_return program() throws RecognitionException {
		NootParser.program_return retval = new NootParser.program_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token NOOT1=null;
		Token EOF3=null;
		ParserRuleReturnScope command2 =null;

		Node NOOT1_tree=null;
		Node EOF3_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:91:5: ( NOOT ^ ( command )+ EOF !)
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:91:7: NOOT ^ ( command )+ EOF !
			{
			root_0 = (Node)adaptor.nil();


			NOOT1=(Token)match(input,NOOT,FOLLOW_NOOT_in_program862); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NOOT1_tree = (Node)adaptor.create(NOOT1);
			root_0 = (Node)adaptor.becomeRoot(NOOT1_tree, root_0);
			}

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:91:13: ( command )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOL && LA1_0 <= CHARACTER)||LA1_0==CONST||LA1_0==FALSE||(LA1_0 >= IDENTIFIER && LA1_0 <= LCURLY)||(LA1_0 >= LPAREN && LA1_0 <= MINUS)||LA1_0==NEGATION||LA1_0==NUMBER||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==TRUE||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:91:13: command
					{
					pushFollow(FOLLOW_command_in_program865);
					command2=command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command2.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program868); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class command_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "command"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:94:1: command : ( declaration SEMICOLON !| expression SEMICOLON !);
	public final NootParser.command_return command() throws RecognitionException {
		NootParser.command_return retval = new NootParser.command_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token SEMICOLON5=null;
		Token SEMICOLON7=null;
		ParserRuleReturnScope declaration4 =null;
		ParserRuleReturnScope expression6 =null;

		Node SEMICOLON5_tree=null;
		Node SEMICOLON7_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:95:5: ( declaration SEMICOLON !| expression SEMICOLON !)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= BOOL && LA2_0 <= CHAR)||LA2_0==CONST||LA2_0==INT) ) {
				alt2=1;
			}
			else if ( (LA2_0==CHARACTER||LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NEGATION||LA2_0==NUMBER||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==WHILE) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:95:8: declaration SEMICOLON !
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_command891);
					declaration4=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_command893); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:96:8: expression SEMICOLON !
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_expression_in_command903);
					expression6=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_command905); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class declaration_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:99:1: declaration : ( CONST ! constant_declaration | variable_declaration );
	public final NootParser.declaration_return declaration() throws RecognitionException {
		NootParser.declaration_return retval = new NootParser.declaration_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token CONST8=null;
		ParserRuleReturnScope constant_declaration9 =null;
		ParserRuleReturnScope variable_declaration10 =null;

		Node CONST8_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:100:5: ( CONST ! constant_declaration | variable_declaration )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CONST) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= BOOL && LA3_0 <= CHAR)||LA3_0==INT) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:100:8: CONST ! constant_declaration
					{
					root_0 = (Node)adaptor.nil();


					CONST8=(Token)match(input,CONST,FOLLOW_CONST_in_declaration929); if (state.failed) return retval;
					pushFollow(FOLLOW_constant_declaration_in_declaration932);
					constant_declaration9=constant_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration9.getTree());

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:101:8: variable_declaration
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_variable_declaration_in_declaration942);
					variable_declaration10=variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_declaration10.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_declaration_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "constant_declaration"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:104:1: constant_declaration : ( INT ^| CHAR ^| BOOL ^) IDENTIFIER BECOMES ! primary_operand constant_declaration_extention ;
	public final NootParser.constant_declaration_return constant_declaration() throws RecognitionException {
		NootParser.constant_declaration_return retval = new NootParser.constant_declaration_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token INT11=null;
		Token CHAR12=null;
		Token BOOL13=null;
		Token IDENTIFIER14=null;
		Token BECOMES15=null;
		ParserRuleReturnScope primary_operand16 =null;
		ParserRuleReturnScope constant_declaration_extention17 =null;

		Node INT11_tree=null;
		Node CHAR12_tree=null;
		Node BOOL13_tree=null;
		Node IDENTIFIER14_tree=null;
		Node BECOMES15_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:105:5: ( ( INT ^| CHAR ^| BOOL ^) IDENTIFIER BECOMES ! primary_operand constant_declaration_extention )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:105:8: ( INT ^| CHAR ^| BOOL ^) IDENTIFIER BECOMES ! primary_operand constant_declaration_extention
			{
			root_0 = (Node)adaptor.nil();


			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:105:8: ( INT ^| CHAR ^| BOOL ^)
			int alt4=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt4=1;
				}
				break;
			case CHAR:
				{
				alt4=2;
				}
				break;
			case BOOL:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:105:9: INT ^
					{
					INT11=(Token)match(input,INT,FOLLOW_INT_in_constant_declaration962); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT11_tree = new DeclarationNode(INT11) ;
					root_0 = (Node)adaptor.becomeRoot(INT11_tree, root_0);
					}

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:105:33: CHAR ^
					{
					CHAR12=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant_declaration970); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR12_tree = new DeclarationNode(CHAR12) ;
					root_0 = (Node)adaptor.becomeRoot(CHAR12_tree, root_0);
					}

					}
					break;
				case 3 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:105:58: BOOL ^
					{
					BOOL13=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant_declaration978); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOL13_tree = new DeclarationNode(BOOL13) ;
					root_0 = (Node)adaptor.becomeRoot(BOOL13_tree, root_0);
					}

					}
					break;

			}

			IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration985); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER14_tree = new IdentifierNode(IDENTIFIER14) ;
			adaptor.addChild(root_0, IDENTIFIER14_tree);
			}

			BECOMES15=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_constant_declaration990); if (state.failed) return retval;
			pushFollow(FOLLOW_primary_operand_in_constant_declaration993);
			primary_operand16=primary_operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_operand16.getTree());

			pushFollow(FOLLOW_constant_declaration_extention_in_constant_declaration995);
			constant_declaration_extention17=constant_declaration_extention();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration_extention17.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_declaration"


	public static class constant_declaration_extention_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "constant_declaration_extention"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:108:1: constant_declaration_extention : ( COMMA ^ IDENTIFIER BECOMES ! primary_operand constant_declaration_extention )? ;
	public final NootParser.constant_declaration_extention_return constant_declaration_extention() throws RecognitionException {
		NootParser.constant_declaration_extention_return retval = new NootParser.constant_declaration_extention_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token COMMA18=null;
		Token IDENTIFIER19=null;
		Token BECOMES20=null;
		ParserRuleReturnScope primary_operand21 =null;
		ParserRuleReturnScope constant_declaration_extention22 =null;

		Node COMMA18_tree=null;
		Node IDENTIFIER19_tree=null;
		Node BECOMES20_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:109:5: ( ( COMMA ^ IDENTIFIER BECOMES ! primary_operand constant_declaration_extention )? )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:109:8: ( COMMA ^ IDENTIFIER BECOMES ! primary_operand constant_declaration_extention )?
			{
			root_0 = (Node)adaptor.nil();


			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:109:8: ( COMMA ^ IDENTIFIER BECOMES ! primary_operand constant_declaration_extention )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==COMMA) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:109:9: COMMA ^ IDENTIFIER BECOMES ! primary_operand constant_declaration_extention
					{
					COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_constant_declaration_extention1018); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA18_tree = new DeclarationNode(COMMA18) ;
					root_0 = (Node)adaptor.becomeRoot(COMMA18_tree, root_0);
					}

					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration_extention1024); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER19_tree = new IdentifierNode(IDENTIFIER19) ;
					adaptor.addChild(root_0, IDENTIFIER19_tree);
					}

					BECOMES20=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_constant_declaration_extention1029); if (state.failed) return retval;
					pushFollow(FOLLOW_primary_operand_in_constant_declaration_extention1032);
					primary_operand21=primary_operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_operand21.getTree());

					pushFollow(FOLLOW_constant_declaration_extention_in_constant_declaration_extention1034);
					constant_declaration_extention22=constant_declaration_extention();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_declaration_extention22.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_declaration_extention"


	public static class variable_declaration_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:112:1: variable_declaration : ( INT ^| CHAR ^| BOOL ^) IDENTIFIER variable_declaration_extention ;
	public final NootParser.variable_declaration_return variable_declaration() throws RecognitionException {
		NootParser.variable_declaration_return retval = new NootParser.variable_declaration_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token INT23=null;
		Token CHAR24=null;
		Token BOOL25=null;
		Token IDENTIFIER26=null;
		ParserRuleReturnScope variable_declaration_extention27 =null;

		Node INT23_tree=null;
		Node CHAR24_tree=null;
		Node BOOL25_tree=null;
		Node IDENTIFIER26_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:113:5: ( ( INT ^| CHAR ^| BOOL ^) IDENTIFIER variable_declaration_extention )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:113:8: ( INT ^| CHAR ^| BOOL ^) IDENTIFIER variable_declaration_extention
			{
			root_0 = (Node)adaptor.nil();


			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:113:8: ( INT ^| CHAR ^| BOOL ^)
			int alt6=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case CHAR:
				{
				alt6=2;
				}
				break;
			case BOOL:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:113:9: INT ^
					{
					INT23=(Token)match(input,INT,FOLLOW_INT_in_variable_declaration1059); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT23_tree = new DeclarationNode(INT23) ;
					root_0 = (Node)adaptor.becomeRoot(INT23_tree, root_0);
					}

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:113:33: CHAR ^
					{
					CHAR24=(Token)match(input,CHAR,FOLLOW_CHAR_in_variable_declaration1067); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR24_tree = new DeclarationNode(CHAR24) ;
					root_0 = (Node)adaptor.becomeRoot(CHAR24_tree, root_0);
					}

					}
					break;
				case 3 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:113:58: BOOL ^
					{
					BOOL25=(Token)match(input,BOOL,FOLLOW_BOOL_in_variable_declaration1075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOL25_tree = new DeclarationNode(BOOL25) ;
					root_0 = (Node)adaptor.becomeRoot(BOOL25_tree, root_0);
					}

					}
					break;

			}

			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration1082); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER26_tree = new IdentifierNode(IDENTIFIER26) ;
			adaptor.addChild(root_0, IDENTIFIER26_tree);
			}

			pushFollow(FOLLOW_variable_declaration_extention_in_variable_declaration1087);
			variable_declaration_extention27=variable_declaration_extention();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_declaration_extention27.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration"


	public static class variable_declaration_extention_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration_extention"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:116:1: variable_declaration_extention : ( COMMA ^ IDENTIFIER variable_declaration_extention )? ;
	public final NootParser.variable_declaration_extention_return variable_declaration_extention() throws RecognitionException {
		NootParser.variable_declaration_extention_return retval = new NootParser.variable_declaration_extention_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token COMMA28=null;
		Token IDENTIFIER29=null;
		ParserRuleReturnScope variable_declaration_extention30 =null;

		Node COMMA28_tree=null;
		Node IDENTIFIER29_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:117:5: ( ( COMMA ^ IDENTIFIER variable_declaration_extention )? )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:117:8: ( COMMA ^ IDENTIFIER variable_declaration_extention )?
			{
			root_0 = (Node)adaptor.nil();


			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:117:8: ( COMMA ^ IDENTIFIER variable_declaration_extention )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COMMA) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:117:9: COMMA ^ IDENTIFIER variable_declaration_extention
					{
					COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_variable_declaration_extention1110); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA28_tree = new DeclarationNode(COMMA28) ;
					root_0 = (Node)adaptor.becomeRoot(COMMA28_tree, root_0);
					}

					IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration_extention1116); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER29_tree = new IdentifierNode(IDENTIFIER29) ;
					adaptor.addChild(root_0, IDENTIFIER29_tree);
					}

					pushFollow(FOLLOW_variable_declaration_extention_in_variable_declaration_extention1121);
					variable_declaration_extention30=variable_declaration_extention();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_declaration_extention30.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration_extention"


	public static class expression_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:120:1: expression : ( ( IDENTIFIER BECOMES )=> assignment | while_statement | expression_level6 );
	public final NootParser.expression_return expression() throws RecognitionException {
		NootParser.expression_return retval = new NootParser.expression_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		ParserRuleReturnScope assignment31 =null;
		ParserRuleReturnScope while_statement32 =null;
		ParserRuleReturnScope expression_level633 =null;


		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:121:5: ( ( IDENTIFIER BECOMES )=> assignment | while_statement | expression_level6 )
			int alt8=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA8_1 = input.LA(2);
				if ( (synpred1_Noot()) ) {
					alt8=1;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case WHILE:
				{
				alt8=2;
				}
				break;
			case CHARACTER:
			case FALSE:
			case IF:
			case LCURLY:
			case LPAREN:
			case MINUS:
			case NEGATION:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case TRUE:
				{
				alt8=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:121:9: ( IDENTIFIER BECOMES )=> assignment
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_expression1155);
					assignment31=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment31.getTree());

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:122:9: while_statement
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_expression1165);
					while_statement32=while_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement32.getTree());

					}
					break;
				case 3 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:123:9: expression_level6
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_expression_level6_in_expression1175);
					expression_level633=expression_level6();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level633.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignment_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:126:1: assignment : IDENTIFIER BECOMES ^ assignment_extention ;
	public final NootParser.assignment_return assignment() throws RecognitionException {
		NootParser.assignment_return retval = new NootParser.assignment_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token IDENTIFIER34=null;
		Token BECOMES35=null;
		ParserRuleReturnScope assignment_extention36 =null;

		Node IDENTIFIER34_tree=null;
		Node BECOMES35_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:127:5: ( IDENTIFIER BECOMES ^ assignment_extention )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:127:8: IDENTIFIER BECOMES ^ assignment_extention
			{
			root_0 = (Node)adaptor.nil();


			IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment1197); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER34_tree = new IdentifierNode(IDENTIFIER34) ;
			adaptor.addChild(root_0, IDENTIFIER34_tree);
			}

			BECOMES35=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment1202); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES35_tree = new TypeAdoptedNode(BECOMES35) ;
			root_0 = (Node)adaptor.becomeRoot(BECOMES35_tree, root_0);
			}

			pushFollow(FOLLOW_assignment_extention_in_assignment1208);
			assignment_extention36=assignment_extention();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_extention36.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class assignment_extention_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "assignment_extention"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:130:1: assignment_extention : ( ( IDENTIFIER BECOMES )=> IDENTIFIER BECOMES ^ assignment_extention | expression );
	public final NootParser.assignment_extention_return assignment_extention() throws RecognitionException {
		NootParser.assignment_extention_return retval = new NootParser.assignment_extention_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token IDENTIFIER37=null;
		Token BECOMES38=null;
		ParserRuleReturnScope assignment_extention39 =null;
		ParserRuleReturnScope expression40 =null;

		Node IDENTIFIER37_tree=null;
		Node BECOMES38_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:131:5: ( ( IDENTIFIER BECOMES )=> IDENTIFIER BECOMES ^ assignment_extention | expression )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENTIFIER) ) {
				int LA9_1 = input.LA(2);
				if ( (synpred2_Noot()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

			}
			else if ( (LA9_0==CHARACTER||LA9_0==FALSE||LA9_0==IF||LA9_0==LCURLY||(LA9_0 >= LPAREN && LA9_0 <= MINUS)||LA9_0==NEGATION||LA9_0==NUMBER||(LA9_0 >= PLUS && LA9_0 <= PRINT)||LA9_0==READ||LA9_0==TRUE||LA9_0==WHILE) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:131:8: ( IDENTIFIER BECOMES )=> IDENTIFIER BECOMES ^ assignment_extention
					{
					root_0 = (Node)adaptor.nil();


					IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_extention1238); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER37_tree = new IdentifierNode(IDENTIFIER37) ;
					adaptor.addChild(root_0, IDENTIFIER37_tree);
					}

					BECOMES38=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_extention1243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BECOMES38_tree = new TypeAdoptedNode(BECOMES38) ;
					root_0 = (Node)adaptor.becomeRoot(BECOMES38_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_extention_in_assignment_extention1249);
					assignment_extention39=assignment_extention();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_extention39.getTree());

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:132:8: expression
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assignment_extention1258);
					expression40=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression40.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_extention"


	public static class while_statement_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "while_statement"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:135:1: while_statement : WHILE ^ expression DO ! expression OD !;
	public final NootParser.while_statement_return while_statement() throws RecognitionException {
		NootParser.while_statement_return retval = new NootParser.while_statement_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token WHILE41=null;
		Token DO43=null;
		Token OD45=null;
		ParserRuleReturnScope expression42 =null;
		ParserRuleReturnScope expression44 =null;

		Node WHILE41_tree=null;
		Node DO43_tree=null;
		Node OD45_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:136:5: ( WHILE ^ expression DO ! expression OD !)
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:136:9: WHILE ^ expression DO ! expression OD !
			{
			root_0 = (Node)adaptor.nil();


			WHILE41=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1281); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE41_tree = (Node)adaptor.create(WHILE41);
			root_0 = (Node)adaptor.becomeRoot(WHILE41_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_while_statement1284);
			expression42=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression42.getTree());

			DO43=(Token)match(input,DO,FOLLOW_DO_in_while_statement1286); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_while_statement1289);
			expression44=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression44.getTree());

			OD45=(Token)match(input,OD,FOLLOW_OD_in_while_statement1291); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_statement"


	public static class expression_level6_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression_level6"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:139:1: expression_level6 : expression_level5 ( OR ^ expression_level5 )* ;
	public final NootParser.expression_level6_return expression_level6() throws RecognitionException {
		NootParser.expression_level6_return retval = new NootParser.expression_level6_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token OR47=null;
		ParserRuleReturnScope expression_level546 =null;
		ParserRuleReturnScope expression_level548 =null;

		Node OR47_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:140:5: ( expression_level5 ( OR ^ expression_level5 )* )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:140:9: expression_level5 ( OR ^ expression_level5 )*
			{
			root_0 = (Node)adaptor.nil();


			pushFollow(FOLLOW_expression_level5_in_expression_level61316);
			expression_level546=expression_level5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level546.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:140:27: ( OR ^ expression_level5 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==OR) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:140:28: OR ^ expression_level5
					{
					OR47=(Token)match(input,OR,FOLLOW_OR_in_expression_level61319); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR47_tree = new BinaryExpressionNode(OR47) ;
					root_0 = (Node)adaptor.becomeRoot(OR47_tree, root_0);
					}

					pushFollow(FOLLOW_expression_level5_in_expression_level61325);
					expression_level548=expression_level5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level548.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_level6"


	public static class expression_level5_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression_level5"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:143:1: expression_level5 : expression_level4 ( AND ^ expression_level4 )* ;
	public final NootParser.expression_level5_return expression_level5() throws RecognitionException {
		NootParser.expression_level5_return retval = new NootParser.expression_level5_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token AND50=null;
		ParserRuleReturnScope expression_level449 =null;
		ParserRuleReturnScope expression_level451 =null;

		Node AND50_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:144:5: ( expression_level4 ( AND ^ expression_level4 )* )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:144:9: expression_level4 ( AND ^ expression_level4 )*
			{
			root_0 = (Node)adaptor.nil();


			pushFollow(FOLLOW_expression_level4_in_expression_level51350);
			expression_level449=expression_level4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level449.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:144:27: ( AND ^ expression_level4 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AND) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:144:28: AND ^ expression_level4
					{
					AND50=(Token)match(input,AND,FOLLOW_AND_in_expression_level51353); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND50_tree = new BinaryExpressionNode(AND50) ;
					root_0 = (Node)adaptor.becomeRoot(AND50_tree, root_0);
					}

					pushFollow(FOLLOW_expression_level4_in_expression_level51359);
					expression_level451=expression_level4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level451.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_level5"


	public static class expression_level4_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression_level4"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:147:1: expression_level4 : expression_level3 ( ( LESS ^| LESSEQ ^| EQ ^| NEQ ^| MOREEQ ^| MORE ^) expression_level3 )* ;
	public final NootParser.expression_level4_return expression_level4() throws RecognitionException {
		NootParser.expression_level4_return retval = new NootParser.expression_level4_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token LESS53=null;
		Token LESSEQ54=null;
		Token EQ55=null;
		Token NEQ56=null;
		Token MOREEQ57=null;
		Token MORE58=null;
		ParserRuleReturnScope expression_level352 =null;
		ParserRuleReturnScope expression_level359 =null;

		Node LESS53_tree=null;
		Node LESSEQ54_tree=null;
		Node EQ55_tree=null;
		Node NEQ56_tree=null;
		Node MOREEQ57_tree=null;
		Node MORE58_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:5: ( expression_level3 ( ( LESS ^| LESSEQ ^| EQ ^| NEQ ^| MOREEQ ^| MORE ^) expression_level3 )* )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:9: expression_level3 ( ( LESS ^| LESSEQ ^| EQ ^| NEQ ^| MOREEQ ^| MORE ^) expression_level3 )*
			{
			root_0 = (Node)adaptor.nil();


			pushFollow(FOLLOW_expression_level3_in_expression_level41384);
			expression_level352=expression_level3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level352.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:27: ( ( LESS ^| LESSEQ ^| EQ ^| NEQ ^| MOREEQ ^| MORE ^) expression_level3 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==EQ||(LA13_0 >= LESS && LA13_0 <= LESSEQ)||(LA13_0 >= MORE && LA13_0 <= MOREEQ)||LA13_0==NEQ) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:28: ( LESS ^| LESSEQ ^| EQ ^| NEQ ^| MOREEQ ^| MORE ^) expression_level3
					{
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:28: ( LESS ^| LESSEQ ^| EQ ^| NEQ ^| MOREEQ ^| MORE ^)
					int alt12=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt12=1;
						}
						break;
					case LESSEQ:
						{
						alt12=2;
						}
						break;
					case EQ:
						{
						alt12=3;
						}
						break;
					case NEQ:
						{
						alt12=4;
						}
						break;
					case MOREEQ:
						{
						alt12=5;
						}
						break;
					case MORE:
						{
						alt12=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}
					switch (alt12) {
						case 1 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:29: LESS ^
							{
							LESS53=(Token)match(input,LESS,FOLLOW_LESS_in_expression_level41388); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESS53_tree = new BinaryExpressionNode(LESS53) ;
							root_0 = (Node)adaptor.becomeRoot(LESS53_tree, root_0);
							}

							}
							break;
						case 2 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:59: LESSEQ ^
							{
							LESSEQ54=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_expression_level41396); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSEQ54_tree = new BinaryExpressionNode(LESSEQ54) ;
							root_0 = (Node)adaptor.becomeRoot(LESSEQ54_tree, root_0);
							}

							}
							break;
						case 3 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:91: EQ ^
							{
							EQ55=(Token)match(input,EQ,FOLLOW_EQ_in_expression_level41404); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ55_tree = new BinaryExpressionNode(EQ55) ;
							root_0 = (Node)adaptor.becomeRoot(EQ55_tree, root_0);
							}

							}
							break;
						case 4 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:119: NEQ ^
							{
							NEQ56=(Token)match(input,NEQ,FOLLOW_NEQ_in_expression_level41412); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NEQ56_tree = new BinaryExpressionNode(NEQ56) ;
							root_0 = (Node)adaptor.becomeRoot(NEQ56_tree, root_0);
							}

							}
							break;
						case 5 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:148: MOREEQ ^
							{
							MOREEQ57=(Token)match(input,MOREEQ,FOLLOW_MOREEQ_in_expression_level41420); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOREEQ57_tree = new BinaryExpressionNode(MOREEQ57) ;
							root_0 = (Node)adaptor.becomeRoot(MOREEQ57_tree, root_0);
							}

							}
							break;
						case 6 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:148:180: MORE ^
							{
							MORE58=(Token)match(input,MORE,FOLLOW_MORE_in_expression_level41428); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MORE58_tree = new BinaryExpressionNode(MORE58) ;
							root_0 = (Node)adaptor.becomeRoot(MORE58_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_level3_in_expression_level41435);
					expression_level359=expression_level3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level359.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_level4"


	public static class expression_level3_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression_level3"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:151:1: expression_level3 : expression_level2 ( ( PLUS ^| MINUS ^) expression_level2 )* ;
	public final NootParser.expression_level3_return expression_level3() throws RecognitionException {
		NootParser.expression_level3_return retval = new NootParser.expression_level3_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token PLUS61=null;
		Token MINUS62=null;
		ParserRuleReturnScope expression_level260 =null;
		ParserRuleReturnScope expression_level263 =null;

		Node PLUS61_tree=null;
		Node MINUS62_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:5: ( expression_level2 ( ( PLUS ^| MINUS ^) expression_level2 )* )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:9: expression_level2 ( ( PLUS ^| MINUS ^) expression_level2 )*
			{
			root_0 = (Node)adaptor.nil();


			pushFollow(FOLLOW_expression_level2_in_expression_level31461);
			expression_level260=expression_level2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level260.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:27: ( ( PLUS ^| MINUS ^) expression_level2 )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:28: ( PLUS ^| MINUS ^) expression_level2
					{
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:28: ( PLUS ^| MINUS ^)
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==PLUS) ) {
						alt14=1;
					}
					else if ( (LA14_0==MINUS) ) {
						alt14=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:29: PLUS ^
							{
							PLUS61=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression_level31465); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS61_tree = new NumericalExpressionNode(PLUS61) ;
							root_0 = (Node)adaptor.becomeRoot(PLUS61_tree, root_0);
							}

							}
							break;
						case 2 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:152:62: MINUS ^
							{
							MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression_level31473); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS62_tree = new NumericalExpressionNode(MINUS62) ;
							root_0 = (Node)adaptor.becomeRoot(MINUS62_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_level2_in_expression_level31480);
					expression_level263=expression_level2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level263.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_level3"


	public static class expression_level2_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression_level2"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:155:1: expression_level2 : expression_level1 ( ( MULTIPLY ^| DEVIDE ^| MODULO ^) expression_level1 )* ;
	public final NootParser.expression_level2_return expression_level2() throws RecognitionException {
		NootParser.expression_level2_return retval = new NootParser.expression_level2_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token MULTIPLY65=null;
		Token DEVIDE66=null;
		Token MODULO67=null;
		ParserRuleReturnScope expression_level164 =null;
		ParserRuleReturnScope expression_level168 =null;

		Node MULTIPLY65_tree=null;
		Node DEVIDE66_tree=null;
		Node MODULO67_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:5: ( expression_level1 ( ( MULTIPLY ^| DEVIDE ^| MODULO ^) expression_level1 )* )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:9: expression_level1 ( ( MULTIPLY ^| DEVIDE ^| MODULO ^) expression_level1 )*
			{
			root_0 = (Node)adaptor.nil();


			pushFollow(FOLLOW_expression_level1_in_expression_level21507);
			expression_level164=expression_level1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level164.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:27: ( ( MULTIPLY ^| DEVIDE ^| MODULO ^) expression_level1 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==DEVIDE||LA17_0==MODULO||LA17_0==MULTIPLY) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:28: ( MULTIPLY ^| DEVIDE ^| MODULO ^) expression_level1
					{
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:28: ( MULTIPLY ^| DEVIDE ^| MODULO ^)
					int alt16=3;
					switch ( input.LA(1) ) {
					case MULTIPLY:
						{
						alt16=1;
						}
						break;
					case DEVIDE:
						{
						alt16=2;
						}
						break;
					case MODULO:
						{
						alt16=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:29: MULTIPLY ^
							{
							MULTIPLY65=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expression_level21511); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULTIPLY65_tree = new NumericalExpressionNode(MULTIPLY65) ;
							root_0 = (Node)adaptor.becomeRoot(MULTIPLY65_tree, root_0);
							}

							}
							break;
						case 2 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:66: DEVIDE ^
							{
							DEVIDE66=(Token)match(input,DEVIDE,FOLLOW_DEVIDE_in_expression_level21519); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DEVIDE66_tree = new NumericalExpressionNode(DEVIDE66) ;
							root_0 = (Node)adaptor.becomeRoot(DEVIDE66_tree, root_0);
							}

							}
							break;
						case 3 :
							// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:156:101: MODULO ^
							{
							MODULO67=(Token)match(input,MODULO,FOLLOW_MODULO_in_expression_level21527); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODULO67_tree = new NumericalExpressionNode(MODULO67) ;
							root_0 = (Node)adaptor.becomeRoot(MODULO67_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_level1_in_expression_level21534);
					expression_level168=expression_level1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_level168.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_level2"


	public static class expression_level1_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "expression_level1"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:159:1: expression_level1 : ( MINUS ^| NEGATION ^| PLUS ^)? operand ;
	public final NootParser.expression_level1_return expression_level1() throws RecognitionException {
		NootParser.expression_level1_return retval = new NootParser.expression_level1_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token MINUS69=null;
		Token NEGATION70=null;
		Token PLUS71=null;
		ParserRuleReturnScope operand72 =null;

		Node MINUS69_tree=null;
		Node NEGATION70_tree=null;
		Node PLUS71_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:160:5: ( ( MINUS ^| NEGATION ^| PLUS ^)? operand )
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:160:9: ( MINUS ^| NEGATION ^| PLUS ^)? operand
			{
			root_0 = (Node)adaptor.nil();


			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:160:9: ( MINUS ^| NEGATION ^| PLUS ^)?
			int alt18=4;
			switch ( input.LA(1) ) {
				case MINUS:
					{
					alt18=1;
					}
					break;
				case NEGATION:
					{
					alt18=2;
					}
					break;
				case PLUS:
					{
					alt18=3;
					}
					break;
			}
			switch (alt18) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:160:10: MINUS ^
					{
					MINUS69=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression_level11562); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS69_tree = new NumericalExpressionNode(MINUS69) ;
					root_0 = (Node)adaptor.becomeRoot(MINUS69_tree, root_0);
					}

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:160:44: NEGATION ^
					{
					NEGATION70=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_expression_level11570); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NEGATION70_tree = new BinaryExpressionNode(NEGATION70) ;
					root_0 = (Node)adaptor.becomeRoot(NEGATION70_tree, root_0);
					}

					}
					break;
				case 3 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:160:78: PLUS ^
					{
					PLUS71=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression_level11578); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS71_tree = new NumericalExpressionNode(PLUS71) ;
					root_0 = (Node)adaptor.becomeRoot(PLUS71_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_expression_level11586);
			operand72=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operand72.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_level1"


	public static class operand_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:163:1: operand : ( primary_operand | LPAREN ! expression RPAREN !| print_statement | read_statement | compound_expression | if_statement );
	public final NootParser.operand_return operand() throws RecognitionException {
		NootParser.operand_return retval = new NootParser.operand_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token LPAREN74=null;
		Token RPAREN76=null;
		ParserRuleReturnScope primary_operand73 =null;
		ParserRuleReturnScope expression75 =null;
		ParserRuleReturnScope print_statement77 =null;
		ParserRuleReturnScope read_statement78 =null;
		ParserRuleReturnScope compound_expression79 =null;
		ParserRuleReturnScope if_statement80 =null;

		Node LPAREN74_tree=null;
		Node RPAREN76_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:164:5: ( primary_operand | LPAREN ! expression RPAREN !| print_statement | read_statement | compound_expression | if_statement )
			int alt19=6;
			switch ( input.LA(1) ) {
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt19=1;
				}
				break;
			case LPAREN:
				{
				alt19=2;
				}
				break;
			case PRINT:
				{
				alt19=3;
				}
				break;
			case READ:
				{
				alt19=4;
				}
				break;
			case LCURLY:
				{
				alt19=5;
				}
				break;
			case IF:
				{
				alt19=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:164:9: primary_operand
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_primary_operand_in_operand1606);
					primary_operand73=primary_operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_operand73.getTree());

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:165:9: LPAREN ! expression RPAREN !
					{
					root_0 = (Node)adaptor.nil();


					LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1616); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operand1619);
					expression75=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression75.getTree());

					RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1621); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:166:9: print_statement
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1632);
					print_statement77=print_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print_statement77.getTree());

					}
					break;
				case 4 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:167:9: read_statement
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1642);
					read_statement78=read_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_statement78.getTree());

					}
					break;
				case 5 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:168:9: compound_expression
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_compound_expression_in_operand1652);
					compound_expression79=compound_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_expression79.getTree());

					}
					break;
				case 6 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:169:9: if_statement
					{
					root_0 = (Node)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_operand1662);
					if_statement80=if_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement80.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class primary_operand_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "primary_operand"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:172:1: primary_operand : ( TRUE | FALSE | IDENTIFIER | NUMBER | CHARACTER );
	public final NootParser.primary_operand_return primary_operand() throws RecognitionException {
		NootParser.primary_operand_return retval = new NootParser.primary_operand_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token TRUE81=null;
		Token FALSE82=null;
		Token IDENTIFIER83=null;
		Token NUMBER84=null;
		Token CHARACTER85=null;

		Node TRUE81_tree=null;
		Node FALSE82_tree=null;
		Node IDENTIFIER83_tree=null;
		Node NUMBER84_tree=null;
		Node CHARACTER85_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:173:5: ( TRUE | FALSE | IDENTIFIER | NUMBER | CHARACTER )
			int alt20=5;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt20=1;
				}
				break;
			case FALSE:
				{
				alt20=2;
				}
				break;
			case IDENTIFIER:
				{
				alt20=3;
				}
				break;
			case NUMBER:
				{
				alt20=4;
				}
				break;
			case CHARACTER:
				{
				alt20=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:173:9: TRUE
					{
					root_0 = (Node)adaptor.nil();


					TRUE81=(Token)match(input,TRUE,FOLLOW_TRUE_in_primary_operand1685); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE81_tree = new BinaryExpressionNode(TRUE81) ;
					adaptor.addChild(root_0, TRUE81_tree);
					}

					}
					break;
				case 2 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:174:9: FALSE
					{
					root_0 = (Node)adaptor.nil();


					FALSE82=(Token)match(input,FALSE,FOLLOW_FALSE_in_primary_operand1698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE82_tree = new BinaryExpressionNode(FALSE82) ;
					adaptor.addChild(root_0, FALSE82_tree);
					}

					}
					break;
				case 3 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:175:9: IDENTIFIER
					{
					root_0 = (Node)adaptor.nil();


					IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_operand1711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER83_tree = new IdentifierNode(IDENTIFIER83) ;
					adaptor.addChild(root_0, IDENTIFIER83_tree);
					}

					}
					break;
				case 4 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:176:9: NUMBER
					{
					root_0 = (Node)adaptor.nil();


					NUMBER84=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primary_operand1724); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER84_tree = new NumericalExpressionNode(NUMBER84) ;
					adaptor.addChild(root_0, NUMBER84_tree);
					}

					}
					break;
				case 5 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:177:9: CHARACTER
					{
					root_0 = (Node)adaptor.nil();


					CHARACTER85=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_primary_operand1737); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER85_tree = new CharacterExpressionNode(CHARACTER85) ;
					adaptor.addChild(root_0, CHARACTER85_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_operand"


	public static class print_statement_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "print_statement"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:180:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final NootParser.print_statement_return print_statement() throws RecognitionException {
		NootParser.print_statement_return retval = new NootParser.print_statement_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token PRINT86=null;
		Token LPAREN87=null;
		Token COMMA89=null;
		Token RPAREN91=null;
		ParserRuleReturnScope expression88 =null;
		ParserRuleReturnScope expression90 =null;

		Node PRINT86_tree=null;
		Node LPAREN87_tree=null;
		Node COMMA89_tree=null;
		Node RPAREN91_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:181:5: ( PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:181:9: PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Node)adaptor.nil();


			PRINT86=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1763); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT86_tree = new TypeAdoptedNode(PRINT86) ;
			root_0 = (Node)adaptor.becomeRoot(PRINT86_tree, root_0);
			}

			LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1769); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_print_statement1772);
			expression88=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression88.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:181:52: ( COMMA ! expression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:181:53: COMMA ! expression
					{
					COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1775); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_print_statement1778);
					expression90=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression90.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1782); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print_statement"


	public static class read_statement_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "read_statement"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:184:1: read_statement : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final NootParser.read_statement_return read_statement() throws RecognitionException {
		NootParser.read_statement_return retval = new NootParser.read_statement_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token READ92=null;
		Token LPAREN93=null;
		Token IDENTIFIER94=null;
		Token COMMA95=null;
		Token IDENTIFIER96=null;
		Token RPAREN97=null;

		Node READ92_tree=null;
		Node LPAREN93_tree=null;
		Node IDENTIFIER94_tree=null;
		Node COMMA95_tree=null;
		Node IDENTIFIER96_tree=null;
		Node RPAREN97_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:185:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:185:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Node)adaptor.nil();


			READ92=(Token)match(input,READ,FOLLOW_READ_in_read_statement1807); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ92_tree = new TypeAdoptedNode(READ92) ;
			root_0 = (Node)adaptor.becomeRoot(READ92_tree, root_0);
			}

			LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1813); if (state.failed) return retval;
			IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1816); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER94_tree = new IdentifierNode(IDENTIFIER94) ;
			adaptor.addChild(root_0, IDENTIFIER94_tree);
			}

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:185:67: ( COMMA ! IDENTIFIER )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:185:68: COMMA ! IDENTIFIER
					{
					COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1822); if (state.failed) return retval;
					IDENTIFIER96=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement1825); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER96_tree = new IdentifierNode(IDENTIFIER96) ;
					adaptor.addChild(root_0, IDENTIFIER96_tree);
					}

					}
					break;

				default :
					break loop22;
				}
			}

			RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1832); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_statement"


	public static class compound_expression_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "compound_expression"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:188:1: compound_expression : LCURLY ^ ( command )* RCURLY !;
	public final NootParser.compound_expression_return compound_expression() throws RecognitionException {
		NootParser.compound_expression_return retval = new NootParser.compound_expression_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token LCURLY98=null;
		Token RCURLY100=null;
		ParserRuleReturnScope command99 =null;

		Node LCURLY98_tree=null;
		Node RCURLY100_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:189:5: ( LCURLY ^ ( command )* RCURLY !)
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:189:9: LCURLY ^ ( command )* RCURLY !
			{
			root_0 = (Node)adaptor.nil();


			LCURLY98=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_expression1856); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LCURLY98_tree = new TypeAdoptedNode(LCURLY98) ;
			root_0 = (Node)adaptor.becomeRoot(LCURLY98_tree, root_0);
			}

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:189:34: ( command )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= BOOL && LA23_0 <= CHARACTER)||LA23_0==CONST||LA23_0==FALSE||(LA23_0 >= IDENTIFIER && LA23_0 <= LCURLY)||(LA23_0 >= LPAREN && LA23_0 <= MINUS)||LA23_0==NEGATION||LA23_0==NUMBER||(LA23_0 >= PLUS && LA23_0 <= PRINT)||LA23_0==READ||LA23_0==TRUE||LA23_0==WHILE) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:189:34: command
					{
					pushFollow(FOLLOW_command_in_compound_expression1862);
					command99=command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command99.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			RCURLY100=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_expression1865); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_expression"


	public static class if_statement_return extends ParserRuleReturnScope {
		Node tree;
		@Override
		public Node getTree() { return tree; }
	};


	// $ANTLR start "if_statement"
	// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:192:1: if_statement : IF ^ expression THEN ! expression ( ELSE ! expression )? FI !;
	public final NootParser.if_statement_return if_statement() throws RecognitionException {
		NootParser.if_statement_return retval = new NootParser.if_statement_return();
		retval.start = input.LT(1);

		Node root_0 = null;

		Token IF101=null;
		Token THEN103=null;
		Token ELSE105=null;
		Token FI107=null;
		ParserRuleReturnScope expression102 =null;
		ParserRuleReturnScope expression104 =null;
		ParserRuleReturnScope expression106 =null;

		Node IF101_tree=null;
		Node THEN103_tree=null;
		Node ELSE105_tree=null;
		Node FI107_tree=null;

		try {
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:193:5: ( IF ^ expression THEN ! expression ( ELSE ! expression )? FI !)
			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:193:9: IF ^ expression THEN ! expression ( ELSE ! expression )? FI !
			{
			root_0 = (Node)adaptor.nil();


			IF101=(Token)match(input,IF,FOLLOW_IF_in_if_statement1886); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF101_tree = new TypeAdoptedNode(IF101) ;
			root_0 = (Node)adaptor.becomeRoot(IF101_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_if_statement1892);
			expression102=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression102.getTree());

			THEN103=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement1894); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_if_statement1897);
			expression104=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression104.getTree());

			// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:193:58: ( ELSE ! expression )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ELSE) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:193:59: ELSE ! expression
					{
					ELSE105=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1900); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_if_statement1903);
					expression106=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression106.getTree());

					}
					break;

			}

			FI107=(Token)match(input,FI,FOLLOW_FI_in_if_statement1907); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Node)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Node)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_statement"

	// $ANTLR start synpred1_Noot
	public final void synpred1_Noot_fragment() throws RecognitionException {
		// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:121:9: ( IDENTIFIER BECOMES )
		// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:121:10: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Noot1148); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Noot1150); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Noot

	// $ANTLR start synpred2_Noot
	public final void synpred2_Noot_fragment() throws RecognitionException {
		// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:131:8: ( IDENTIFIER BECOMES )
		// /Users/Thijs/Development/noot/src/noot/compiler/Noot.g:131:9: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred2_Noot1231); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred2_Noot1233); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Noot

	// Delegated rules

	public final boolean synpred2_Noot() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Noot_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Noot() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Noot_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_NOOT_in_program862 = new BitSet(new long[]{0x00028B2430F41380L});
	public static final BitSet FOLLOW_command_in_program865 = new BitSet(new long[]{0x00028B2430F41380L});
	public static final BitSet FOLLOW_EOF_in_program868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_command891 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_command893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command903 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_command905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration929 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_declaration942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant_declaration962 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_CHAR_in_constant_declaration970 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BOOL_in_constant_declaration978 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration985 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_constant_declaration990 = new BitSet(new long[]{0x0000802000140200L});
	public static final BitSet FOLLOW_primary_operand_in_constant_declaration993 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_constant_declaration_extention_in_constant_declaration995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_constant_declaration_extention1018 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration_extention1024 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_constant_declaration_extention1029 = new BitSet(new long[]{0x0000802000140200L});
	public static final BitSet FOLLOW_primary_operand_in_constant_declaration_extention1032 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_constant_declaration_extention_in_constant_declaration_extention1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_variable_declaration1059 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_CHAR_in_variable_declaration1067 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BOOL_in_variable_declaration1075 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration1082 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_variable_declaration_extention_in_variable_declaration1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variable_declaration_extention1110 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration_extention1116 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_variable_declaration_extention_in_variable_declaration_extention1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_expression1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_level6_in_expression1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment1197 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment1202 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_assignment_extention_in_assignment1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_extention1238 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_extention1243 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_assignment_extention_in_assignment_extention1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assignment_extention1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1281 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_while_statement1284 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_while_statement1286 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_while_statement1289 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_OD_in_while_statement1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_level5_in_expression_level61316 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_OR_in_expression_level61319 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_expression_level5_in_expression_level61325 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_expression_level4_in_expression_level51350 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_expression_level51353 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_expression_level4_in_expression_level51359 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_expression_level3_in_expression_level41384 = new BitSet(new long[]{0x0000000983020002L});
	public static final BitSet FOLLOW_LESS_in_expression_level41388 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_LESSEQ_in_expression_level41396 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_EQ_in_expression_level41404 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_NEQ_in_expression_level41412 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_MOREEQ_in_expression_level41420 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_MORE_in_expression_level41428 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_expression_level3_in_expression_level41435 = new BitSet(new long[]{0x0000000983020002L});
	public static final BitSet FOLLOW_expression_level2_in_expression_level31461 = new BitSet(new long[]{0x0000010020000002L});
	public static final BitSet FOLLOW_PLUS_in_expression_level31465 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_MINUS_in_expression_level31473 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_expression_level2_in_expression_level31480 = new BitSet(new long[]{0x0000010020000002L});
	public static final BitSet FOLLOW_expression_level1_in_expression_level21507 = new BitSet(new long[]{0x0000000240002002L});
	public static final BitSet FOLLOW_MULTIPLY_in_expression_level21511 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_DEVIDE_in_expression_level21519 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_MODULO_in_expression_level21527 = new BitSet(new long[]{0x00008B2430B40200L});
	public static final BitSet FOLLOW_expression_level1_in_expression_level21534 = new BitSet(new long[]{0x0000000240002002L});
	public static final BitSet FOLLOW_MINUS_in_expression_level11562 = new BitSet(new long[]{0x00008A2010B40200L});
	public static final BitSet FOLLOW_NEGATION_in_expression_level11570 = new BitSet(new long[]{0x00008A2010B40200L});
	public static final BitSet FOLLOW_PLUS_in_expression_level11578 = new BitSet(new long[]{0x00008A2010B40200L});
	public static final BitSet FOLLOW_operand_in_expression_level11586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_operand_in_operand1606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1616 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_operand1619 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_expression_in_operand1652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_operand1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_primary_operand1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_primary_operand1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary_operand1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_primary_operand1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_primary_operand1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1763 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1769 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_print_statement1772 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1775 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_print_statement1778 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1807 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1813 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1816 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1822 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement1825 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_expression1856 = new BitSet(new long[]{0x00028F2430F41380L});
	public static final BitSet FOLLOW_command_in_compound_expression1862 = new BitSet(new long[]{0x00028F2430F41380L});
	public static final BitSet FOLLOW_RCURLY_in_compound_expression1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1886 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_if_statement1892 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_THEN_in_if_statement1894 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_if_statement1897 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1900 = new BitSet(new long[]{0x00028B2430B40200L});
	public static final BitSet FOLLOW_expression_in_if_statement1903 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_FI_in_if_statement1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Noot1148 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Noot1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred2_Noot1231 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred2_Noot1233 = new BitSet(new long[]{0x0000000000000002L});
}
