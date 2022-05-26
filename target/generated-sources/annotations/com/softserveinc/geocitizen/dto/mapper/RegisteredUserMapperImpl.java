package com.softserveinc.geocitizen.dto.mapper;

import com.softserveinc.geocitizen.dto.RegisteredUserDTO;
import com.softserveinc.geocitizen.entity.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-26T18:32:09+0300",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class RegisteredUserMapperImpl implements RegisteredUserMapper {

    @Override
    public RegisteredUserDTO userToRegisteredUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        RegisteredUserDTO registeredUserDTO = new RegisteredUserDTO();

        registeredUserDTO.setLogin( user.getLogin() );
        if ( user.getId() != null ) {
            registeredUserDTO.setId( user.getId() );
        }

        return registeredUserDTO;
    }
}
