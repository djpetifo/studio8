package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping
    public String home() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

        return html;
    }

    @ResponseBody
    @GetMapping("form")
    public String form() {
        String form = "<form method='post'>" +
                "Name: <input type='text' name='name'/><br>" +
                "First: <input type='text' name='first'/><br>" +
                "Second: <input type='text' name='second'/><br>" +
                "third: <input type='text' name='third'/><br>" +
                "<input type='submit' />" +
                "</form>";
        return form;
    }

    @ResponseBody
    @PostMapping("form")
    public String form(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>" + name + " skills to learn</h2>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>";

        return html;
    }
}
