package io.github.amaan75.javaspringresttut.services.common.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
@NoArgsConstructor
public class Meta {
  private int statusCode;
  private String message;


  public HttpStatus httpStatus(){
    return HttpStatus.valueOf(statusCode);
  }

  public static Meta fromHttpStatus(HttpStatus status) {
    return new Meta(status.value(), status.getReasonPhrase());
  }

  public static Meta genericSuccessMeta() {
    return new Meta(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase());
  }
}
