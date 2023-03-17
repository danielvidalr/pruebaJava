package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IETCFacade;
import mx.com.axity.services.service.IETCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ETCFacade implements IETCFacade {

    @Autowired
    private IETCService etcService;

    public List<UserTO> getAllUsers() {
        return this.etcService.getUsers();
    }
}
