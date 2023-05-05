package Demo.MainDemo.Services;
import Demo.MainDemo.Models.Message;

import java.util.List;

public interface MessageService {
    List<Message> listAllMessages();
    Message createMessage(Message message);

    void deleteMessage(String id);


}
