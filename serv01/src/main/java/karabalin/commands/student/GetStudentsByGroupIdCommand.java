package karabalin.commands.student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import karabalin.commands.ICommand;
import karabalin.server.controllers.StudentController;
import karabalin.server.requests.IdRequest;

public class GetStudentsByGroupIdCommand implements ICommand {

    private final StudentController studentController;

    private final ObjectMapper mapper;

    public GetStudentsByGroupIdCommand(StudentController studentController, ObjectMapper mapper) {
        this.studentController = studentController;
        this.mapper = mapper;
    }

    @Override
    public String executeToJSON(String json) throws JsonProcessingException {
        return mapper.writeValueAsString(studentController.getStudentsByGroupId(mapper.readValue(json, IdRequest.class)));
    }
}
