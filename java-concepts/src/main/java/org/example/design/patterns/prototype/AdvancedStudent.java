package org.example.design.patterns.prototype;

public class AdvancedStudent extends Student {
    private String companyName;

    public AdvancedStudent(String companyName) {
        this.companyName=companyName;
    }
    private AdvancedStudent(AdvancedStudent advancedStudent) {
        super(advancedStudent);
        this.companyName=advancedStudent.companyName;
    }

    @Override
    public AdvancedStudent clone() {
        return new AdvancedStudent(this);
    }
}
