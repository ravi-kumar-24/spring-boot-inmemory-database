package com.ravi.springbootinmemorydatabase.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String teamName;

    public Users(){

    }

    public Users(int userId, String userName, String teamName) {
        this.userId = userId;
        this.userName = userName;
        this.teamName = teamName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return userId == user.userId &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(teamName, user.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, teamName);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
