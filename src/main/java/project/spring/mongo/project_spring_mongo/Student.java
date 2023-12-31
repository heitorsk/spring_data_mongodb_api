package project.spring.mongo.project_spring_mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Gender gende;
    private Address address;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpendtInBooks;
    private LocalDateTime created;

    public Student(String firstName,
                   String lastName,
                   String email,
                   Gender gende,
                   Address address,
                   List<String> favouriteSubjects,
                   BigDecimal totalSpendtInBooks,
                   LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gende = gende;
        this.address = address;
        this.favouriteSubjects = favouriteSubjects;
        this.totalSpendtInBooks = totalSpendtInBooks;
        this.created = created;
    }
}
