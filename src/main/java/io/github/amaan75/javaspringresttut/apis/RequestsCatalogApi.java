package io.github.amaan75.javaspringresttut.apis;

import io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper;
import io.github.amaan75.javaspringresttut.services.folderservice.beans.RequestsCatalog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper.genericSuccessResponse;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@RestController
@Slf4j
@RequestMapping("/folders")
@CrossOrigin(origins = "*")
public class RequestsCatalogApi {

  @GetMapping("/{folderName}")
  public ResponseWrapper<RequestsCatalog> getFolderService(@PathVariable String folderName) {
    return genericSuccessResponse(new RequestsCatalog().setFolderName(folderName));
  }
}
