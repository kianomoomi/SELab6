package parser;

import codeGenerator.CodeGenerator;
import scanner.lexicalAnalyzer;
import scanner.token.Token;

public class ParserFacade {

    private scanner.lexicalAnalyzer lexicalAnalyzer;
    private CodeGenerator cg;

    public ParserFacade() {
        this.cg = new CodeGenerator();
    }

    void semanticFunction(Rule rule, Token lookAhead){
        cg.semanticFunction(rule.semanticAction, lookAhead);
    }

    void reportMemory(){
        cg.printMemory();
    }

    Token getNextToken(java.util.Scanner sc){
        lexicalAnalyzer = new lexicalAnalyzer(sc);
        return lexicalAnalyzer.getNextToken();
    }

    Token getNextToken(){
        return lexicalAnalyzer.getNextToken();
    }

}
