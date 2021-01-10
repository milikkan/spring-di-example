package dev.milikkan.springdiexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18NService")
@Profile({"ES", "default"})
public class I18NSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo";
    }
}
