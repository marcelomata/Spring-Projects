package buildingRESTfulWebService.test.hello;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	@JsonProperty(value="type")
    private String type;
	@JsonProperty(value="value")
    private Value value;
	
	@Override
	public String toString() {
		return "{\"type\":"+type+",\"value\":"+value+"}";
	}
	
}