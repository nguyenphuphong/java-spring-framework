package vn.kase.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.kase.spring.entity.Name;
import vn.kase.spring.exception.SampleException;
import vn.kase.spring.repository.NameRepository;

@Service
public class SampleService {
    @Autowired
    private NameRepository repository;

    public String getGreetingMessage(String name) {
        Optional<Name> nameOptional = repository.findOneByShortName(name);

        if (nameOptional.isPresent()) {
            return "Hello " + nameOptional.get().getFullName();
        }

        throw new SampleException("Can't find name: " + name);
    }
}
