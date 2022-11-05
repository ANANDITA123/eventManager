package com.advait.projects.eventManager.apis.controller;


import com.advait.projects.eventManager.apis.constant.Type;
import com.advait.projects.eventManager.apis.entity.request.EventRequest;
import com.advait.projects.eventManager.apis.entity.request.SearchType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/v1.0")
public interface EventManagerController<T> {

    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    public ResponseEntity<T> generate(@RequestBody EventRequest request );

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ResponseEntity<T> get(@RequestBody SearchType searchType);


}
