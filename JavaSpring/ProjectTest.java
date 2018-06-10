public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("openLibrary");
        Project project3 = new Project("iLibrary", "This is online Library");
        
        System.out.println(project1.projectName());
        System.out.println(project1.projectDescription());

        System.out.println(project2.projectName());
        System.out.println(project2.projectDescription());

        System.out.println(project3.projectName());
        System.out.println(project3.projectDescription());

        project1.setName("Ice Cream");
        project1.setDescription("Collections of Unique and Impressive Ice Cream");

        project2.setDescription("Library for everyoe");
        project3.setName("OnlineLibrary");

        System.out.println("============================");
        System.out.println(project1.projectName());
        System.out.println(project1.projectDescription());

        System.out.println(project2.projectName());
        System.out.println(project2.projectDescription());

        System.out.println(project3.projectName());
        System.out.println(project3.projectDescription());
        System.out.println("============================");
        System.out.println("============================");
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}