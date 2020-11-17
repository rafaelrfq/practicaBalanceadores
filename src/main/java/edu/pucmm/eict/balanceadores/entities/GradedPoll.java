package edu.pucmm.eict.balanceadores.entities;

import edu.pucmm.eict.balanceadores.entities.security.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class GradedPoll implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int valueQuestion1;
    private int valueQuestion2;
    private int valueQuestion3;
    private String valueQuestion4;
    private LocalDate dateCreated;

    @ManyToOne
    private User userGradedPoll;

    public GradedPoll() { }

    public GradedPoll(int v1, int v2, int v3, String v4, User user){
        this.valueQuestion1 = v1;
        this.valueQuestion2 = v2;
        this.valueQuestion3 = v3;
        this.valueQuestion4 = v4;
        this.userGradedPoll = user;
        this.dateCreated = LocalDate.now();
    }

    public int getValueQuestion1() { return valueQuestion1; }

    public void setValueQuestion1(int valueQuestion1) { this.valueQuestion1 = valueQuestion1; }

    public int getValueQuestion2() { return valueQuestion2; }

    public void setValueQuestion2(int valueQuestion2) { this.valueQuestion2 = valueQuestion2; }

    public int getValueQuestion3() { return valueQuestion3; }

    public void setValueQuestion3(int valueQuestion3) { this.valueQuestion3 = valueQuestion3; }

    public String getValueQuestion4() { return valueQuestion4; }

    public void setValueQuestion4(String valueQuestion4) { this.valueQuestion4 = valueQuestion4; }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public LocalDate getDateCreated() { return dateCreated; }

    public void setDateCreated(LocalDate dateCreated) { this.dateCreated = dateCreated; }

    public User getUserGradedPoll() { return userGradedPoll; }

    public void setUserGradedPoll(User userGradedPoll) { this.userGradedPoll = userGradedPoll; }
}
