package data.basic;

import java.time.LocalDate;

public class BasicExaminationData {
    private String patientName;
    private String patientId;
    private LocalDate examinationDate;

    public void setPatientName(String name) {
        this.patientName = name;
    }

    public String getPatientName() {
        return this.patientName;
    }


}
