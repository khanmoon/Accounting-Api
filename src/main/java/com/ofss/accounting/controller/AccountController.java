package com.ofss.accounting.controller;

import com.ofss.accounting.dto.AccountDto;
import com.ofss.accounting.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RepositoryRestController
@Slf4j
public class AccountController {

    private final AccountRepository repository;

    @Autowired
    public AccountController(AccountRepository repo) {
        repository = repo;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/accounts")
    public
    ResponseEntity<?> saveWithParent(@RequestBody AccountDto accountDto) {
//        List<String> producers = repository.listProducers();
//
//        //
//        // do some intermediate processing, logging, etc. with the producers
//        //
//
//        CollectionModel<String> resources = CollectionModel.of(producers);
//
//        resources.add(linkTo(methodOn(AccountController.class).getName()).withSelfRel());
//
//        // add other links as needed
//        return ResponseEntity.ok(resources);
        log.info("parentAccount -> {}",accountDto.getParentAccount().getName());
        return ResponseEntity.status(HttpStatus.OK).build();

    }

}
