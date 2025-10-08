package dto.mapper.api;

import dto.mapper.dto.StudentDto;
import dto.mapper.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StudentApi {

    private final StudentService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody StudentDto studentDto){
        service.createStudent(studentDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
