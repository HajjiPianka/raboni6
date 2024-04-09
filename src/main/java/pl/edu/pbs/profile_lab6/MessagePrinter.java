package pl.edu.pbs.profile_lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pbs.profile_lab6.prof.MessageProducer;

@Service
public class MessagePrinter
{
    private final MessageProducer messageProducer; // zmieniony typ

    @Autowired
    public MessagePrinter(MessageProducer messageProducer)
    {
        this.messageProducer = messageProducer;
    }

    public void printMessage()
    {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }

}
