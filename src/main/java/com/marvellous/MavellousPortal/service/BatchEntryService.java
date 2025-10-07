package com.marvellous.MavellousPortal.service;

import com.marvellous.MavellousPortal.Entity.BatchEntry;
import com.marvellous.MavellousPortal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository ;

    //C : CREATE
    //POST
    public void saveEntry(BatchEntry batchEntry)

    {
        batchEntryRepository.save(batchEntry);
    }

    public List<BatchEntry> getAll()

    {
        return batchEntryRepository.findAll();
    }

    public Optional<BatchEntry> findById(ObjectId id)

    {
        return batchEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id)

    {
        batchEntryRepository.deleteById(id);
    }

    public BatchEntry updateById(ObjectId id, BatchEntry myentry)
    {
        myentry.setId(id);
        return batchEntryRepository.save(myentry);
    }


}
