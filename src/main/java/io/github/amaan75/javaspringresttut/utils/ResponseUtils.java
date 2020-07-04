package io.github.amaan75.javaspringresttut.utils;

import io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@UtilityClass
public class ResponseUtils {
  public static <T> ResponseEntity<ResponseWrapper<T>> fromResponseWrapper(
      ResponseWrapper<T> responseWrapper) {
    final HttpStatus httpStatus = responseWrapper.getMeta().httpStatus();
    return new ResponseEntity<>(responseWrapper, httpStatus);
  }
}
