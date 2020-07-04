package io.github.amaan75.javaspringresttut.apis;

import io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper;
import io.github.amaan75.javaspringresttut.services.folderservice.beans.Folder;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static io.github.amaan75.javaspringresttut.services.common.beans.ResponseWrapper.genericSuccessResponse;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@RestController
@Slf4j
@RequestMapping("/folders")
public class FolderApi {

  @GetMapping("/{folderId}")
  public ResponseWrapper<Folder> getFolderService(@PathVariable String folderId) {
    return genericSuccessResponse(new Folder(ObjectId.get().toHexString(), "Temp Folder"));
  }
}
