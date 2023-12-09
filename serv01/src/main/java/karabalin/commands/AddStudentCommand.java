package karabalin.commands;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import karabalin.server.controllers.StudentController;
import karabalin.server.requests.student.AddStudentRequest;

public class AddStudentCommand implements ICommand {
    private final StudentController studentController;

    private final ObjectMapper mapper;

    public AddStudentCommand(StudentController studentController, ObjectMapper mapper) {
        this.studentController = studentController;
        this.mapper = mapper;
    }

    @Override
    public String execute(String json) throws JsonProcessingException {
        return mapper.writeValueAsString(studentController.addStudent(mapper.readValue(json, AddStudentRequest.class)));
    }
}
