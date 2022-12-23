package mk.finki.ukim.mk.lab.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class BalloonController {
    public String getBalloonsPage(@RequestParam(required = false) String error, Model model);

    public String saveBalloon();

    public String deleteBalloon(@PathVariable Long id);
}
