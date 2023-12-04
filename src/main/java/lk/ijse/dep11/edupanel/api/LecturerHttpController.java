package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @PostMapping
    public void createNewLecturer() {
        System.out.println("createNewLecturer()");
    }
    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetail() {
        System.out.println("updateLecturerDetail()");
    }
    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer() {
        System.out.println("deleteLecturer()");
    }
    @GetMapping
    public void getAllLecturers() {
        System.out.println("getAllLecturers()");
    }
}
