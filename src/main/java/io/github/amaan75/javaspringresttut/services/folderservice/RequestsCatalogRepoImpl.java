package io.github.amaan75.javaspringresttut.services.folderservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/** @author amangulati (@amaan75.github) created on: 05/07/20 */
@Repository
@Slf4j
@RequiredArgsConstructor
class RequestsCatalogRepoImpl implements RequestsCatalogRepo {
  private final MongoTemplate mongoTemplate;

  @Override
  public Person save(Person person) {
    return mongoTemplate.save(person);
  }

  @Override
  public Person findPersonById(String name) {
    Criteria criteria = Criteria.where("name").is(name);
    return mongoTemplate.findOne(Query.query(criteria), Person.class);
  }
}
