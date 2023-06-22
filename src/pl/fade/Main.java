package pl.fade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insert value for n: ");
        int n = scanner.nextInt();

        System.out.print("How long should the generated text be? ");
        int length = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Type in seed for the generated text: ");
        String seed = scanner.nextLine();

        System.out.print("Select file with text to train: ");
        String filePath = scanner.nextLine();


        TextGenerator generator = new TextGenerator(n);
        generator.train(filePath);
        generator.displayProbabilities();

        String generatedText = generator.generateText(seed, length);
        System.out.println("Wygenerowany tekst: " + generatedText);
    }
}
