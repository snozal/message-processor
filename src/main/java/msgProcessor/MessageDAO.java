package msgProcessor;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageDAO extends MongoRepository<TradeMessage, String> {
	
}
