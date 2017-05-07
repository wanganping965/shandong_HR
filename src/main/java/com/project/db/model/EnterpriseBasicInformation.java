package com.project.db.model;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class EnterpriseBasicInformation {

    private String userName;
    private String area;
    private String organization;
    private String enterpriseName;
    private String enterpriseProperty;
    private String industryInvolved;
    private String business;
    private String contacts;
    private String adrress;
    private String postalcode;
    private String phone;
    private String fax;
    private String email;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseProperty() {
        return enterpriseProperty;
    }

    public void setEnterpriseProperty(String enterpriseProperty) {
        this.enterpriseProperty = enterpriseProperty;
    }

    public String getIndustryInvolved() {
        return industryInvolved;
    }

    public void setIndustryInvolved(String industryInvolved) {
        this.industryInvolved = industryInvolved;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EnterpriseBasicInformation{" +
                "userName='" + userName + '\'' +
                ", area='" + area + '\'' +
                ", organization='" + organization + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", enterpriseProperty='" + enterpriseProperty + '\'' +
                ", industryInvolved='" + industryInvolved + '\'' +
                ", business='" + business + '\'' +
                ", contacts='" + contacts + '\'' +
                ", adrress='" + adrress + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setAll(String userName, String area, String organization, String enterpriseName, String enterpriseProperty,
                       String industryInvolved, String business,String contacts,
                       String adrress, String postalcode, String phone, String fax, String email)
    {
        setUserName(userName);
        setArea(area);
        setOrganization(organization);
        setEnterpriseName(enterpriseName);
        setEnterpriseProperty(enterpriseProperty);
        setIndustryInvolved(industryInvolved);
        setBusiness(business);
        setContacts(contacts);
        setAdrress(adrress);
        setPostalcode(postalcode);
        setPhone(phone);
        setFax(fax);
        setEmail(email);
    }
}
