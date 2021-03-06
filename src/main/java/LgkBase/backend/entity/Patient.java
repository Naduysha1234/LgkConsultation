package LgkBase.backend.entity;

import java.util.Date;

/**
 * Created by user on 16.03.2016.
 */
public class Patient {
    public enum Props{
        n
        ,name
        ,surname
        ,patronymic
        ,sex
        ,birthday
    }

    Long n;
    String name; //(255)
    String surname; //(255)
    String patronymic; //(255)
    String sex;
    Date birthday;
    int case_history_num;
    String diagnosis;

    public Long getN() {
        return n;
    }

    public void setN(Long n) {
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getCase_history_num() {
        return case_history_num;
    }

    public void setCase_history_num(int case_history_num) {
        this.case_history_num = case_history_num;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "n=" + n +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                "}\n";
    }


    public static final String relationName = "BAS_PEOPLE";
}
