package org.example;

import java.util.Scanner;

import dev.langchain4j.model.embedding.AllMiniLmL6V2EmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;

public class Main {
    public static void main(String[] args) {
        EmbeddingModel model = new AllMiniLmL6V2EmbeddingModel();
    }
}