import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import parser.Parser;

public class Main {

    private static ParserStarterFacade facade;
    public static void main(String[] args) {
        try {
            facade = new ParserStarterFacade("src/main/resources/code");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        facade.start();
    }
}

class ParserStarterFacade {

    private Parser parser;
    private Scanner scanner;
    private File file;

    public ParserStarterFacade(String pathname) throws FileNotFoundException {
        parser = new Parser();
        file = new File(pathname);
        scanner = new Scanner(file);
    }

    public void start(){
        parser.startParse(scanner);
    }
}
