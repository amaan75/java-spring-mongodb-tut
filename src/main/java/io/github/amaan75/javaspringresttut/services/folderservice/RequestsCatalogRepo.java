package io.github.amaan75.javaspringresttut.services.folderservice;

/** @author amangulati (@amaan75.github) created on: 05/07/20 */
interface RequestsCatalogRepo {

    Person save(Person person);

    Person findPersonById(String id);
}
