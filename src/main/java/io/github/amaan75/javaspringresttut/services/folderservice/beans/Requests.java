package io.github.amaan75.javaspringresttut.services.folderservice.beans;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.util.MultiValueMap;

/** @author amangulati (@amaan75.github) created on: 05/07/20 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Requests {
  private String url;
  private MultiValueMap<String, String> headers;
  private MultiValueMap<String, String> queryParams;
  private JsonNode body;
}
