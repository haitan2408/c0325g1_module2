package mvc.service;

public class ServiceFactory {
    private ServiceFactory() {

    }

    public static IService getService(String serviceName) {
        switch (serviceName) {
            case "student":
                return StudentService.getInstance();
            case "teacher":
                return TeacherService.getInstance();
            default:
                return null;
        }
    }
}
