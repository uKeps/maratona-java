package maratona.javacore.Kenum.domain;

public enum CustomerType {
    NATURAL_PERSON(1, "Natural Person"),
    LEGAL_PERSON(2, "Legal Person");

    public final int VALUE;
    private String nameReport;
    CustomerType(int value, String nameReport) {
        this.VALUE = value;
        this.nameReport = nameReport;
    }

    public static CustomerType CustomerTypeByReportName(String reportName){
        for (CustomerType customerType : values()) {
            if(customerType.getNameReport().equals(reportName))
                return customerType;
        }
        return null;
    }

    public String getNameReport() {
        return nameReport;
    }
}
