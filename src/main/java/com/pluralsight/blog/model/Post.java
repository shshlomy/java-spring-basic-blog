package com.pluralsight.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@AllArgsConstructor
@Data
public class Post {
    private Long id;
    private String title;
    private String lead;
    private String body;
    private String author;
    private Date date;

    public String getDateStr() {
        DateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy");
        return outputFormatter.format(this.date);
    }

}
