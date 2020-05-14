package com.udea.butchershop.butchershop.dto;

import com.udea.butchershop.butchershop.constants.ValidatorConstants;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDto {
	
	private Long id;

	@NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_EMAIL, max = ValidatorConstants.MAX_SIZE_EMAIL, message = ValidatorConstants.BAD_SIZE_EMAIL_MESSSAGE)
    @Pattern(regexp = ValidatorConstants.REGEX_EMAIL, message = ValidatorConstants.BAD_FORMAT_EMAIL_MESSSAGE)
    private String email;

    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_PASSWORD, max = ValidatorConstants.MAX_SIZE_PASSWORD, message = ValidatorConstants.BAD_SIZE_PASSWORD_MESSAGE)
    private String password;
   
    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String name;

    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_LASTNAME, max = ValidatorConstants.MAX_SIZE_LASTNAME, message = ValidatorConstants.BAD_SIZE_LASTNAME_MESSSAGE)
    private String lastname;
    
    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_ADDRESS, max = ValidatorConstants.MAX_SIZE_ADDRESS, message = ValidatorConstants.BAD_SIZE_ADDRESS_MESSSAGE)
    private String address;
    
    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_TELEPHONE, max = ValidatorConstants.MAX_SIZE_TELEPHONE, message = ValidatorConstants.BAD_SIZE_TELEPHONE_MESSSAGE)
    private String telephone;
    
    public CustomerDto() {
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

}
