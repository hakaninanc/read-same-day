package com.getir.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
public class Order implements Serializable {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate createDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate deliveryDate;

    private String status;

    private Customer customer;

    private List<Book> books;
}
