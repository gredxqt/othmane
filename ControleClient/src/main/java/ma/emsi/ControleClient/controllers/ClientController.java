package ma.emsi.ControleClient.controllers;


import ma.emsi.ControleClient.entities.Client;
import ma.emsi.ControleClient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping
    public List<Client> findAll(){
        return service.findAll();
    }

    public Client findById(@PathVariable long id) throws Exception{
        return service.findById(id);
    }

    public void save(@RequestBody Client client){
        service.addClient(client);
    }

}
