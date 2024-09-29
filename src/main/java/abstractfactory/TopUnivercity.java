package abstractfactory;


public class TopUnivercity extends AbstractCourseFactory {
    @Override
    public Fees getFees(String courseType) {
        switch (courseType) {
            case "B.Tech":
                return new Fees(200000);
            case "M.Tech":
                return new Fees(100000);
            case "MBA":
                return new Fees(50000);
            default:
                return new Fees(0);
        }
    }

    @Override
    public AdmitCard getAdmitCard(String courseType) {
        switch (courseType) {
            case "B.Tech":
                return new AdmitCard("B.Tech", "TopUnivercity");
            case "M.Tech":
                return new AdmitCard("M.Tech", "TopUnivercity");
            case "MBA":
                return new AdmitCard("MBA", "TopUnivercity");
            default:
                return new AdmitCard("Unknown", "Unknown");
        }
    }
}
