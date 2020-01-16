package br.flavio.politialobservatory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hashtags",
        "urls",
        "user_mentions"
})
public class Entities {

    @JsonProperty("hashtags")
    private List<Object> hashtags = null;
    @JsonProperty("urls")
    private List<Url> urls = null;
    @JsonProperty("user_mentions")
    private List<Object> userMentions = null;
}
