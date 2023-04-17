package kg.internship.ships.controllers;

import kg.internship.ships.models.dto.ClassNames;
import kg.internship.ships.services.ClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/class")
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping("/battle_result")
    public ResponseEntity<?> getClassNameByResult(@RequestParam String result){
        List<ClassNames> classNamesList = classService.findClassNameByResult(result);
        if(!classNamesList.isEmpty())
            return ResponseEntity.ok(classNamesList);
        else return ResponseEntity.noContent().build();
    }
}
