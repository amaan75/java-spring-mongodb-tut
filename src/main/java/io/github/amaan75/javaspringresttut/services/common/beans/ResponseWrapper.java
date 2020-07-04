package io.github.amaan75.javaspringresttut.services.common.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;

import static io.github.amaan75.javaspringresttut.services.common.beans.Meta.fromHttpStatus;
import static io.github.amaan75.javaspringresttut.services.common.beans.Meta.genericSuccessMeta;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapper<T> {
  private T data;
  private Meta meta;

  public static <T> ResponseWrapper<T> genericSuccessResponse(T data) {
    return new ResponseWrapper<>(data, genericSuccessMeta());
  }

  public static <T> ResponseWrapper<T> successResponse(T data, HttpStatus status) {
    return new ResponseWrapper<>(data, fromHttpStatus(status));
  }
}
