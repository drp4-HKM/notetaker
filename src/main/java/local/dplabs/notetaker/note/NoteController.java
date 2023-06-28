package local.dplabs.notetaker.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/add")
    public String add(@RequestBody Note aNote) {
        noteService.saveNote(aNote);
        return "A new 'note' is added.";
    }


    


}
