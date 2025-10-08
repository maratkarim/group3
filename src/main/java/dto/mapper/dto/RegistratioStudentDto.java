package dto.mapper.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistratioStudentDto {

    private String firstName;
    private String secondName;
    private String login;
    private String password;
    private String repeatPassword;

}
