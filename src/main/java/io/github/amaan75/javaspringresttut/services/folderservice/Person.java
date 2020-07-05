package io.github.amaan75.javaspringresttut.services.folderservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/** @author amangulati (@amaan75.github) created on: 05/07/20 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Document
public class Person {
  @Id
  private String id;
  private String name;
  private int age;
}
