package br.flavio.politialobservatory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url",
        "title"
})
@Getter
@Setter
public class Unwound {
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
}
