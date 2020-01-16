package br.flavio.politialobservatory.model.User;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

/*
 This class represents the application users
*/
@Getter
@Setter
@Accessors(chain = true)
public abstract class User {
    @Id
    private Integer id;
    private String name;
    private Boolean isAdmin;
}
