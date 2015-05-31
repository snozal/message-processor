package msgProcessor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    public static final String MESSAGES_PATH = "/messages";

    public static final String NUMBER = "/number";

	@Autowired
	MessageDAO messagesCollection;
    
	@RequestMapping(value = MESSAGES_PATH, method = RequestMethod.GET)
	public List<TradeMessage> getMessages() throws Exception
	{
		return messagesCollection.findAll();
	}

	@RequestMapping(value = MESSAGES_PATH + NUMBER, method = RequestMethod.GET)
	public long getNumberMessages() throws Exception
	{
		return messagesCollection.count();
	}

    @RequestMapping(value = MESSAGES_PATH, method = RequestMethod.POST)
    public void addMessage(@RequestBody TradeMessage message) {

		messagesCollection.insert(message);
    }
}
