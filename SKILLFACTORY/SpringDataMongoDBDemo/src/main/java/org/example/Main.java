package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
        @SpringBootApplication
        public static class AccessingDataMongodbApplication implements CommandLineRunner {
          @Autowired
          private UserRepository repository;

          public static void main(String[] args) {
            SpringApplication.run(AccessingDataMongodbApplication.class, args);
          }

          @Override
          public void run(String... args) throws Exception {

              repository.deleteAll();

              saveUser("Tester", "Testerov", "test@test.com", "+79123456789");
              saveUser("Anton", "Testerov", "test@test.com", "+79131245678");
              saveUser("User", "ForUpdateAndDelete", "rr@test.com", "+000");
              updateUser("User", "TERETRT");
              deleteUser("TERETRT");

              System.out.println("Customers found with findAll():");
              System.out.println("-------------------------------");
              for (User user : repository.findAll()) {
                  System.out.println(user);
              }
              System.out.println();

              System.out.println("Customer found with findByFirstName('Tester'):");
              System.out.println("----------------------------------------------");
              System.out.println(repository.findByFirstName("Tester"));

              System.out.println("Customers found with findByEmail('test@test.com'):");
              System.out.println("--------------------------------------------------");
              for (User user : repository.findByEmail("test@test.com")) {
                  System.out.println(user);
              }
          }

          void saveUser(String firstName, String lastName, String email, String phone) {
              repository.save(new User(firstName, lastName, email, phone));
          }

          void updateUser(String oldFirstName, String newFirstName) {
              User user = repository.findByFirstName(oldFirstName);
              user.firstName = newFirstName;
              repository.save(user);
          }

          void deleteUser(String firstName) {
              repository.deletePersonByFirstName(firstName);
          }
    }
}
