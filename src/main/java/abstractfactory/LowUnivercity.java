package abstractfactory;


public class LowUnivercity extends AbstractCourseFactory {
    @Override
    public Fees getFees(String courseType) {
        switch (courseType) {
            case "B.Tech":
                return new Fees(100000);
            case "M.Tech":
                return new Fees(50000);
            case "MBA":
                return new Fees(20000);
            default:
                return new Fees(0);
        }
    }

    @Override
    public AdmitCard getAdmitCard(String courseType) {
        switch (courseType) {
            case "B.Tech":
                return new AdmitCard("B.Tech", "LowUnivercity");
            case "M.Tech":
                return new AdmitCard("M.Tech", "LowUnivercity");
            case "MBA":
                return new AdmitCard("MBA", "LowUnivercity");
            default:
                return new AdmitCard("Unknown", "Unknown");
        }
    }
}
