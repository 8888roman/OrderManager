package pl.trinitec.form;



import org.hibernate.validator.constraints.NotEmpty;

public class ProjectForm {


    @NotEmpty(message = "Wpisz nazwę")
    private String projectNumber;

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    @Override
    public String toString() {
        return "ProjectForm{" +
                "projectNumber='" + projectNumber + '\'' +
                '}';
    }
}
