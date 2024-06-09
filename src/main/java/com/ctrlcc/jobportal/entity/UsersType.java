package com.ctrlcc.jobportal.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_type")
public class UsersType {
        
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)    
    private int userTypeId;

    private String userTypeName;

    @OneToMany(targetEntity = Users.class, mappedBy = "userTypeId", cascade = CascadeType.ALL)
    private List<Users> users;  

    public UsersType(int userTypeId, String userTypeName, List<Users> users)    {
        this.userTypeId = userTypeId;
        this.userTypeName = userTypeName;
        this.users = users;
    }

    public UsersType()  {
        
    }
    /**
     * @return int return the userTypeId
     */
    public int getUserTypeId() {
        return userTypeId;
    }

    /**
     * @param userTypeId the userTypeId to set
     */
    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * @return String return the userTypeName
     */
    public String getUserTypeName() {
        return userTypeName;
    }

    /**
     * @param userTypeName the userTypeName to set
     */
    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    /**
     * @return List<Users> return the users
     */
    public List<Users> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString()    {
        return "UsersType{" +
                "userTypeId=" + userTypeId    +
                ", userTypeName=" + userTypeName  +
                ", users=" + users    +
                "}";
    }
}