package buildingRESTfulWebService.test.hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	@JsonProperty(value="id")
    private Long id;
	@JsonProperty(value="quote")
    private String quote;
    
	
	@Override
	public String toString() {
		return "{\"id\":\""+id+"\",\"quote\":\""+quote+"\"}";
	}
}