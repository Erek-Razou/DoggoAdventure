import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TODO: add more comments for documentation

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input,output;
        OutputGame game = new OutputGame();
        game.showIntro();
        do{
            System.out.print("> ");
            input = br.readLine();
            output = game.run(input);
            System.out.println(output);
        } while (true);
    }
}
