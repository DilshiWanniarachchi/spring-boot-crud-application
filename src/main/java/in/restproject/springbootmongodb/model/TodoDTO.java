package in.restproject.springbootmongodb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos")
public class TodoDTO {
    @Id
    private String id;

    @NotNull(message = "Todo can not be null")
    private String todo;

    @NotNull(message = "Description can not be null")
    private String description;

    @NotNull(message = "Completed can not be null")
    private Boolean completed;

    private Date createdAt;
    
    private Date updatedAt;

}
