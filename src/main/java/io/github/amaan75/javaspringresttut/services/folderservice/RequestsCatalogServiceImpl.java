package io.github.amaan75.javaspringresttut.services.folderservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/** @author amangulati (@amaan75.github) created on: 04/07/20 */
@Service
@Slf4j
@RequiredArgsConstructor
public class RequestsCatalogServiceImpl implements RequestsCatalogService {
  private final RequestsCatalogRepo requestsCatalogRepo;

  @PostConstruct
  public void init() {
    requestsCatalogRepo.save(new Person("id1", "aman", 25));
    requestsCatalogRepo.save(new Person("id2", "xyz", 27));
  }

  @Override
  public Person findOne() {
    final Person person = requestsCatalogRepo.findPersonById("id1");
    System.out.println(person);
    return person;
  }
}
