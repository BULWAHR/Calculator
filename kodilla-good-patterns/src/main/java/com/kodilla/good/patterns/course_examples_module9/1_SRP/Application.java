//klasa ćwiczeniowa



//package com.kodilla.good.patterns.course_examples_SRP;
//
//import java.time.LocalDateTime;
//
//public class Application {
//
//    public static void main(String[] args) {
//        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever;
//        RentRequest rentRequest = rentRequestRetriever.retrieve();
//
//        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),
//                new CarRentalService(),
//                new CarRentalRepository());
//        rentalProcessor.process(rentRequest);
//    }
//}



//------------------------------------------------------------------------------
//public class Application {
//
//    public static void main(String[] args) {
//        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever;
//        RentRequest rentRequest = rentRequestRetriever.retrieve();
//
//        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),
//                new CarRentalService(),
//                new CarRentalRepository());
//        rentalProcessor.process(user, rentFrom, rentTo);
//    }
//}



//------------------------------------------------------------------------------
//public class Application {
//
//    public static void main(String[] args) {
//
//        User user = new User("John", "Wekl");
//
//        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
//        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);
//
//        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),
//                new CarRentalService(),
//                new CarRentalRepository());
//        rentalProcessor.process(user, rentFrom, rentTo);
//    }
//}



//------------------------------------------------------------------------------
//public class Application {
//
//    public static void main(String[] args) {
//
//        User user = new User ("John", "Wekl");
//
//        LocalDateTime rentFrom = LocalDateTime.of(207, 8, 1, 12, 0);
//        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);
//
//        CarRentalService carRentalService = new CarRentalService();
//        boolean isRented = carRentalService.rent(user, rentFrom, rentTo);
//
//        if(isRented) {
//            mailService.sendEmail(user);
//            carRentalRepository.createCarRental(user, rentFrom, rentTo);//
//        } else {
//            System.out.println("Car rent has been rejected");
//        }
//    }
//}
