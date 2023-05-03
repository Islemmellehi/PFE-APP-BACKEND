package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Message;
import Demo.MainDemo.Repositories.Messagerepos;

import Demo.MainDemo.Services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MessageServiceImp implements MessageService {
    @Autowired

    private Messagerepos Crepository;
    public List<Message> listAllMessages(){
        return Crepository.findAll();
    }
}
