package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreeringService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - from Primary Bean";
    }
}
