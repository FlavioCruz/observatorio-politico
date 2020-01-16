package br.flavio.politialobservatory.model.tweet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url",
        "title"
})
@Getter
@Setter
@Accessors(chain = true)
public class Unwound {
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
}
