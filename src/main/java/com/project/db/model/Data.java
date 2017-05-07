package com.project.db.model;

import java.sql.Date;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class Data {
    private String orgnazation;
    private int d_id;
    private Date dataTime;
    private int employmentDuringBookbuilding;
    private int employmentDuringInquiry;
    private String otherReason;
    private String typeOfEmployDeclining;
    private String mainReason;
    private String explainationOfMainReason;
    private String secondReason;;
    private String explainationOfSecondReason;
    private String thirdReason;
    private String explainationOfThirdReason;
    private int approveOrNot;


//ii
    public String getOrgnazation() {
        return orgnazation;
    }

    public void setOrgnazation(String orgnazation) {
        this.orgnazation = orgnazation;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public int getEmploymentDuringBookbuilding() {
        return employmentDuringBookbuilding;
    }

    public void setEmploymentDuringBookbuilding(int employmentDuringBookbuilding) {
        this.employmentDuringBookbuilding = employmentDuringBookbuilding;
    }

    public int getEmploymentDuringInquiry() {
        return employmentDuringInquiry;
    }

    public void setEmploymentDuringInquiry(int employmentDuringInquiry) {
        this.employmentDuringInquiry = employmentDuringInquiry;
    }

    public String getOtherReason() {
        return otherReason;
    }

    public void setOtherReason(String otherReason) {
        this.otherReason = otherReason;
    }

    public String getTypeOfEmployDeclining() {
        return typeOfEmployDeclining;
    }

    public void setTypeOfEmployDeclining(String typeOfEmployDeclining) {
        this.typeOfEmployDeclining = typeOfEmployDeclining;
    }

    public String getMainReason() {
        return mainReason;
    }

    public void setMainReason(String mainReason) {
        this.mainReason = mainReason;
    }

    public String getExplainationOfMainReason() {
        return explainationOfMainReason;
    }

    public void setExplainationOfMainReason(String explainationOfMainReason) {
        this.explainationOfMainReason = explainationOfMainReason;
    }

    public String getSecondReason() {
        return secondReason;
    }

    public void setSecondReason(String secondReason) {
        this.secondReason = secondReason;
    }

    public String getExplainationOfSecondReason() {
        return explainationOfSecondReason;
    }

    public void setExplainationOfSecondReason(String explainationOfSecondReason) {
        this.explainationOfSecondReason = explainationOfSecondReason;
    }

    public String getThirdReason() {
        return thirdReason;
    }

    public void setThirdReason(String thirdReason) {
        this.thirdReason = thirdReason;
    }

    public String getExplainationOfThirdReason() {
        return explainationOfThirdReason;
    }

    public void setExplainationOfThirdReason(String explainationOfThirdReason) {
        this.explainationOfThirdReason = explainationOfThirdReason;
    }

    public int getApproveOrNot() {
        return approveOrNot;
    }

    public void setApproveOrNot(int approveOrNot) {
        this.approveOrNot = approveOrNot;
    }

    @Override
    public String toString() {
        return "Data{" +
                "orgnazation='" + orgnazation + '\'' +
                ", d_id=" + d_id +
                ", dataTime=" + dataTime +
                ", employmentDuringBookbuilding=" + employmentDuringBookbuilding +
                ", employmentDuringInquiry=" + employmentDuringInquiry +
                ", otherReason='" + otherReason + '\'' +
                ", typeOfEmployDeclining='" + typeOfEmployDeclining + '\'' +
                ", mainReason='" + mainReason + '\'' +
                ", explainationOfMainReason='" + explainationOfMainReason + '\'' +
                ", secondReason='" + secondReason + '\'' +
                ", explainationOfSecondReason='" + explainationOfSecondReason + '\'' +
                ", thirdReason='" + thirdReason + '\'' +
                ", explainationOfThirdReason='" + explainationOfThirdReason + '\'' +
                ", approveOrNot=" + approveOrNot +
                '}';
    }

    public void setAll(String orgnazation, int d_id, Date dataTime, int employmentDuringBookbuilding,
                       int employmentDuringInquiry, String otherReason, String typeOfEmployDeclining, String mainReason,
                       String explainationOfMainReason, String secondReason, String explainationOfSecondReason, String thirdReason,
                       String explainationOfThirdReason, int approveOrNot)
    {
        setOrgnazation(orgnazation);
        setD_id(d_id);
        setDataTime(dataTime);
        setEmploymentDuringBookbuilding(employmentDuringBookbuilding);
        setEmploymentDuringInquiry(employmentDuringInquiry);
        setOtherReason(otherReason);
        setTypeOfEmployDeclining(typeOfEmployDeclining);
        setMainReason(mainReason);
        setExplainationOfMainReason(explainationOfMainReason);
        setSecondReason(secondReason);
        setExplainationOfSecondReason(explainationOfSecondReason);
        setThirdReason(thirdReason);
        setExplainationOfThirdReason(explainationOfThirdReason);
        setApproveOrNot(approveOrNot);
    }
}
