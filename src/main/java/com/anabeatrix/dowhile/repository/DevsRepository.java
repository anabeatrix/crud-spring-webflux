package com.anabeatrix.dowhile.repository;

import com.anabeatrix.dowhile.model.Devs;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevsRepository  extends ReactiveMongoRepository<Devs, String> {

}
