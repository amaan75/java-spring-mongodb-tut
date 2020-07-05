package io.github.amaan75.javaspringresttut.apis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper;
import io.github.amaan75.javaspringresttut.services.folderservice.RequestsCatalogService;
import io.github.amaan75.javaspringresttut.services.folderservice.beans.RequestsCatalog;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper.genericSuccessResponse;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@RestController
@Slf4j
@RequestMapping("/folders")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class RequestsCatalogApi {
  private final RequestsCatalogService catalogService;

  @GetMapping("/{folderName}")
  public ResponseWrapper<RequestsCatalog> getFolderService(@PathVariable String folderName) {
    return genericSuccessResponse(new RequestsCatalog().setFolderName(folderName));
  }

  @GetMapping("/test")
  public ResponseWrapper addFolders(
      @RequestHeader(value = "api-key", required = false) String apiKey,
      @RequestParam(required = false) String from)
      throws JsonProcessingException {
    System.out.println(apiKey);
    ObjectMapper mapper = new ObjectMapper();
    return genericSuccessResponse(true);
  }
}
