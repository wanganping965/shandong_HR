package com.project.model;

import java.sql.Date;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class Data {
    private String organizationCode;
    private int d_id;
    private Date dataTime;
    private int employmentDuringBookbuilding;
    private int employmentDuringInquiry;
    private String otherReason;
    private String typeOfEmployDeclining;
    private String mainReason;
    private String explanationOfMainReason;
    private String secondReason;;
    private String explanationOfSecondReason;
    private String thirdReason;
    private String explanationOfThirdReason;
    private int approveOrNot;


//ii
    public String getOrgnazationCode() {
        return organizationCode;
    }

    public void setOrgnazationCode(String organizationCode) {
        this.organizationCode = organizationCode;
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
        return explanationOfMainReason;
    }

    public void setExplanationOfMainReason(String explanationOfMainReason) {
        this.explanationOfMainReason = explanationOfMainReason;
    }

    public String getSecondReason() {
        return secondReason;
    }

    public void setSecondReason(String secondReason) {
        this.secondReason = secondReason;
    }

    public String getExplainationOfSecondReason() {
        return explanationOfSecondReason;
    }

    public void setExplanationOfSecondReason(String explainationOfSecondReason) {
        this.explanationOfSecondReason = explainationOfSecondReason;
    }

    public String getThirdReason() {
        return thirdReason;
    }

    public void setThirdReason(String thirdReason) {
        this.thirdReason = thirdReason;
    }

    public String getExplainationOfThirdReason() {
        return explanationOfThirdReason;
    }

    public void setExplanationOfThirdReason(String explanationOfThirdReason) {
        this.explanationOfThirdReason = explanationOfThirdReason;
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
                "organizationCode='" + organizationCode + '\'' +
                ", d_id=" + d_id +
                ", dataTime=" + dataTime +
                ", employmentDuringBookbuilding=" + employmentDuringBookbuilding +
                ", employmentDuringInquiry=" + employmentDuringInquiry +
                ", otherReason='" + otherReason + '\'' +
                ", typeOfEmployDeclining='" + typeOfEmployDeclining + '\'' +
                ", mainReason='" + mainReason + '\'' +
                ", explanationOfMainReason='" + explanationOfMainReason + '\'' +
                ", secondReason='" + secondReason + '\'' +
                ", explanationOfSecondReason='" + explanationOfSecondReason + '\'' +
                ", thirdReason='" + thirdReason + '\'' +
                ", explanationOfThirdReason='" + explanationOfThirdReason + '\'' +
                ", approveOrNot=" + approveOrNot +
                '}';
    }

    public void setAll(String organizationCode, int d_id, Date dataTime, int employmentDuringBookbuilding,
                       int employmentDuringInquiry, String otherReason, String typeOfEmployDeclining, String mainReason,
                       String explanationOfMainReason, String secondReason, String explanationOfSecondReason, String thirdReason,
                       String explanationOfThirdReason, int approveOrNot)
    {
        setOrgnazationCode(organizationCode);
        setD_id(d_id);
        setDataTime(dataTime);
        setEmploymentDuringBookbuilding(employmentDuringBookbuilding);
        setEmploymentDuringInquiry(employmentDuringInquiry);
        setOtherReason(otherReason);
        setTypeOfEmployDeclining(typeOfEmployDeclining);
        setMainReason(mainReason);
        setExplanationOfMainReason(explanationOfMainReason);
        setSecondReason(secondReason);
        setExplanationOfSecondReason(explanationOfSecondReason);
        setThirdReason(thirdReason);
        setExplanationOfThirdReason(explanationOfThirdReason);
        setApproveOrNot(approveOrNot);
    }
}
