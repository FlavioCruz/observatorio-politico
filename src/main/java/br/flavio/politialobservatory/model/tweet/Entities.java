package br.flavio.politialobservatory.model.tweet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hashtags",
        "urls",
        "user_mentions"
})
@Getter
@Setter
@Accessors(chain = true)
public class Entities {

    @JsonProperty("hashtags")
    private List<Object> hashtags = null;
    @JsonProperty("urls")
    private List<Url> urls = null;
    @JsonProperty("user_mentions")
    private List<Object> userMentions = null;
}
