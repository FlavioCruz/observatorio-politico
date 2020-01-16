package br.flavio.politialobservatory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Accessors(chain = true)
public class Keyword {
    @Id
    private Integer id;
    private String word;
}
