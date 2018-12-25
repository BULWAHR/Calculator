package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.reference.ReferenceBeautifier;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("----------with-lambdas----------");

        String text1 = poemBeautifier.beautify("entryText", (text -> "ABC_" + text + "_ABC"));
        System.out.println(text1);

        String text2 = poemBeautifier.beautify("entryText", (text -> text.toUpperCase()));
        System.out.println(text2);

        String text3 = poemBeautifier.beautify("entryText", (text -> text.replace("t", "_")));
        System.out.println(text3);

        System.out.println("----------with-methods----------");

        String text11 = poemBeautifier.beautify("entryText", ReferenceBeautifier::AddABC);
        System.out.println(text11);

        String text22 = poemBeautifier.beautify("entryText", ReferenceBeautifier::upperCaseText);
        System.out.println(text22);

        String text33 = poemBeautifier.beautify("entryText", ReferenceBeautifier::replaceT);
        System.out.println(text33);



//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
}

//package com.kodilla.stream;
//
//import com.kodilla.stream.lambda.Processor;
//
//public class StreamMain {
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//    }
//}

//package com.kodilla.stream;
//
//import com.kodilla.stream.lambda.Executor;
//import com.kodilla.stream.lambda.Processor;
//
//public class StreamMain {
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);
//    }
//}

