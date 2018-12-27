package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> forumUsersMap = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >=20)
                .filter(forumUser -> forumUser.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));

        forumUsersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}


//public class StreamMain {
//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);
//    }
//}


//public class StreamMain {
//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//    }
//}


//public class StreamMain {
//    public static void main(String[] args) {
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);
//    }
//}


//        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
//               NumbersGenerator.generateEven(20);


//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        System.out.println("----------with-lambdas----------");
//
//        String text1 = poemBeautifier.beautify("entryText", (text -> "ABC_" + text + "_ABC"));
//        System.out.println(text1);
//
//        String text2 = poemBeautifier.beautify("entryText", (text -> text.toUpperCase()));
//        System.out.println(text2);
//
//        String text3 = poemBeautifier.beautify("entryText", (text -> text.replace("t", "_")));
//        System.out.println(text3);
//
//        System.out.println("----------with-methods----------");
//
//        String text11 = poemBeautifier.beautify("entryText", ReferenceBeautifier::AddABC);
//        System.out.println(text11);
//
//        String text22 = poemBeautifier.beautify("entryText", ReferenceBeautifier::upperCaseText);
//        System.out.println(text22);
//
//        String text33 = poemBeautifier.beautify("entryText", ReferenceBeautifier::replaceT);
//        System.out.println(text33);


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
//    }
//}


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

