package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// a repository gets at the data in the table.

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, String> {
}
