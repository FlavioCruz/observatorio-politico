package br.flavio.politialobservatory.repository;

import br.flavio.politialobservatory.model.tweet.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TweetRepository extends MongoRepository<Tweet, String> {
}
