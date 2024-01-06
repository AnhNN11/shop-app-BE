package com.example.shopapp.services;

import com.example.shopapp.dtos.UserDTO;
import com.example.shopapp.exceptions.DataNotFoundException;
import com.example.shopapp.models.Role;
import com.example.shopapp.models.User;
import com.example.shopapp.repositories.RoleRepository;
import com.example.shopapp.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private  UserRepository userRepository;
    private  RoleRepository roleRepository;

    @Override
    public User createUser(UserDTO userDTO) throws DataNotFoundException {
        String phoneNumber = userDTO.getPhoneNumber();
        if (userRepository.existByPhoneNumber(phoneNumber))
            throw new DataIntegrityViolationException("Phone exist in DB");
        User newUser = User.builder()
                .fullName(userDTO.getFullName())
                .phoneNumber(userDTO.getPhoneNumber())
                .password(userDTO.getPassword())
                .address(userDTO.getAddress())
                .dateOfBirth(userDTO.getDateOfBirth())
                .facebookAccountId(userDTO.getFacebookAccountId())
                .googleAccountId(userDTO.getGoogleAccountId())
                .build();
        Role role;

            role = roleRepository.findById(userDTO.getRoleId()).orElseThrow(() -> new DataNotFoundException("Role not found"));

        newUser.setRole(role);
//        Kiểm tra nếu có accountId, không yêu cầu password
        if (userDTO.getFacebookAccountId()==0&& userDTO.getGoogleAccountId()==0){
            String password =userDTO.getPassword();
//            String encodePassword= passwordEndc;
//            newUser.setPassword(encodePassword);
        }
//        userDTO.getRoleId()
        return userRepository.save(newUser);
    }

    @Override
    public String login(String phoneNumber, String phone) {
       //Spring Security
        return null;
    }
}
