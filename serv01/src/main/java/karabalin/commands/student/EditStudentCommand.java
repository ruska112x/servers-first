package karabalin.commands.student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import karabalin.commands.ICommand;
import karabalin.server.controllers.StudentController;
import karabalin.server.requests.student.EditStudentRequest;

public class EditStudentCommand implements ICommand {
    private final StudentController studentController;

    private final ObjectMapper mapper;

    public EditStudentCommand(StudentController studentController, ObjectMapper mapper) {
        this.studentController = studentController;
        this.mapper = mapper;
    }

    @Override
    public String execute(String json) throws JsonProcessingException {
        return mapper.writeValueAsString(studentController.editStudent(mapper.readValue(json, EditStudentRequest.class)));
    }
}
