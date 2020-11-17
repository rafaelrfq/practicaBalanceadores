package edu.pucmm.eict.balanceadores.entities;

public class Poll {

    private String question1;
    private String question2;
    private String question3;
    private String question4;

    public Poll(){
        this.question1 = "¿Las charlas donde usted participó cumplieron con sus expectativas?";
        this.question2 = "¿Los expositores mostraron tener dominio del tema?";
        this.question3 = "¿Las instalaciones del evento fueron confortables para usted?";
        this.question4 = "¿Tiene algún comentario para los organizadores?";
    }

    public String getquestion1() { return question1; }

    public String getquestion2() { return question2; }

    public String getquestion3() { return question3; }

    public String getquestion4() { return question4; }
}
