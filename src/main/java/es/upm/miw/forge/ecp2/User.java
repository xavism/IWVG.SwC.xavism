package es.upm.miw.forge.ecp2;

public class User {
    private String name;

    private String familyName;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number, String name, String familyName) {
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }
    
    public void nameToUpperCase() {
        String upperCaseName = this.getName().toUpperCase();
        String upperCaseFamilyName = this.getFamilyName().toUpperCase();
        String upperCaseFullName = upperCaseName + " " + upperCaseFamilyName;
        
        return upperCaseFullName
    }
    
}