package com.loiye.art.controller;

import com.loiye.art.service.NoteService;
import com.loiye.core.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/huaishu/ajax/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/wzwj")
    public Result getWzwj() {
        return noteService.getWzwj();
    }

    @PostMapping("/wzwj/insertWjTitle")
    public Result insertWjTitle(String bt) {
        return noteService.insertWjTitle(bt);
    }

}
