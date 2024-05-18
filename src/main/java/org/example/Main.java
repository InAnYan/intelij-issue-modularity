package org.example;

import java.util.Scanner;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.huggingface.HuggingFaceChatModel;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: provide an access token");
            System.exit(1);
        } else if (args.length > 1) {
            System.err.println("Error: too many arguments");
            System.exit(1);
        }

        ChatLanguageModel chatLanguageModel = HuggingFaceChatModel
                .builder()
                .modelId("microsoft/Phi-3-mini-128k-instruct")
                .accessToken(args[0])
                .build();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("User: ");
            String userPrompt = scanner.nextLine();

            if (userPrompt.equals("exit")) {
                break;
            }

            System.out.print("AI: ");
            System.out.println(chatLanguageModel.generate(userPrompt));
        }
    }
}