package com.marvellous.MavellousPortal.Repository;

import com.marvellous.MavellousPortal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
