package br.flavio.politialobservatory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class PoliticalParty {
    @Id
    private Integer id;
    private String name;
    private List<Candidate> candidates;
}
