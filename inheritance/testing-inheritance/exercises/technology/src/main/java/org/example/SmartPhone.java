package org.example;

public class SmartPhone extends Computer {

    private String caseType;
    public SmartPhone(String kbType, String msType, String monType, String wifi, String caseType) {

        super(kbType,msType,monType, wifi);
        this.caseType = caseType;

    }

    public String getCaseType() {

        return this.caseType;

    }

    public void setCaseType(String caseType) {

        this.caseType = caseType;

    }

}
