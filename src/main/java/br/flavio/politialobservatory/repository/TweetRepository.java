package br.flavio.politialobservatory.repository;

import br.flavio.politialobservatory.model.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TweetRepository extends MongoRepository<Tweet, String> {
}
