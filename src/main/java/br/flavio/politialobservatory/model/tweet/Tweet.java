package br.flavio.politialobservatory.model.tweet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "created_at",
        "id_str",
        "text",
        "user",
        "place",
        "entities"
})
@Getter
@Setter
@Accessors(chain = true)
public class Tweet {
    @Id
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("text")
    private String text;
    @JsonProperty("user")
    private User user;
    @JsonProperty("place")
    private Place place;
    @JsonProperty("entities")
    private Entities entities;

}



