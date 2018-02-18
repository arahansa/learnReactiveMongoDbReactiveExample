package guru.springframework.mogodbreactivestockquoteservice.repositories;

import guru.springframework.mogodbreactivestockquoteservice.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;

public interface QuoteRepository extends ReactiveMongoRepository<Quote, String>{

    @Tailable
    Flux<Quote> findWithTailableCursorBy();
}
