package io.github.matheusrabelo.microservice.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document
@ApiModel
public class User {
    @Id
    private String id;

    @Size(min = 1, message = "name should have at least 1 character")
    @ApiModelProperty(notes = "should have at least 1 character")
    private String name;

    @Min(value = 1, message = "age should be greater than 1")
    @ApiModelProperty(notes = "should be greater than 1")
    private Integer age;
}
