package guru.springframework.mappers;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by jt on 2018-12-09.
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
