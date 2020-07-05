package io.github.amaan75.javaspringresttut.services.folderservice.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@Data
@Accessors(chain = true)
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestsCatalog {
  @Id private String folderName;
  private Set<Requests> requests;
}
