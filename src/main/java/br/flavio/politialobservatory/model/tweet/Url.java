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
        "unwound"
})
@Getter
@Setter
@Accessors(chain = true)
public class Url {
    @JsonProperty("url")
    private String url;
    @JsonProperty("unwound")
    private Unwound unwound;
}
