package net.rborulchenko.creational.factoryMethod;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperBySpeciality("Java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory getDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
